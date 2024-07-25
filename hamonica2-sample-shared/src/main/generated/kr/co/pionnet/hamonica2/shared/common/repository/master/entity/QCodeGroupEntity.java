package kr.co.pionnet.hamonica2.shared.common.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCodeGroupEntity is a Querydsl query type for CodeGroupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCodeGroupEntity extends EntityPathBase<CodeGroupEntity> {

    private static final long serialVersionUID = -878020128L;

    public static final QCodeGroupEntity codeGroupEntity = new QCodeGroupEntity("codeGroupEntity");

    public final kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity _super = new kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.QRegisterModifierEntity(this);

    public final StringPath codeGroupId = createString("codeGroupId");

    public final StringPath codeGroupName = createString("codeGroupName");

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

    public final ComparablePath<Character> systemCodeYn = createComparable("systemCodeYn", Character.class);

    public final ComparablePath<Character> useYn = createComparable("useYn", Character.class);

    public QCodeGroupEntity(String variable) {
        super(CodeGroupEntity.class, forVariable(variable));
    }

    public QCodeGroupEntity(Path<? extends CodeGroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCodeGroupEntity(PathMetadata metadata) {
        super(CodeGroupEntity.class, metadata);
    }

}

