package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlarmGroupEntity is a Querydsl query type for AlarmGroupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlarmGroupEntity extends EntityPathBase<AlarmGroupEntity> {

    private static final long serialVersionUID = -926872334L;

    public static final QAlarmGroupEntity alarmGroupEntity = new QAlarmGroupEntity("alarmGroupEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final StringPath alarmGroupId = createString("alarmGroupId");

    public final StringPath alarmGroupName = createString("alarmGroupName");

    public final StringPath alarmGroupNameI18n = createString("alarmGroupNameI18n");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath description = createString("description");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath parentAlarmGroupId = createString("parentAlarmGroupId");

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final StringPath workspaceId = createString("workspaceId");

    public QAlarmGroupEntity(String variable) {
        super(AlarmGroupEntity.class, forVariable(variable));
    }

    public QAlarmGroupEntity(Path<? extends AlarmGroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlarmGroupEntity(PathMetadata metadata) {
        super(AlarmGroupEntity.class, metadata);
    }

}

