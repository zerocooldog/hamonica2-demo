package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRecipientEntity is a Querydsl query type for RecipientEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipientEntity extends EntityPathBase<RecipientEntity> {

    private static final long serialVersionUID = -1032204677L;

    public static final QRecipientEntity recipientEntity = new QRecipientEntity("recipientEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final StringPath cellNo = createString("cellNo");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath email = createString("email");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath notificationTypeId = createString("notificationTypeId");

    public final StringPath recipientName = createString("recipientName");

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public final StringPath workspaceId = createString("workspaceId");

    public QRecipientEntity(String variable) {
        super(RecipientEntity.class, forVariable(variable));
    }

    public QRecipientEntity(Path<? extends RecipientEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRecipientEntity(PathMetadata metadata) {
        super(RecipientEntity.class, metadata);
    }

}

