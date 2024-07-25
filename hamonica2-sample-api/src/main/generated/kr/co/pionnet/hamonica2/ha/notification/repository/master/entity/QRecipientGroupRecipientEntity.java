package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipientGroupRecipientEntity is a Querydsl query type for RecipientGroupRecipientEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipientGroupRecipientEntity extends EntityPathBase<RecipientGroupRecipientEntity> {

    private static final long serialVersionUID = 1682448245L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipientGroupRecipientEntity recipientGroupRecipientEntity = new QRecipientGroupRecipientEntity("recipientGroupRecipientEntity");

    public final QRecipientGroupRecipientId id;

    public final StringPath workspaceId = createString("workspaceId");

    public QRecipientGroupRecipientEntity(String variable) {
        this(RecipientGroupRecipientEntity.class, forVariable(variable), INITS);
    }

    public QRecipientGroupRecipientEntity(Path<? extends RecipientGroupRecipientEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipientGroupRecipientEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipientGroupRecipientEntity(PathMetadata metadata, PathInits inits) {
        this(RecipientGroupRecipientEntity.class, metadata, inits);
    }

    public QRecipientGroupRecipientEntity(Class<? extends RecipientGroupRecipientEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QRecipientGroupRecipientId(forProperty("id")) : null;
    }

}

