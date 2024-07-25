package kr.co.pionnet.hamonica2.shared.notification.mappers;

import kr.co.pionnet.hamonica2.shared.notification.models.NotificationConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationConfigEntities;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface NotificationConfigMapper extends DefaultMapStructMapper<NotificationConfig, NotificationConfigEntities>{

}
