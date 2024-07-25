package kr.co.pionnet.hamonica2.ha.members.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWorkspaceMemberEntity is a Querydsl query type for WorkspaceMemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkspaceMemberEntity extends EntityPathBase<WorkspaceMemberEntity> {

    private static final long serialVersionUID = -190326555L;

    public static final QWorkspaceMemberEntity workspaceMemberEntity = new QWorkspaceMemberEntity("workspaceMemberEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath memberId = createString("memberId");

    public final StringPath roleId = createString("roleId");

    public final StringPath workspaceId = createString("workspaceId");

    public final NumberPath<Long> workspaceMemberId = createNumber("workspaceMemberId", Long.class);

    public QWorkspaceMemberEntity(String variable) {
        super(WorkspaceMemberEntity.class, forVariable(variable));
    }

    public QWorkspaceMemberEntity(Path<? extends WorkspaceMemberEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkspaceMemberEntity(PathMetadata metadata) {
        super(WorkspaceMemberEntity.class, metadata);
    }

}

