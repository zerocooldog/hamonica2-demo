package kr.co.pionnet.hamonica2.shared.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationSlackConfigEntity is a Querydsl query type for NotificationSlackConfigEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationSlackConfigEntity extends EntityPathBase<NotificationSlackConfigEntity> {

    private static final long serialVersionUID = -1027837931L;

    public static final QNotificationSlackConfigEntity notificationSlackConfigEntity = new QNotificationSlackConfigEntity("notificationSlackConfigEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final StringPath botUserAccessToken = createString("botUserAccessToken");

    public final StringPath channelIds = createString("channelIds");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath description = createString("description");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath notificationSlackConfigId = createString("notificationSlackConfigId");

    public final StringPath notificationTypeId = createString("notificationTypeId");

    public final StringPath oauthAccessToken = createString("oauthAccessToken");

    public final StringPath settingType = createString("settingType");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public final StringPath workspaceId = createString("workspaceId");

    public QNotificationSlackConfigEntity(String variable) {
        super(NotificationSlackConfigEntity.class, forVariable(variable));
    }

    public QNotificationSlackConfigEntity(Path<? extends NotificationSlackConfigEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationSlackConfigEntity(PathMetadata metadata) {
        super(NotificationSlackConfigEntity.class, metadata);
    }

}

