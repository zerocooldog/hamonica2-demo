package kr.co.pionnet.hamonica2.shared.notification.mappers;

import kr.co.pionnet.hamonica2.shared.util.UtilDate;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.ModifierEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.time.Instant;
import java.util.List;

public interface DefaultMapStructMapper<M, E> {

    E toEntity(M model);

    M toDto(E entity);

    List<E> toEntityList(List<M> model);

    List<M> toDtoList(List<E> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    E partialUpdate(M model, @MappingTarget E entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    List<E> partialUpdatse(List<M> model, @MappingTarget List<E> entity);

    // @AfterMapping 메서드를 사용하여 매핑 후 creator_id 설정
    @AfterMapping
    default void setCreatorId(@MappingTarget E entity) {

        String creatorId = "00000000000000";
        Instant modifiedAt = Instant.now();

        setRegisterModifierEntity(entity, creatorId, modifiedAt);
        setRegisterEntity(entity, creatorId);
        setModifierEntity(entity, modifiedAt);

    }

    // @AfterMapping 메서드를 사용하여 매핑 후 creator_id 설정
    @AfterMapping
    default void setCreatorId(@MappingTarget List<E> entities) {

        String creatorId = "00000000000000";
        Instant modifiedAt = Instant.now();

        for (E entity : entities) {

            setRegisterModifierEntity(entity, creatorId, modifiedAt);
            setRegisterEntity(entity, creatorId);
            setModifierEntity(entity, modifiedAt);

        }
    }

    default void setRegisterModifierEntity(E entity, String creatorId, Instant modifiedAt){
        if(entity instanceof RegisterModifierEntity ) {

            if (((RegisterModifierEntity) entity).getCreatorId() == null) {
                ((RegisterModifierEntity) entity).setCreatorId(creatorId);
            }

            if (((RegisterModifierEntity) entity).getModifiedAt() == null) {
                ((RegisterModifierEntity) entity).setModifiedAt(modifiedAt);
            }
        }
    }

    default void setRegisterEntity(E entity, String creatorId){
        if(entity instanceof RegisterEntity ) {

            if (((RegisterEntity) entity).getCreatorId() == null) {
                ((RegisterEntity) entity).setCreatorId(creatorId);
            }
        }
    }

    default void setModifierEntity(E entity, Instant modifiedAt){
        if(entity instanceof ModifierEntity ) {

            if (((ModifierEntity) entity).getModifiedAt() == null) {
                ((ModifierEntity) entity).setModifiedAt(modifiedAt);
            }
        }
    }


}
