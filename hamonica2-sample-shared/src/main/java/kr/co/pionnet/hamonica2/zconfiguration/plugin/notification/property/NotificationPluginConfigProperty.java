package kr.co.pionnet.hamonica2.zconfiguration.plugin.notification.property;

import kr.co.pionnet.hamonica2.plugin.notification.core.browser.config.BrowserNotificationConfig;
import kr.co.pionnet.hamonica2.plugin.notification.core.jandi.config.JandiNotificationConfig;
import kr.co.pionnet.hamonica2.plugin.notification.core.kakao.config.KakaoTalkNotificationConfig;
import kr.co.pionnet.hamonica2.plugin.notification.core.kakao.config.KakaoWorkNotificationConfig;
import kr.co.pionnet.hamonica2.plugin.notification.core.mail.config.EmailNotificationConfig;
import kr.co.pionnet.hamonica2.plugin.notification.core.naver.config.NaverLineNotificationConfig;
import kr.co.pionnet.hamonica2.plugin.notification.core.slack.config.SlackNotificationConfig;
import kr.co.pionnet.hamonica2.plugin.notification.core.sms.config.SmsNotificationConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "hamonica.plugin.notification")
@Data
public class NotificationPluginConfigProperty {

    /**
     * 알림 사용 여부
     */
    private boolean enabled;

    /**
     * 브라우저 알림 설정 값
     */
    private BrowserNotificationConfig browser;

    /**
     * 이메일 알림 설정 값
     */
    private EmailNotificationConfig email;

    /**
     * SMS 알림 설정 값
     */
    private SmsNotificationConfig sms;

    /**
     * Slack 알림 설정 값
     */
    private SlackNotificationConfig slack;

    /**
     * KakaoTalk 알림 설정 값
     */
    private KakaoTalkNotificationConfig kakaoTalk;

    /**
     * KakaoWork 알림 설정 값
     */
    private KakaoWorkNotificationConfig kakaoWork;

    /**
     * Naver Line 알림 설정 값
     */
    private NaverLineNotificationConfig naverLine;

    /**
     * Jandi 알림 설정 값
     */
    private JandiNotificationConfig jandi;
}
