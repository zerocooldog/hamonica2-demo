package kr.co.pionnet.hamonica2.zconfiguration.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRegisterModifierEntity is a Querydsl query type for RegisterModifierEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QRegisterModifierEntity extends EntityPathBase<RegisterModifierEntity> {

    private static final long serialVersionUID = -458407017L;

    public static final QRegisterModifierEntity registerModifierEntity = new QRegisterModifierEntity("registerModifierEntity");

    public final DateTimePath<java.time.Instant> createdAt = createDateTime("createdAt", java.time.Instant.class);

    public final StringPath creatorId = createString("creatorId");

    public final DateTimePath<java.time.Instant> modifiedAt = createDateTime("modifiedAt", java.time.Instant.class);

    public final StringPath modifierId = createString("modifierId");

    public QRegisterModifierEntity(String variable) {
        super(RegisterModifierEntity.class, forVariable(variable));
    }

    public QRegisterModifierEntity(Path<? extends RegisterModifierEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegisterModifierEntity(PathMetadata metadata) {
        super(RegisterModifierEntity.class, metadata);
    }

}

