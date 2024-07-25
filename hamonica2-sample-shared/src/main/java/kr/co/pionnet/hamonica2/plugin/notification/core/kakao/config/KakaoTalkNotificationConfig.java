package kr.co.pionnet.hamonica2.plugin.notification.core.kakao.config;

import kr.co.pionnet.hamonica2.plugin.notification.base.DefaultNotificationConfig;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class KakaoTalkNotificationConfig extends DefaultNotificationConfig {
}
