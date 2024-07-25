package kr.co.pionnet.hamonica2.shared.notification.mappers;

import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationKakaoConfigEntity;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationKakaoConfig;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface NotificationKakaoConfigMapper extends DefaultMapStructMapper<NotificationKakaoConfig, NotificationKakaoConfigEntity>{

}