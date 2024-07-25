package kr.co.pionnet.hamonica2.shared.system.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoleEntity is a Querydsl query type for RoleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoleEntity extends EntityPathBase<RoleEntity> {

    private static final long serialVersionUID = 1969711250L;

    public static final QRoleEntity roleEntity = new QRoleEntity("roleEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath description = createString("description");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final ComparablePath<Character> readYn = createComparable("readYn", Character.class);

    public final StringPath roleId = createString("roleId");

    public final StringPath roleName = createString("roleName");

    public final StringPath roleNameI18n = createString("roleNameI18n");

    public final StringPath roleType = createString("roleType");

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public final ComparablePath<Character> writeYn = createComparable("writeYn", Character.class);

    public QRoleEntity(String variable) {
        super(RoleEntity.class, forVariable(variable));
    }

    public QRoleEntity(Path<? extends RoleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleEntity(PathMetadata metadata) {
        super(RoleEntity.class, metadata);
    }

}

