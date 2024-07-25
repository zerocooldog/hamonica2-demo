package kr.co.pionnet.hamonica2.zconfiguration.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QModifierEntity is a Querydsl query type for ModifierEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QModifierEntity extends EntityPathBase<ModifierEntity> {

    private static final long serialVersionUID = -1482212332L;

    public static final QModifierEntity modifierEntity = new QModifierEntity("modifierEntity");

    public final DateTimePath<java.time.Instant> modifiedAt = createDateTime("modifiedAt", java.time.Instant.class);

    public final StringPath modifierId = createString("modifierId");

    public QModifierEntity(String variable) {
        super(ModifierEntity.class, forVariable(variable));
    }

    public QModifierEntity(Path<? extends ModifierEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QModifierEntity(PathMetadata metadata) {
        super(ModifierEntity.class, metadata);
    }

}

