package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationEntity is a Querydsl query type for NotificationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationEntity extends EntityPathBase<NotificationEntity> {

    private static final long serialVersionUID = -1065635537L;

    public static final QNotificationEntity notificationEntity = new QNotificationEntity("notificationEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath notificationId = createString("notificationId");

    public final StringPath notificationTypeId = createString("notificationTypeId");

    public final StringPath workspaceAlarmId = createString("workspaceAlarmId");

    public final StringPath workspaceId = createString("workspaceId");

    public QNotificationEntity(String variable) {
        super(NotificationEntity.class, forVariable(variable));
    }

    public QNotificationEntity(Path<? extends NotificationEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationEntity(PathMetadata metadata) {
        super(NotificationEntity.class, metadata);
    }

}

