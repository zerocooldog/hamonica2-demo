package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEventLogEntity is a Querydsl query type for EventLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEventLogEntity extends EntityPathBase<EventLogEntity> {

    private static final long serialVersionUID = 1714702286L;

    public static final QEventLogEntity eventLogEntity = new QEventLogEntity("eventLogEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisteredAtEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisteredAtEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    public final StringPath creatorId = createString("creatorId");

    public final StringPath eventLog = createString("eventLog");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> workspaceEventNo = createNumber("workspaceEventNo", Long.class);

    public final StringPath workspaceId = createString("workspaceId");

    public QEventLogEntity(String variable) {
        super(EventLogEntity.class, forVariable(variable));
    }

    public QEventLogEntity(Path<? extends EventLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEventLogEntity(PathMetadata metadata) {
        super(EventLogEntity.class, metadata);
    }

}

