package kr.co.pionnet.hamonica2.shared.system.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QConfigurationInputItemEntity is a Querydsl query type for ConfigurationInputItemEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConfigurationInputItemEntity extends EntityPathBase<ConfigurationInputItemEntity> {

    private static final long serialVersionUID = 26877123L;

    public static final QConfigurationInputItemEntity configurationInputItemEntity = new QConfigurationInputItemEntity("configurationInputItemEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final StringPath configurationId = createString("configurationId");

    public final NumberPath<Long> configurationItemNo = createNumber("configurationItemNo", Long.class);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath description = createString("description");

    public final StringPath itemKey = createString("itemKey");

    public final StringPath itemName = createString("itemName");

    public final StringPath itemNameI18n = createString("itemNameI18n");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public QConfigurationInputItemEntity(String variable) {
        super(ConfigurationInputItemEntity.class, forVariable(variable));
    }

    public QConfigurationInputItemEntity(Path<? extends ConfigurationInputItemEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConfigurationInputItemEntity(PathMetadata metadata) {
        super(ConfigurationInputItemEntity.class, metadata);
    }

}

