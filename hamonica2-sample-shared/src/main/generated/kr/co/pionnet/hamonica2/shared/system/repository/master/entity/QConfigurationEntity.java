package kr.co.pionnet.hamonica2.shared.system.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QConfigurationEntity is a Querydsl query type for ConfigurationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConfigurationEntity extends EntityPathBase<ConfigurationEntity> {

    private static final long serialVersionUID = 889325568L;

    public static final QConfigurationEntity configurationEntity = new QConfigurationEntity("configurationEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final StringPath configurationCategory = createString("configurationCategory");

    public final StringPath configurationCategoryName = createString("configurationCategoryName");

    public final StringPath configurationCategoryNameI18n = createString("configurationCategoryNameI18n");

    public final StringPath configurationId = createString("configurationId");

    public final StringPath configurationName = createString("configurationName");

    public final StringPath configurationNameI18n = createString("configurationNameI18n");

    public final StringPath configurationValue = createString("configurationValue");

    public final StringPath configurationVisibleId = createString("configurationVisibleId");

    public final ComparablePath<Character> configurationVisibleValue = createComparable("configurationVisibleValue", Character.class);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath inputType = createString("inputType");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath parentConfigurationId = createString("parentConfigurationId");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public QConfigurationEntity(String variable) {
        super(ConfigurationEntity.class, forVariable(variable));
    }

    public QConfigurationEntity(Path<? extends ConfigurationEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConfigurationEntity(PathMetadata metadata) {
        super(ConfigurationEntity.class, metadata);
    }

}

