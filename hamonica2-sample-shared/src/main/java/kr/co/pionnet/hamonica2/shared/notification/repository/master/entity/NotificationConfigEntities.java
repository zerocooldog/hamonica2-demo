package kr.co.pionnet.hamonica2.shared.notification.repository.master.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationConfigEntities {

    List<NotificationMailConfigEntity> notificationMailConfigs;

    List<NotificationSlackConfigEntity> notificationSlackConfigs;

    List<NotificationKakaoConfigEntity> notificationKakaoConfigs;

}
