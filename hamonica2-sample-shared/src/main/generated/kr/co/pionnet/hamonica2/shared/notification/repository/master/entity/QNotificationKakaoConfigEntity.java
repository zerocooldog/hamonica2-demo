package kr.co.pionnet.hamonica2.shared.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationKakaoConfigEntity is a Querydsl query type for NotificationKakaoConfigEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationKakaoConfigEntity extends EntityPathBase<NotificationKakaoConfigEntity> {

    private static final long serialVersionUID = 84649160L;

    public static final QNotificationKakaoConfigEntity notificationKakaoConfigEntity = new QNotificationKakaoConfigEntity("notificationKakaoConfigEntity");

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

    public final StringPath notificationKakaoConfigId = createString("notificationKakaoConfigId");

    public final StringPath notificationTypeId = createString("notificationTypeId");

    public final StringPath oauthAccessToken = createString("oauthAccessToken");

    public final StringPath receiverUuids = createString("receiverUuids");

    public final StringPath settingType = createString("settingType");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public final StringPath webHookUrl = createString("webHookUrl");

    public final StringPath workspaceId = createString("workspaceId");

    public QNotificationKakaoConfigEntity(String variable) {
        super(NotificationKakaoConfigEntity.class, forVariable(variable));
    }

    public QNotificationKakaoConfigEntity(Path<? extends NotificationKakaoConfigEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationKakaoConfigEntity(PathMetadata metadata) {
        super(NotificationKakaoConfigEntity.class, metadata);
    }

}

