package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationTypeEntity is a Querydsl query type for NotificationTypeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationTypeEntity extends EntityPathBase<NotificationTypeEntity> {

    private static final long serialVersionUID = -1218850039L;

    public static final QNotificationTypeEntity notificationTypeEntity = new QNotificationTypeEntity("notificationTypeEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath description = createString("description");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath notificationTypeId = createString("notificationTypeId");

    public final StringPath notificationTypeName = createString("notificationTypeName");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public QNotificationTypeEntity(String variable) {
        super(NotificationTypeEntity.class, forVariable(variable));
    }

    public QNotificationTypeEntity(Path<? extends NotificationTypeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationTypeEntity(PathMetadata metadata) {
        super(NotificationTypeEntity.class, metadata);
    }

}

