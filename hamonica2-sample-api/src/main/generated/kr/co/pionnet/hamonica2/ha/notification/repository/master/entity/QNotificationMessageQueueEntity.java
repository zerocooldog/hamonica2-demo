package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationMessageQueueEntity is a Querydsl query type for NotificationMessageQueueEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationMessageQueueEntity extends EntityPathBase<NotificationMessageQueueEntity> {

    private static final long serialVersionUID = -952663783L;

    public static final QNotificationMessageQueueEntity notificationMessageQueueEntity = new QNotificationMessageQueueEntity("notificationMessageQueueEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisteredAtEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisteredAtEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    public final NumberPath<Short> failCount = createNumber("failCount", Short.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath notificationId = createString("notificationId");

    public final StringPath notificationMessage = createString("notificationMessage");

    public final StringPath notificationTypeId = createString("notificationTypeId");

    public QNotificationMessageQueueEntity(String variable) {
        super(NotificationMessageQueueEntity.class, forVariable(variable));
    }

    public QNotificationMessageQueueEntity(Path<? extends NotificationMessageQueueEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationMessageQueueEntity(PathMetadata metadata) {
        super(NotificationMessageQueueEntity.class, metadata);
    }

}

