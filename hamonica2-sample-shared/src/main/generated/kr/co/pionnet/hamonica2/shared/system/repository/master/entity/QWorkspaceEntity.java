package kr.co.pionnet.hamonica2.shared.system.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWorkspaceEntity is a Querydsl query type for WorkspaceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkspaceEntity extends EntityPathBase<WorkspaceEntity> {

    private static final long serialVersionUID = -1745033249L;

    public static final QWorkspaceEntity workspaceEntity = new QWorkspaceEntity("workspaceEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath owerId = createString("owerId");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final StringPath workspaceId = createString("workspaceId");

    public final StringPath workspaceName = createString("workspaceName");

    public QWorkspaceEntity(String variable) {
        super(WorkspaceEntity.class, forVariable(variable));
    }

    public QWorkspaceEntity(Path<? extends WorkspaceEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkspaceEntity(PathMetadata metadata) {
        super(WorkspaceEntity.class, metadata);
    }

}

