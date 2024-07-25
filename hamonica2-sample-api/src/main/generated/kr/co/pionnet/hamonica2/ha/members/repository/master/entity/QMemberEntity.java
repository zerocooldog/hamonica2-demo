package kr.co.pionnet.hamonica2.ha.members.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberEntity is a Querydsl query type for MemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberEntity extends EntityPathBase<MemberEntity> {

    private static final long serialVersionUID = -59396822L;

    public static final QMemberEntity memberEntity = new QMemberEntity("memberEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final DateTimePath<java.time.Instant> accountEndDatetime = createDateTime("accountEndDatetime", java.time.Instant.class);

    public final DateTimePath<java.time.Instant> accountStartDatetime = createDateTime("accountStartDatetime", java.time.Instant.class);

    public final ComparablePath<Character> approvalYn = createComparable("approvalYn", Character.class);

    public final StringPath cellNo1 = createString("cellNo1");

    public final StringPath cellNo2 = createString("cellNo2");

    public final StringPath companyName = createString("companyName");

    public final StringPath countryCode = createString("countryCode");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final StringPath description = createString("description");

    public final StringPath email = createString("email");

    public final ComparablePath<Character> expireYn = createComparable("expireYn", Character.class);

    public final ComparablePath<Character> lockYn = createComparable("lockYn", Character.class);

    public final StringPath memberId = createString("memberId");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final StringPath nickName = createString("nickName");

    public final StringPath password = createString("password");

    public final StringPath roleId = createString("roleId");

    public final StringPath serverGroupId = createString("serverGroupId");

    public final StringPath userName = createString("userName");

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public QMemberEntity(String variable) {
        super(MemberEntity.class, forVariable(variable));
    }

    public QMemberEntity(Path<? extends MemberEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberEntity(PathMetadata metadata) {
        super(MemberEntity.class, metadata);
    }

}

