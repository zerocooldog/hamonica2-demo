package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlarmGroupMappingEntity is a Querydsl query type for AlarmGroupMappingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlarmGroupMappingEntity extends EntityPathBase<AlarmGroupMappingEntity> {

    private static final long serialVersionUID = 647949922L;

    public static final QAlarmGroupMappingEntity alarmGroupMappingEntity = new QAlarmGroupMappingEntity("alarmGroupMappingEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterEntity(this);

    public final StringPath alarmGroupId = createString("alarmGroupId");

    public final NumberPath<Integer> alarmNo = createNumber("alarmNo", Integer.class);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public QAlarmGroupMappingEntity(String variable) {
        super(AlarmGroupMappingEntity.class, forVariable(variable));
    }

    public QAlarmGroupMappingEntity(Path<? extends AlarmGroupMappingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlarmGroupMappingEntity(PathMetadata metadata) {
        super(AlarmGroupMappingEntity.class, metadata);
    }

}

