package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEventGroupEntity is a Querydsl query type for EventGroupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEventGroupEntity extends EntityPathBase<EventGroupEntity> {

    private static final long serialVersionUID = -723436279L;

    public static final QEventGroupEntity eventGroupEntity = new QEventGroupEntity("eventGroupEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath eventGroupId = createString("eventGroupId");

    public final StringPath eventGroupName = createString("eventGroupName");

    public final StringPath eventGroupNameI18n = createString("eventGroupNameI18n");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath parentEventGroupId = createString("parentEventGroupId");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final StringPath workspaceId = createString("workspaceId");

    public QEventGroupEntity(String variable) {
        super(EventGroupEntity.class, forVariable(variable));
    }

    public QEventGroupEntity(Path<? extends EventGroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEventGroupEntity(PathMetadata metadata) {
        super(EventGroupEntity.class, metadata);
    }

}

