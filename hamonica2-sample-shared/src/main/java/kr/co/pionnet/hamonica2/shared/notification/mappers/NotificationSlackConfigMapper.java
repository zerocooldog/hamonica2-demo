package kr.co.pionnet.hamonica2.shared.notification.mappers;

import kr.co.pionnet.hamonica2.shared.notification.models.NotificationSlackConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationSlackConfigEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface NotificationSlackConfigMapper extends DefaultMapStructMapper<NotificationSlackConfig, NotificationSlackConfigEntity> {
}