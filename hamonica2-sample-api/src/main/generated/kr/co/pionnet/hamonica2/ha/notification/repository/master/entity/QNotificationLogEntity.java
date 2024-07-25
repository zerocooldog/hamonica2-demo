package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationLogEntity is a Querydsl query type for NotificationLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationLogEntity extends EntityPathBase<NotificationLogEntity> {

    private static final long serialVersionUID = 41652091L;

    public static final QNotificationLogEntity notificationLogEntity = new QNotificationLogEntity("notificationLogEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisteredAtEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisteredAtEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath notificationTypes = createString("notificationTypes");

    public final StringPath workspaceId = createString("workspaceId");

    public QNotificationLogEntity(String variable) {
        super(NotificationLogEntity.class, forVariable(variable));
    }

    public QNotificationLogEntity(Path<? extends NotificationLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationLogEntity(PathMetadata metadata) {
        super(NotificationLogEntity.class, metadata);
    }

}

