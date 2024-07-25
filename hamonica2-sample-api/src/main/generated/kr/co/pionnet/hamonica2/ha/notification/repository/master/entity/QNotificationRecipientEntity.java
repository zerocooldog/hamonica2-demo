package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNotificationRecipientEntity is a Querydsl query type for NotificationRecipientEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationRecipientEntity extends EntityPathBase<NotificationRecipientEntity> {

    private static final long serialVersionUID = 19461008L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNotificationRecipientEntity notificationRecipientEntity = new QNotificationRecipientEntity("notificationRecipientEntity");

    public final QNotificationRecipientId id;

    public QNotificationRecipientEntity(String variable) {
        this(NotificationRecipientEntity.class, forVariable(variable), INITS);
    }

    public QNotificationRecipientEntity(Path<? extends NotificationRecipientEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNotificationRecipientEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNotificationRecipientEntity(PathMetadata metadata, PathInits inits) {
        this(NotificationRecipientEntity.class, metadata, inits);
    }

    public QNotificationRecipientEntity(Class<? extends NotificationRecipientEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QNotificationRecipientId(forProperty("id")) : null;
    }

}

