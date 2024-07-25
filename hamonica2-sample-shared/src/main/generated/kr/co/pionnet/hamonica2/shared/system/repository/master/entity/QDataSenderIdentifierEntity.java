package kr.co.pionnet.hamonica2.shared.system.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDataSenderIdentifierEntity is a Querydsl query type for DataSenderIdentifierEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDataSenderIdentifierEntity extends EntityPathBase<DataSenderIdentifierEntity> {

    private static final long serialVersionUID = -1426946780L;

    public static final QDataSenderIdentifierEntity dataSenderIdentifierEntity = new QDataSenderIdentifierEntity("dataSenderIdentifierEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath senderId = createString("senderId");

    public final StringPath senderName = createString("senderName");

    public final StringPath senderType = createString("senderType");

    public final StringPath workspaceId = createString("workspaceId");

    public QDataSenderIdentifierEntity(String variable) {
        super(DataSenderIdentifierEntity.class, forVariable(variable));
    }

    public QDataSenderIdentifierEntity(Path<? extends DataSenderIdentifierEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDataSenderIdentifierEntity(PathMetadata metadata) {
        super(DataSenderIdentifierEntity.class, metadata);
    }

}

