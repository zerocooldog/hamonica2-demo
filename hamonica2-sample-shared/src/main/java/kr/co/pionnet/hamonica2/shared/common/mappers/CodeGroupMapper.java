package kr.co.pionnet.hamonica2.shared.common.mappers;


import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeGroupEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CodeGroupMapper {
    CodeGroupEntity toEntity(CodeGroup codeGroup);

    CodeGroup toDto(CodeGroupEntity codeGroupEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CodeGroup partialUpdate(CodeGroup codeGroup, @MappingTarget CodeGroup codeGroupEntity);

    List<CodeGroupEntity> toEntityList(List<CodeGroup> codeGroups);

    List<CodeGroup> toDtoList(List<CodeGroupEntity> codeGroupEntities);
}