package kr.co.pionnet.hamonica2.shared.common.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-31T11:13:57+0900",
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

        return codeEntity;
    }

    @Override
    public Code toDto(CodeEntity codeEntity) {
        if ( codeEntity == null ) {
            return null;
        }

        Code code = new Code();

        return code;
    }

    @Override
    public CodeEntity partialUpdate(Code code, CodeEntity codeEntity) {
        if ( code == null ) {
            return codeEntity;
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
}
