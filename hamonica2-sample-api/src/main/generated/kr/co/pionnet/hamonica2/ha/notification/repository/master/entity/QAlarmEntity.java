package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlarmEntity is a Querydsl query type for AlarmEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlarmEntity extends EntityPathBase<AlarmEntity> {

    private static final long serialVersionUID = -1635961805L;

    public static final QAlarmEntity alarmEntity = new QAlarmEntity("alarmEntity");

    public final StringPath alarmCondition = createString("alarmCondition");

    public final StringPath alarmContentTemplate = createString("alarmContentTemplate");

    public final ComparablePath<Character> alarmContentTemplateUseYn = createComparable("alarmContentTemplateUseYn", Character.class);

    public final NumberPath<Integer> alarmNo = createNumber("alarmNo", Integer.class);

    public final StringPath alarmSourceType = createString("alarmSourceType");

    public final StringPath alarmType = createString("alarmType");

    public final DateTimePath<java.time.Instant> createdAt = createDateTime("createdAt", java.time.Instant.class);

    public final StringPath creatorId = createString("creatorId");

    public final ComparablePath<Character> defaultAppliedYn = createComparable("defaultAppliedYn", Character.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.time.Instant> modifiedAt = createDateTime("modifiedAt", java.time.Instant.class);

    public final StringPath modifierId = createString("modifierId");

    public final ComparablePath<Character> notificationUseYn = createComparable("notificationUseYn", Character.class);

    public final StringPath severity = createString("severity");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public QAlarmEntity(String variable) {
        super(AlarmEntity.class, forVariable(variable));
    }

    public QAlarmEntity(Path<? extends AlarmEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlarmEntity(PathMetadata metadata) {
        super(AlarmEntity.class, metadata);
    }

}

