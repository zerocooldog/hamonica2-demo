package kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMetricEntity is a Querydsl query type for MetricEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMetricEntity extends EntityPathBase<MetricEntity> {

    private static final long serialVersionUID = 1201854442L;

    public static final QMetricEntity metricEntity = new QMetricEntity("metricEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final ComparablePath<Character> avgBySendersUseYn = createComparable("avgBySendersUseYn", Character.class);

    public final ComparablePath<Character> countBySendersUseYn = createComparable("countBySendersUseYn", Character.class);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath metricDataType = createString("metricDataType");

    public final ListPath<MetricGroupMappingEntity, QMetricGroupMappingEntity> metricGroupMappings = this.<MetricGroupMappingEntity, QMetricGroupMappingEntity>createList("metricGroupMappings", MetricGroupMappingEntity.class, QMetricGroupMappingEntity.class, PathInits.DIRECT2);

    public final StringPath metricId = createString("metricId");

    public final StringPath metricName = createString("metricName");

    public final StringPath metricType = createString("metricType");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final ComparablePath<Character> sumBySendersUseYn = createComparable("sumBySendersUseYn", Character.class);

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public final ComparablePath<Character> visibleYn = createComparable("visibleYn", Character.class);

    public final ComparablePath<Character> widgetMetricUseYn = createComparable("widgetMetricUseYn", Character.class);

    public final ComparablePath<Character> widgetMetricVisibleYn = createComparable("widgetMetricVisibleYn", Character.class);

    public QMetricEntity(String variable) {
        super(MetricEntity.class, forVariable(variable));
    }

    public QMetricEntity(Path<? extends MetricEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetricEntity(PathMetadata metadata) {
        super(MetricEntity.class, metadata);
    }

}

