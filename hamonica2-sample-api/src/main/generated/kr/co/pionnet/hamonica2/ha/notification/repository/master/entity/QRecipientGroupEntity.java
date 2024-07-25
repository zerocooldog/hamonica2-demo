package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRecipientGroupEntity is a Querydsl query type for RecipientGroupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipientGroupEntity extends EntityPathBase<RecipientGroupEntity> {

    private static final long serialVersionUID = 124886954L;

    public static final QRecipientGroupEntity recipientGroupEntity = new QRecipientGroupEntity("recipientGroupEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath recipientGroupName = createString("recipientGroupName");

    public final StringPath workspaceId = createString("workspaceId");

    public QRecipientGroupEntity(String variable) {
        super(RecipientGroupEntity.class, forVariable(variable));
    }

    public QRecipientGroupEntity(Path<? extends RecipientGroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRecipientGroupEntity(PathMetadata metadata) {
        super(RecipientGroupEntity.class, metadata);
    }

}

