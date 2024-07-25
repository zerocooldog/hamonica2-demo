package kr.co.pionnet.hamonica2.shared.notification.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationConfig {

    List<NotificationEmailConfig> notificationEmailConfigs;

    List<NotificationSlackConfig> notificationSlackConfigs;

    List<NotificationKakaoConfig> notificationKakaoConfigs;

}
