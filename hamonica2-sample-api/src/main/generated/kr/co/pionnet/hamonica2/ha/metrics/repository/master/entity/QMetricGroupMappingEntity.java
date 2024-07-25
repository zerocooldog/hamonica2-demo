package kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMetricGroupMappingEntity is a Querydsl query type for MetricGroupMappingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMetricGroupMappingEntity extends EntityPathBase<MetricGroupMappingEntity> {

    private static final long serialVersionUID = 756135833L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMetricGroupMappingEntity metricGroupMappingEntity = new QMetricGroupMappingEntity("metricGroupMappingEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMetricEntity metric;

    public final QMetricGroupEntity metricGroup;

    public final StringPath metricGroupId = createString("metricGroupId");

    public final StringPath metricId = createString("metricId");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public QMetricGroupMappingEntity(String variable) {
        this(MetricGroupMappingEntity.class, forVariable(variable), INITS);
    }

    public QMetricGroupMappingEntity(Path<? extends MetricGroupMappingEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMetricGroupMappingEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMetricGroupMappingEntity(PathMetadata metadata, PathInits inits) {
        this(MetricGroupMappingEntity.class, metadata, inits);
    }

    public QMetricGroupMappingEntity(Class<? extends MetricGroupMappingEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.metric = inits.isInitialized("metric") ? new QMetricEntity(forProperty("metric")) : null;
        this.metricGroup = inits.isInitialized("metricGroup") ? new QMetricGroupEntity(forProperty("metricGroup")) : null;
    }

}

