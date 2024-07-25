package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEventEntity is a Querydsl query type for EventEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEventEntity extends EntityPathBase<EventEntity> {

    private static final long serialVersionUID = -1597566532L;

    public static final QEventEntity eventEntity = new QEventEntity("eventEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final ComparablePath<Character> defaultApplied = createComparable("defaultApplied", Character.class);

    public final StringPath description = createString("description");

    public final StringPath eventContentTemplate = createString("eventContentTemplate");

    public final StringPath eventId = createString("eventId");

    public final StringPath eventName = createString("eventName");

    public final StringPath eventNameI18n = createString("eventNameI18n");

    public final StringPath eventType = createString("eventType");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath severity = createString("severity");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public final ComparablePath<Character> visibleYn = createComparable("visibleYn", Character.class);

    public QEventEntity(String variable) {
        super(EventEntity.class, forVariable(variable));
    }

    public QEventEntity(Path<? extends EventEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEventEntity(PathMetadata metadata) {
        super(EventEntity.class, metadata);
    }

}

