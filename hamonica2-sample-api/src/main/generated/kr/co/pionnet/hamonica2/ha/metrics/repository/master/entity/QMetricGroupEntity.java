package kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMetricGroupEntity is a Querydsl query type for MetricGroupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMetricGroupEntity extends EntityPathBase<MetricGroupEntity> {

    private static final long serialVersionUID = 1827677083L;

    public static final QMetricGroupEntity metricGroupEntity = new QMetricGroupEntity("metricGroupEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath metricGroupId = createString("metricGroupId");

    public final ListPath<MetricGroupMappingEntity, QMetricGroupMappingEntity> metricGroupMappings = this.<MetricGroupMappingEntity, QMetricGroupMappingEntity>createList("metricGroupMappings", MetricGroupMappingEntity.class, QMetricGroupMappingEntity.class, PathInits.DIRECT2);

    public final StringPath metricGroupName = createString("metricGroupName");

    public final StringPath metricGroupNameI18n = createString("metricGroupNameI18n");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath parentMetricGroupId = createString("parentMetricGroupId");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public QMetricGroupEntity(String variable) {
        super(MetricGroupEntity.class, forVariable(variable));
    }

    public QMetricGroupEntity(Path<? extends MetricGroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetricGroupEntity(PathMetadata metadata) {
        super(MetricGroupEntity.class, metadata);
    }

}

