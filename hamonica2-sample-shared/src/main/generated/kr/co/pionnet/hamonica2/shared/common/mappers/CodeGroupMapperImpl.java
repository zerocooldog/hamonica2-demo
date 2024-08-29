package kr.co.pionnet.hamonica2.shared.common.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeGroupEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-16T16:50:06+0900",
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

        codeGroupEntity.setCreatorId( codeGroup.getCreatorId() );
        codeGroupEntity.setCreatedAt( codeGroup.getCreatedAt() );
        codeGroupEntity.setModifierId( codeGroup.getModifierId() );
        codeGroupEntity.setModifiedAt( codeGroup.getModifiedAt() );
        codeGroupEntity.setCodeGroupId( codeGroup.getCodeGroupId() );
        codeGroupEntity.setCodeGroupName( codeGroup.getCodeGroupName() );
        codeGroupEntity.setDescription( codeGroup.getDescription() );
        codeGroupEntity.setSortOrder( codeGroup.getSortOrder() );
        codeGroupEntity.setSystemCodeYn( codeGroup.getSystemCodeYn() );
        codeGroupEntity.setUseYn( codeGroup.getUseYn() );
        codeGroupEntity.setDelYn( codeGroup.getDelYn() );

        return codeGroupEntity;
    }

    @Override
    public CodeGroup toDto(CodeGroupEntity codeGroupEntity) {
        if ( codeGroupEntity == null ) {
            return null;
        }

        CodeGroup.CodeGroupBuilder<?, ?> codeGroup = CodeGroup.builder();

        codeGroup.creatorId( codeGroupEntity.getCreatorId() );
        codeGroup.createdAt( codeGroupEntity.getCreatedAt() );
        codeGroup.modifierId( codeGroupEntity.getModifierId() );
        codeGroup.modifiedAt( codeGroupEntity.getModifiedAt() );
        codeGroup.codeGroupId( codeGroupEntity.getCodeGroupId() );
        codeGroup.codeGroupName( codeGroupEntity.getCodeGroupName() );
        codeGroup.description( codeGroupEntity.getDescription() );
        codeGroup.sortOrder( codeGroupEntity.getSortOrder() );
        codeGroup.systemCodeYn( codeGroupEntity.getSystemCodeYn() );
        codeGroup.useYn( codeGroupEntity.getUseYn() );
        codeGroup.delYn( codeGroupEntity.getDelYn() );

        return codeGroup.build();
    }

    @Override
    public CodeGroup partialUpdate(CodeGroup codeGroup, CodeGroup codeGroupEntity) {
        if ( codeGroup == null ) {
            return codeGroupEntity;
        }

        if ( codeGroup.getCreatorId() != null ) {
            codeGroupEntity.setCreatorId( codeGroup.getCreatorId() );
        }
        if ( codeGroup.getCreatedAt() != null ) {
            codeGroupEntity.setCreatedAt( codeGroup.getCreatedAt() );
        }
        if ( codeGroup.getModifierId() != null ) {
            codeGroupEntity.setModifierId( codeGroup.getModifierId() );
        }
        if ( codeGroup.getModifiedAt() != null ) {
            codeGroupEntity.setModifiedAt( codeGroup.getModifiedAt() );
        }
        if ( codeGroup.getCodeGroupId() != null ) {
            codeGroupEntity.setCodeGroupId( codeGroup.getCodeGroupId() );
        }
        if ( codeGroup.getCodeGroupName() != null ) {
            codeGroupEntity.setCodeGroupName( codeGroup.getCodeGroupName() );
        }
        if ( codeGroup.getDescription() != null ) {
            codeGroupEntity.setDescription( codeGroup.getDescription() );
        }
        if ( codeGroup.getSortOrder() != null ) {
            codeGroupEntity.setSortOrder( codeGroup.getSortOrder() );
        }
        if ( codeGroup.getSystemCodeYn() != null ) {
            codeGroupEntity.setSystemCodeYn( codeGroup.getSystemCodeYn() );
        }
        if ( codeGroup.getUseYn() != null ) {
            codeGroupEntity.setUseYn( codeGroup.getUseYn() );
        }
        if ( codeGroup.getDelYn() != null ) {
            codeGroupEntity.setDelYn( codeGroup.getDelYn() );
        }
        if ( codeGroupEntity.getCodes() != null ) {
            List<Code> list = codeGroup.getCodes();
            if ( list != null ) {
                codeGroupEntity.getCodes().clear();
                codeGroupEntity.getCodes().addAll( list );
            }
        }
        else {
            List<Code> list = codeGroup.getCodes();
            if ( list != null ) {
                codeGroupEntity.setCodes( new ArrayList<Code>( list ) );
            }
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
