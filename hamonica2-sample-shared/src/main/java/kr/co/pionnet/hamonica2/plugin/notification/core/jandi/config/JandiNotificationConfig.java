package kr.co.pionnet.hamonica2.plugin.notification.core.jandi.config;

import kr.co.pionnet.hamonica2.plugin.notification.base.DefaultNotificationConfig;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class JandiNotificationConfig extends DefaultNotificationConfig {

    private String oAuthAccessToken;
    private String botUserAccessToken;
    private List<String> channelIds;

}
