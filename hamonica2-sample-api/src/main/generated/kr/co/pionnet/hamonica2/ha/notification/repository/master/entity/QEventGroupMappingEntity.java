package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEventGroupMappingEntity is a Querydsl query type for EventGroupMappingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEventGroupMappingEntity extends EntityPathBase<EventGroupMappingEntity> {

    private static final long serialVersionUID = -1004288405L;

    public static final QEventGroupMappingEntity eventGroupMappingEntity = new QEventGroupMappingEntity("eventGroupMappingEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath eventGroupId = createString("eventGroupId");

    public final StringPath eventId = createString("eventId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public QEventGroupMappingEntity(String variable) {
        super(EventGroupMappingEntity.class, forVariable(variable));
    }

    public QEventGroupMappingEntity(Path<? extends EventGroupMappingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEventGroupMappingEntity(PathMetadata metadata) {
        super(EventGroupMappingEntity.class, metadata);
    }

}

