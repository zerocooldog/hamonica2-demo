package kr.co.pionnet.hamonica2.shared.notification.mappers;

import kr.co.pionnet.hamonica2.shared.notification.models.NotificationEmailConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationMailConfigEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface NotificationMailConfigMapper extends DefaultMapStructMapper<NotificationEmailConfig, NotificationMailConfigEntity> {


}