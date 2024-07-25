package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlarmLogEntity is a Querydsl query type for AlarmLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlarmLogEntity extends EntityPathBase<AlarmLogEntity> {

    private static final long serialVersionUID = 342425079L;

    public static final QAlarmLogEntity alarmLogEntity = new QAlarmLogEntity("alarmLogEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisteredAtEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisteredAtEntity(this);

    public final NumberPath<Long> alarm_log_no = createNumber("alarm_log_no", Long.class);

    public final StringPath alarmLog = createString("alarmLog");

    public final NumberPath<Integer> alarmNo = createNumber("alarmNo", Integer.class);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    public final NumberPath<Long> notificationLogNo = createNumber("notificationLogNo", Long.class);

    public final StringPath workspaceId = createString("workspaceId");

    public QAlarmLogEntity(String variable) {
        super(AlarmLogEntity.class, forVariable(variable));
    }

    public QAlarmLogEntity(Path<? extends AlarmLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlarmLogEntity(PathMetadata metadata) {
        super(AlarmLogEntity.class, metadata);
    }

}

