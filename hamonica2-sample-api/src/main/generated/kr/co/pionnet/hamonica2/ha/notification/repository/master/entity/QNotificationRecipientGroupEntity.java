package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNotificationRecipientGroupEntity is a Querydsl query type for NotificationRecipientGroupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationRecipientGroupEntity extends EntityPathBase<NotificationRecipientGroupEntity> {

    private static final long serialVersionUID = -448307275L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNotificationRecipientGroupEntity notificationRecipientGroupEntity = new QNotificationRecipientGroupEntity("notificationRecipientGroupEntity");

    public final QNotificationRecipientGroupId id;

    public QNotificationRecipientGroupEntity(String variable) {
        this(NotificationRecipientGroupEntity.class, forVariable(variable), INITS);
    }

    public QNotificationRecipientGroupEntity(Path<? extends NotificationRecipientGroupEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNotificationRecipientGroupEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNotificationRecipientGroupEntity(PathMetadata metadata, PathInits inits) {
        this(NotificationRecipientGroupEntity.class, metadata, inits);
    }

    public QNotificationRecipientGroupEntity(Class<? extends NotificationRecipientGroupEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QNotificationRecipientGroupId(forProperty("id")) : null;
    }

}

