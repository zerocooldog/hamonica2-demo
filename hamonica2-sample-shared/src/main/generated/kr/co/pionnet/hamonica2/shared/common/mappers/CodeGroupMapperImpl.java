package kr.co.pionnet.hamonica2.shared.common.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeGroupEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T10:59:43+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class CodeGroupMapperImpl implements CodeGroupMapper {

    @Override
    public CodeGroupEntity toEntity(CodeGroup codeGroup) {
        if ( codeGroup == null ) {
            return null;
        }

        CodeGroupEntity codeGroupEntity = new CodeGroupEntity();

        return codeGroupEntity;
    }

    @Override
    public CodeGroup toDto(CodeGroupEntity codeGroupEntity) {
        if ( codeGroupEntity == null ) {
            return null;
        }

        CodeGroup codeGroup = new CodeGroup();

        return codeGroup;
    }

    @Override
    public CodeGroup partialUpdate(CodeGroup codeGroup, CodeGroup codeGroupEntity) {
        if ( codeGroup == null ) {
            return codeGroupEntity;
        }

        return codeGroupEntity;
    }

    @Override
    public List<CodeGroupEntity> toEntityList(List<CodeGroup> codeGroups) {
        if ( codeGroups == null ) {
            return null;
        }

        List<CodeGroupEntity> list = new ArrayList<CodeGroupEntity>( codeGroups.size() );
        for ( CodeGroup codeGroup : codeGroups ) {
            list.add( toEntity( codeGroup ) );
        }

        return list;
    }

    @Override
    public List<CodeGroup> toDtoList(List<CodeGroupEntity> codeGroupEntities) {
        if ( codeGroupEntities == null ) {
            return null;
        }

        List<CodeGroup> list = new ArrayList<CodeGroup>( codeGroupEntities.size() );
        for ( CodeGroupEntity codeGroupEntity : codeGroupEntities ) {
            list.add( toDto( codeGroupEntity ) );
        }

        return list;
    }
}
