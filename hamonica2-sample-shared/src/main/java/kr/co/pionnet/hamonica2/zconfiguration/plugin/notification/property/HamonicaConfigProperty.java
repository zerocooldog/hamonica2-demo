package kr.co.pionnet.hamonica2.zconfiguration.plugin.notification.property;

import kr.co.pionnet.hamonica2.plugin.notification.core.slack.config.SlackNotificationConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "hamonica")
@Data
public class HamonicaConfigProperty {

    private boolean enabled;

    private SlackNotificationConfig slack;
}
