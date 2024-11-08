package kr.co.pionnet.hamonica2.shared.common.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeEntity;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeGroupEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-06T14:14:13+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class CodeMapperImpl implements CodeMapper {

    @Override
    public CodeEntity toEntity(Code code) {
        if ( code == null ) {
            return null;
        }

        CodeEntity codeEntity = new CodeEntity();

        codeEntity.setCreatorId( code.getCreatorId() );
        codeEntity.setCreatedAt( code.getCreatedAt() );
        codeEntity.setModifierId( code.getModifierId() );
        codeEntity.setModifiedAt( code.getModifiedAt() );
        codeEntity.setCodeGroupId( code.getCodeGroupId() );
        codeEntity.setCodeId( code.getCodeId() );
        codeEntity.setCodeName( code.getCodeName() );
        codeEntity.setCodeAddValue1( code.getCodeAddValue1() );
        codeEntity.setCodeAddValue2( code.getCodeAddValue2() );
        codeEntity.setCodeAddValue3( code.getCodeAddValue3() );
        codeEntity.setDescription( code.getDescription() );
        codeEntity.setSortOrder( code.getSortOrder() );
        codeEntity.setUseYn( code.getUseYn() );
        codeEntity.setDelYn( code.getDelYn() );
        codeEntity.setCodeGroup( codeGroupToCodeGroupEntity( code.getCodeGroup() ) );

        return codeEntity;
    }

    @Override
    public Code toDto(CodeEntity codeEntity) {
        if ( codeEntity == null ) {
            return null;
        }

        Code.CodeBuilder<?, ?> code = Code.builder();

        code.creatorId( codeEntity.getCreatorId() );
        code.createdAt( codeEntity.getCreatedAt() );
        code.modifierId( codeEntity.getModifierId() );
        code.modifiedAt( codeEntity.getModifiedAt() );
        code.codeGroupId( codeEntity.getCodeGroupId() );
        code.codeId( codeEntity.getCodeId() );
        code.codeName( codeEntity.getCodeName() );
        code.codeAddValue1( codeEntity.getCodeAddValue1() );
        code.codeAddValue2( codeEntity.getCodeAddValue2() );
        code.codeAddValue3( codeEntity.getCodeAddValue3() );
        code.description( codeEntity.getDescription() );
        code.sortOrder( codeEntity.getSortOrder() );
        code.useYn( codeEntity.getUseYn() );
        code.delYn( codeEntity.getDelYn() );
        code.codeGroup( codeGroupEntityToCodeGroup( codeEntity.getCodeGroup() ) );

        return code.build();
    }

    @Override
    public CodeEntity partialUpdate(Code code, CodeEntity codeEntity) {
        if ( code == null ) {
            return codeEntity;
        }

        if ( code.getCreatorId() != null ) {
            codeEntity.setCreatorId( code.getCreatorId() );
        }
        if ( code.getCreatedAt() != null ) {
            codeEntity.setCreatedAt( code.getCreatedAt() );
        }
        if ( code.getModifierId() != null ) {
            codeEntity.setModifierId( code.getModifierId() );
        }
        if ( code.getModifiedAt() != null ) {
            codeEntity.setModifiedAt( code.getModifiedAt() );
        }
        if ( code.getCodeGroupId() != null ) {
            codeEntity.setCodeGroupId( code.getCodeGroupId() );
        }
        if ( code.getCodeId() != null ) {
            codeEntity.setCodeId( code.getCodeId() );
        }
        if ( code.getCodeName() != null ) {
            codeEntity.setCodeName( code.getCodeName() );
        }
        if ( code.getCodeAddValue1() != null ) {
            codeEntity.setCodeAddValue1( code.getCodeAddValue1() );
        }
        if ( code.getCodeAddValue2() != null ) {
            codeEntity.setCodeAddValue2( code.getCodeAddValue2() );
        }
        if ( code.getCodeAddValue3() != null ) {
            codeEntity.setCodeAddValue3( code.getCodeAddValue3() );
        }
        if ( code.getDescription() != null ) {
            codeEntity.setDescription( code.getDescription() );
        }
        if ( code.getSortOrder() != null ) {
            codeEntity.setSortOrder( code.getSortOrder() );
        }
        if ( code.getUseYn() != null ) {
            codeEntity.setUseYn( code.getUseYn() );
        }
        if ( code.getDelYn() != null ) {
            codeEntity.setDelYn( code.getDelYn() );
        }
        if ( code.getCodeGroup() != null ) {
            if ( codeEntity.getCodeGroup() == null ) {
                codeEntity.setCodeGroup( new CodeGroupEntity() );
            }
            codeGroupToCodeGroupEntity1( code.getCodeGroup(), codeEntity.getCodeGroup() );
        }

        return codeEntity;
    }

    @Override
    public List<CodeEntity> toEntityList(List<Code> code) {
        if ( code == null ) {
            return null;
        }

        List<CodeEntity> list = new ArrayList<CodeEntity>( code.size() );
        for ( Code code1 : code ) {
            list.add( toEntity( code1 ) );
        }

        return list;
    }

    @Override
    public List<Code> toDtoList(List<CodeEntity> codeEntity) {
        if ( codeEntity == null ) {
            return null;
        }

        List<Code> list = new ArrayList<Code>( codeEntity.size() );
        for ( CodeEntity codeEntity1 : codeEntity ) {
            list.add( toDto( codeEntity1 ) );
        }

        return list;
    }

    protected CodeGroupEntity codeGroupToCodeGroupEntity(CodeGroup codeGroup) {
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

    protected CodeGroup codeGroupEntityToCodeGroup(CodeGroupEntity codeGroupEntity) {
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

    protected void codeGroupToCodeGroupEntity1(CodeGroup codeGroup, CodeGroupEntity mappingTarget) {
        if ( codeGroup == null ) {
            return;
        }

        if ( codeGroup.getCreatorId() != null ) {
            mappingTarget.setCreatorId( codeGroup.getCreatorId() );
        }
        if ( codeGroup.getCreatedAt() != null ) {
            mappingTarget.setCreatedAt( codeGroup.getCreatedAt() );
        }
        if ( codeGroup.getModifierId() != null ) {
            mappingTarget.setModifierId( codeGroup.getModifierId() );
        }
        if ( codeGroup.getModifiedAt() != null ) {
            mappingTarget.setModifiedAt( codeGroup.getModifiedAt() );
        }
        if ( codeGroup.getCodeGroupId() != null ) {
            mappingTarget.setCodeGroupId( codeGroup.getCodeGroupId() );
        }
        if ( codeGroup.getCodeGroupName() != null ) {
            mappingTarget.setCodeGroupName( codeGroup.getCodeGroupName() );
        }
        if ( codeGroup.getDescription() != null ) {
            mappingTarget.setDescription( codeGroup.getDescription() );
        }
        if ( codeGroup.getSortOrder() != null ) {
            mappingTarget.setSortOrder( codeGroup.getSortOrder() );
        }
        if ( codeGroup.getSystemCodeYn() != null ) {
            mappingTarget.setSystemCodeYn( codeGroup.getSystemCodeYn() );
        }
        if ( codeGroup.getUseYn() != null ) {
            mappingTarget.setUseYn( codeGroup.getUseYn() );
        }
        if ( codeGroup.getDelYn() != null ) {
            mappingTarget.setDelYn( codeGroup.getDelYn() );
        }
    }
}
