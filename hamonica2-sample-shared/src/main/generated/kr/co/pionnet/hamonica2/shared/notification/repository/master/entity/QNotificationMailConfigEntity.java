package kr.co.pionnet.hamonica2.shared.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationMailConfigEntity is a Querydsl query type for NotificationMailConfigEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationMailConfigEntity extends EntityPathBase<NotificationMailConfigEntity> {

    private static final long serialVersionUID = 961579644L;

    public static final QNotificationMailConfigEntity notificationMailConfigEntity = new QNotificationMailConfigEntity("notificationMailConfigEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath mailAccount = createString("mailAccount");

    public final StringPath mailHost = createString("mailHost");

    public final StringPath mailPassword = createString("mailPassword");

    public final StringPath mailPort = createString("mailPort");

    public final StringPath mailServerName = createString("mailServerName");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath notificationMailConfigId = createString("notificationMailConfigId");

    public final StringPath notificationTypeId = createString("notificationTypeId");

    public final StringPath senderAddress = createString("senderAddress");

    public final StringPath senderName = createString("senderName");

    public final StringPath settingType = createString("settingType");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final StringPath titlePrefix = createString("titlePrefix");

    public final ComparablePath<Character> tlsUseYn = createComparable("tlsUseYn", Character.class);

    public final StringPath workspaceId = createString("workspaceId");

    public QNotificationMailConfigEntity(String variable) {
        super(NotificationMailConfigEntity.class, forVariable(variable));
    }

    public QNotificationMailConfigEntity(Path<? extends NotificationMailConfigEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationMailConfigEntity(PathMetadata metadata) {
        super(NotificationMailConfigEntity.class, metadata);
    }

}

