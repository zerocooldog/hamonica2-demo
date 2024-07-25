package kr.co.pionnet.hamonica2.zconfiguration.jpa;

import com.querydsl.jpa.impl.JPAQueryFactory;
import io.hypersistence.utils.spring.repository.BaseJpaRepositoryImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import kr.co.pionnet.butterfly2.core.util.UtilObject;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Map;

/**
 * <pre>
 *  JPA 자체에는 "save" 메서드라는 이름이 없다.
 *  BaseJpaRepositoryImpl 클래스는 Spring Data Jpa 사용시 SimpleJpaRepository를 대체 한다.
 *  실제 hibernate6버전 이상부터는 save메소드를 deprecated 하였으며 추후에 삭제 될 예정이다.
 *
 *  링크 : <a href='https://vladmihalcea.com/best-spring-data-jparepository'>BaseJpaRepositoryImpl 사용해야 하는 이유에 대한 설명</a>
 *  </pre>
 */
@Lazy
@Slf4j
@Configuration
@EnableJpaRepositories(
		basePackages = {
                "kr.co.pionnet.hamonica2.*.*.repository.master.**"
//                "kr.co.pionnet.hamonica2.*.*.*.repository.master.**"
        },    //repository package
		repositoryBaseClass = BaseJpaRepositoryImpl.class,
		entityManagerFactoryRef = JpaMasterConfig.ENTITY_MANAGER)
public class JpaMasterConfig {

	public static final String ENTITY_MANAGER = "hmc2-entity-manager";
	public static final String QUERY_FACTORY = "hmc2-query-factory";

	@Bean
	@ConfigurationProperties(prefix = "datasource.master.hibernate")
	public HamonicaJpaProperty jpaMasterProperty() {
		return new HamonicaJpaProperty();
	}

    /**
     * 멀티 Datasource를 사용하기 위하여 LocalContainerEntityManagerFactoryBean 생성
     * 멀티 Datasource중의 기본으로 적용되어야할 데이터 소스인것을 알리기 위하여 @Primary 어노테이션 선언.
     *
     * @param dataSource
     * @return LocalContainerEntityManagerFactoryBean
     */
    @Primary
	@Bean(ENTITY_MANAGER)
	LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(DataSource dataSource) {

		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPackagesToScan(
                "kr.co.pionnet.hamonica2.*.*.repository.master.entity.**",
                "kr.co.pionnet.hamonica2.*.*.*.repository.master.entity.**"
        );    //entity package
		factoryBean.setDataSource(dataSource);
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

		HamonicaJpaProperty hamonicaJpaProperty = jpaMasterProperty();

		Map<String,Object> propertyMap = (Map<String, Object>) UtilObject.convertValuesToMap(hamonicaJpaProperty);

		propertyMap.put(AvailableSettings.SHOW_SQL, hamonicaJpaProperty.isShowSql());
		propertyMap.put(AvailableSettings.FORMAT_SQL, hamonicaJpaProperty.isFormatSql());
		propertyMap.put(AvailableSettings.HIGHLIGHT_SQL, hamonicaJpaProperty.isHighlightSql());
		propertyMap.put(AvailableSettings.USE_SQL_COMMENTS, hamonicaJpaProperty.isUseSqlComments());
		propertyMap.put(AvailableSettings.HBM2DDL_AUTO, hamonicaJpaProperty.getDdlAuto());
		propertyMap.put(AvailableSettings.IMPLICIT_NAMING_STRATEGY, hamonicaJpaProperty.getNamingImplicitStrategy());
		propertyMap.put(AvailableSettings.PHYSICAL_NAMING_STRATEGY, hamonicaJpaProperty.getNamingPhysicalStrategy());

		factoryBean.setJpaPropertyMap(propertyMap);

		return factoryBean;
	}

	@Primary
	public PlatformTransactionManager transactionManager (
			@Qualifier(ENTITY_MANAGER) EntityManagerFactory primaryEntityManagerFactory
	) {
		return new JpaTransactionManager(primaryEntityManagerFactory);
	}

	@Primary
	@Bean(QUERY_FACTORY)
	JPAQueryFactory jpaQueryFactory(@Qualifier(ENTITY_MANAGER) EntityManager em) {
		return new JPAQueryFactory(em);
	}


}
