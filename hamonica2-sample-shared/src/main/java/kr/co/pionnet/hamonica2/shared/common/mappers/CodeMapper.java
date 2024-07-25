package kr.co.pionnet.hamonica2.shared.common.mappers;

import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CodeMapper {
    CodeEntity toEntity(Code code);

    Code toDto(CodeEntity codeEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CodeEntity partialUpdate(Code code, @MappingTarget CodeEntity codeEntity);


    List<CodeEntity> toEntityList(List<Code> code);

    List<Code> toDtoList(List<CodeEntity> codeEntity);
}