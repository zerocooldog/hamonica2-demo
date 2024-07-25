package kr.co.pionnet.hamonica2.ha.members.mappers;

import kr.co.pionnet.hamonica2.ha.members.models.Member;
import kr.co.pionnet.hamonica2.ha.members.repository.master.entity.MemberEntity;
import kr.co.pionnet.hamonica2.shared.notification.mappers.DefaultMapStructMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MemberMapper extends DefaultMapStructMapper<Member, MemberEntity> {
}