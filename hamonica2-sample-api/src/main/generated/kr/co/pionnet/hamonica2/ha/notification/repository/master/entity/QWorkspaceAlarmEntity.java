package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWorkspaceAlarmEntity is a Querydsl query type for WorkspaceAlarmEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkspaceAlarmEntity extends EntityPathBase<WorkspaceAlarmEntity> {

    private static final long serialVersionUID = 1915608576L;

    public static final QWorkspaceAlarmEntity workspaceAlarmEntity = new QWorkspaceAlarmEntity("workspaceAlarmEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final NumberPath<Integer> alarmNo = createNumber("alarmNo", Integer.class);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath description = createString("description");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public final ComparablePath<Character> visibleYn = createComparable("visibleYn", Character.class);

    public final StringPath workspaceAlarmId = createString("workspaceAlarmId");

    public final StringPath workspaceId = createString("workspaceId");

    public QWorkspaceAlarmEntity(String variable) {
        super(WorkspaceAlarmEntity.class, forVariable(variable));
    }

    public QWorkspaceAlarmEntity(Path<? extends WorkspaceAlarmEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkspaceAlarmEntity(PathMetadata metadata) {
        super(WorkspaceAlarmEntity.class, metadata);
    }

}

