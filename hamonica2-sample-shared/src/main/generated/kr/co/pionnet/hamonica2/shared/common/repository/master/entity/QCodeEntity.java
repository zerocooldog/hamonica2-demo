package kr.co.pionnet.hamonica2.shared.common.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCodeEntity is a Querydsl query type for CodeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCodeEntity extends EntityPathBase<CodeEntity> {

    private static final long serialVersionUID = 1218636421L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCodeEntity codeEntity = new QCodeEntity("codeEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final StringPath codeAddValue1 = createString("codeAddValue1");

    public final StringPath codeAddValue2 = createString("codeAddValue2");

    public final StringPath codeAddValue3 = createString("codeAddValue3");

    public final QCodeGroupEntity codeGroup;

    public final StringPath codeGroupId = createString("codeGroupId");

    public final StringPath codeId = createString("codeId");

    public final StringPath codeName = createString("codeName");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath creatorId = _super.creatorId;

    public final ComparablePath<Character> delYn = createComparable("delYn", Character.class);

    public final StringPath description = createString("description");

    //inherited
    public final DateTimePath<java.time.Instant> modifiedAt = _super.modifiedAt;

    //inherited
    public final StringPath modifierId = _super.modifierId;

    public final NumberPath<Integer> sortOrder = createNumber("sortOrder", Integer.class);

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public QCodeEntity(String variable) {
        this(CodeEntity.class, forVariable(variable), INITS);
    }

    public QCodeEntity(Path<? extends CodeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCodeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCodeEntity(PathMetadata metadata, PathInits inits) {
        this(CodeEntity.class, metadata, inits);
    }

    public QCodeEntity(Class<? extends CodeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codeGroup = inits.isInitialized("codeGroup") ? new QCodeGroupEntity(forProperty("codeGroup")) : null;
    }

}

