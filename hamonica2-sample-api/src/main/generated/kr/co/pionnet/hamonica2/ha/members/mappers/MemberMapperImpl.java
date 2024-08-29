package kr.co.pionnet.hamonica2.ha.members.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.ha.members.models.Member;
import kr.co.pionnet.hamonica2.ha.members.repository.master.entity.MemberEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-16T16:50:09+0900",
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

        memberEntity.setMemberId( model.getMemberId() );
        memberEntity.setEmail( model.getEmail() );
        memberEntity.setUserName( model.getUserName() );
        memberEntity.setNickName( model.getNickName() );
        memberEntity.setPassword( model.getPassword() );
        memberEntity.setDescription( model.getDescription() );
        memberEntity.setCompanyName( model.getCompanyName() );
        memberEntity.setRoleId( model.getRoleId() );
        memberEntity.setCellNo1( model.getCellNo1() );
        memberEntity.setCellNo2( model.getCellNo2() );
        memberEntity.setApprovalYn( model.getApprovalYn() );
        memberEntity.setLockYn( model.getLockYn() );
        memberEntity.setExpireYn( model.getExpireYn() );
        memberEntity.setUseYn( model.getUseYn() );
        memberEntity.setCountryCode( model.getCountryCode() );
        memberEntity.setServerGroupId( model.getServerGroupId() );
        memberEntity.setAccountStartDatetime( model.getAccountStartDatetime() );
        memberEntity.setAccountEndDatetime( model.getAccountEndDatetime() );

        setCreatorId( memberEntity );

        return memberEntity;
    }

    @Override
    public Member toDto(MemberEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Member.MemberBuilder member = Member.builder();

        member.memberId( entity.getMemberId() );
        member.email( entity.getEmail() );
        member.userName( entity.getUserName() );
        member.nickName( entity.getNickName() );
        member.password( entity.getPassword() );
        member.description( entity.getDescription() );
        member.companyName( entity.getCompanyName() );
        member.roleId( entity.getRoleId() );
        member.cellNo1( entity.getCellNo1() );
        member.cellNo2( entity.getCellNo2() );
        member.approvalYn( entity.getApprovalYn() );
        member.lockYn( entity.getLockYn() );
        member.expireYn( entity.getExpireYn() );
        member.useYn( entity.getUseYn() );
        member.countryCode( entity.getCountryCode() );
        member.serverGroupId( entity.getServerGroupId() );
        member.accountStartDatetime( entity.getAccountStartDatetime() );
        member.accountEndDatetime( entity.getAccountEndDatetime() );

        return member.build();
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

        if ( model.getMemberId() != null ) {
            entity.setMemberId( model.getMemberId() );
        }
        if ( model.getEmail() != null ) {
            entity.setEmail( model.getEmail() );
        }
        if ( model.getUserName() != null ) {
            entity.setUserName( model.getUserName() );
        }
        if ( model.getNickName() != null ) {
            entity.setNickName( model.getNickName() );
        }
        if ( model.getPassword() != null ) {
            entity.setPassword( model.getPassword() );
        }
        if ( model.getDescription() != null ) {
            entity.setDescription( model.getDescription() );
        }
        if ( model.getCompanyName() != null ) {
            entity.setCompanyName( model.getCompanyName() );
        }
        if ( model.getRoleId() != null ) {
            entity.setRoleId( model.getRoleId() );
        }
        if ( model.getCellNo1() != null ) {
            entity.setCellNo1( model.getCellNo1() );
        }
        if ( model.getCellNo2() != null ) {
            entity.setCellNo2( model.getCellNo2() );
        }
        if ( model.getApprovalYn() != null ) {
            entity.setApprovalYn( model.getApprovalYn() );
        }
        if ( model.getLockYn() != null ) {
            entity.setLockYn( model.getLockYn() );
        }
        if ( model.getExpireYn() != null ) {
            entity.setExpireYn( model.getExpireYn() );
        }
        if ( model.getUseYn() != null ) {
            entity.setUseYn( model.getUseYn() );
        }
        if ( model.getCountryCode() != null ) {
            entity.setCountryCode( model.getCountryCode() );
        }
        if ( model.getServerGroupId() != null ) {
            entity.setServerGroupId( model.getServerGroupId() );
        }
        if ( model.getAccountStartDatetime() != null ) {
            entity.setAccountStartDatetime( model.getAccountStartDatetime() );
        }
        if ( model.getAccountEndDatetime() != null ) {
            entity.setAccountEndDatetime( model.getAccountEndDatetime() );
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
