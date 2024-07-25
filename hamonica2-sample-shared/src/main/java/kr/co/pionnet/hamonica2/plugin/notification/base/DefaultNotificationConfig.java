package kr.co.pionnet.hamonica2.plugin.notification.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public abstract class DefaultNotificationConfig {

    /**
     * 알림 사용 여부
     */
    private boolean enabled;
}
