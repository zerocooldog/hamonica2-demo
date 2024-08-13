package kr.co.pionnet.hamonica2.ha.members.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.ha.members.models.Member;
import kr.co.pionnet.hamonica2.ha.members.repository.master.entity.MemberEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T10:59:46+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberEntity toEntity(Member model) {
        if ( model == null ) {
            return null;
        }

        MemberEntity memberEntity = new MemberEntity();

        setCreatorId( memberEntity );

        return memberEntity;
    }

    @Override
    public Member toDto(MemberEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Member member = new Member();

        return member;
    }

    @Override
    public List<MemberEntity> toEntityList(List<Member> model) {
        if ( model == null ) {
            return null;
        }

        List<MemberEntity> list = new ArrayList<MemberEntity>( model.size() );
        for ( Member member : model ) {
            list.add( toEntity( member ) );
        }

        setCreatorId( list );

        return list;
    }

    @Override
    public List<Member> toDtoList(List<MemberEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<Member> list = new ArrayList<Member>( entity.size() );
        for ( MemberEntity memberEntity : entity ) {
            list.add( toDto( memberEntity ) );
        }

        return list;
    }

    @Override
    public MemberEntity partialUpdate(Member model, MemberEntity entity) {
        if ( model == null ) {
            return entity;
        }

        setCreatorId( entity );

        return entity;
    }

    @Override
    public List<MemberEntity> partialUpdatse(List<Member> model, List<MemberEntity> entity) {
        if ( model == null ) {
            return entity;
        }

        entity.clear();
        for ( Member member : model ) {
            entity.add( toEntity( member ) );
        }

        setCreatorId( entity );

        return entity;
    }
}
