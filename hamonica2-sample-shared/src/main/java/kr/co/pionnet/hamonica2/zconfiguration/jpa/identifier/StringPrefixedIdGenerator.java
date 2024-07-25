package kr.co.pionnet.hamonica2.zconfiguration.jpa.identifier;

import kr.co.pionnet.hamonica2.shared.util.UtilText;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.type.descriptor.java.LongJavaType;
import org.hibernate.type.descriptor.jdbc.BigIntJdbcType;
import org.hibernate.type.internal.NamedBasicTypeImpl;

import java.io.Serializable;
import java.util.Properties;

@Slf4j
public class StringPrefixedIdGenerator extends SequenceStyleGenerator {

    public static final String GENERATOR_NAME = "StringPrefixedIdGenerator";

    public static final String STRATEGY_PACKAGE = "kr.co.pionnet.hamonica2.zconfiguration.jpa.identifier.StringPrefixedIdGenerator";

    public static final String VALUE_PREFIX_PARAM = "prefix";
    public static final String LPAD_LENGTH_PARAM = "lpad_length";
    public static final String VALUE_PREFIX_DEFAULT = "";
    private String valuePrefix;
    private int lpadLength;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return valuePrefix + UtilText.leftPad(super.generate(session, object).toString(), lpadLength, "0");
    }

    @Override
    public void configure(org.hibernate.type.Type type, Properties params, org.hibernate.service.ServiceRegistry serviceRegistry) {
        super.configure(new NamedBasicTypeImpl<>(LongJavaType.INSTANCE, BigIntJdbcType.INSTANCE,"long"), params, serviceRegistry);
        valuePrefix = ConfigurationHelper.getString(VALUE_PREFIX_PARAM, params, VALUE_PREFIX_DEFAULT);
        lpadLength = ConfigurationHelper.getInt(LPAD_LENGTH_PARAM, params, 0);
    }


}