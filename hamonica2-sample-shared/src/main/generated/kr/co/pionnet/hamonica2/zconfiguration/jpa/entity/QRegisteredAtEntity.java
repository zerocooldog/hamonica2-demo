package kr.co.pionnet.hamonica2.zconfiguration.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRegisteredAtEntity is a Querydsl query type for RegisteredAtEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QRegisteredAtEntity extends EntityPathBase<RegisteredAtEntity> {

    private static final long serialVersionUID = -645536750L;

    public static final QRegisteredAtEntity registeredAtEntity = new QRegisteredAtEntity("registeredAtEntity");

    public final DateTimePath<java.time.Instant> createdAt = createDateTime("createdAt", java.time.Instant.class);

    public QRegisteredAtEntity(String variable) {
        super(RegisteredAtEntity.class, forVariable(variable));
    }

    public QRegisteredAtEntity(Path<? extends RegisteredAtEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegisteredAtEntity(PathMetadata metadata) {
        super(RegisteredAtEntity.class, metadata);
    }

}

