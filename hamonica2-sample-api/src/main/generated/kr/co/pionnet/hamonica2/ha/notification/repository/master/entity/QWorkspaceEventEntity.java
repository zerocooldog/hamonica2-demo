package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWorkspaceEventEntity is a Querydsl query type for WorkspaceEventEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkspaceEventEntity extends EntityPathBase<WorkspaceEventEntity> {

    private static final long serialVersionUID = 1954003849L;

    public static final QWorkspaceEventEntity workspaceEventEntity = new QWorkspaceEventEntity("workspaceEventEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final ComparablePath<Character> alarmReference = createComparable("alarmReference", Character.class);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath description = createString("description");

    public final NumberPath<Long> eventGroupMappingNo = createNumber("eventGroupMappingNo", Long.class);

    public final StringPath eventId = createString("eventId");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public final ComparablePath<Character> visibleYn = createComparable("visibleYn", Character.class);

    public final NumberPath<Long> workspaceEventNo = createNumber("workspaceEventNo", Long.class);

    public final StringPath workspaceId = createString("workspaceId");

    public QWorkspaceEventEntity(String variable) {
        super(WorkspaceEventEntity.class, forVariable(variable));
    }

    public QWorkspaceEventEntity(Path<? extends WorkspaceEventEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkspaceEventEntity(PathMetadata metadata) {
        super(WorkspaceEventEntity.class, metadata);
    }

}

