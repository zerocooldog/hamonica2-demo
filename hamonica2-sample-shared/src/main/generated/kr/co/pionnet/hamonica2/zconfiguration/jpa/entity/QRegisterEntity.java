package kr.co.pionnet.hamonica2.zconfiguration.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRegisterEntity is a Querydsl query type for RegisterEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QRegisterEntity extends EntityPathBase<RegisterEntity> {

    private static final long serialVersionUID = -1650565408L;

    public static final QRegisterEntity registerEntity = new QRegisterEntity("registerEntity");

    public final DateTimePath<java.time.Instant> createdAt = createDateTime("createdAt", java.time.Instant.class);

    public final StringPath creatorId = createString("creatorId");

    public QRegisterEntity(String variable) {
        super(RegisterEntity.class, forVariable(variable));
    }

    public QRegisterEntity(Path<? extends RegisterEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegisterEntity(PathMetadata metadata) {
        super(RegisterEntity.class, metadata);
    }

}

