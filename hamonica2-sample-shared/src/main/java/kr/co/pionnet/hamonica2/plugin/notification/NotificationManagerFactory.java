package kr.co.pionnet.hamonica2.plugin.notification;

import jakarta.validation.constraints.NotNull;
import kr.co.pionnet.hamonica2.ParameterMap;
import kr.co.pionnet.hamonica2.plugin.ServiceFactory;
import kr.co.pionnet.hamonica2.plugin.notification.base.NotificationMessage;
import kr.co.pionnet.hamonica2.plugin.notification.base.NotificationPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.constant.NotificationType;
import kr.co.pionnet.hamonica2.plugin.notification.core.browser.BrowserNotificationPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.exception.NotificationException;
import kr.co.pionnet.hamonica2.plugin.notification.core.kakao.KakaoNotificationPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.core.mail.EmailNotificationPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.core.slack.SlackNotificationPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.core.sms.SmsNotificationPlugin;
import kr.co.pionnet.hamonica2.shared.util.UtilObject;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class NotificationManagerFactory implements ServiceFactory, NotificationPlugin<NotificationMessage> {

    private static final ConcurrentHashMap<NotificationType, List<NotificationPlugin>> mixedTypeNotifications = new ConcurrentHashMap<>();

    private NotificationPlugin setPlugin(@NotNull NotificationType notificationType , @NotNull ParameterMap parameterMap) {

        return switch (notificationType) {
            case BROWSER -> new BrowserNotificationPlugin(parameterMap);
            case EMAIL -> new EmailNotificationPlugin(parameterMap);
            case SMS -> new SmsNotificationPlugin(parameterMap);
            case NAVER_LINE -> new KakaoNotificationPlugin(parameterMap);
            case KAKAO_TALK, KAKAO_WORK -> new KakaoNotificationPlugin(parameterMap);
            case SLACK -> new SlackNotificationPlugin(parameterMap);
            default -> null;
        };
    }

    @Override
    public void create(ParameterMap parameterMap) {

        //알림 유형값 가져오기
        NotificationType notificationType = parameterMap.get("notificationType", NotificationType.class);


        //알림 유형에 맞게 알림 유형 플러그인 객체를 생성
        //알이 유형 플러그인 객체가 생성 되면 알림 유형별로 플러그인 객체를 설정

        NotificationPlugin plugin = setPlugin(notificationType, parameterMap);

        if(!mixedTypeNotifications.containsKey(notificationType)){
            mixedTypeNotifications.put(notificationType, new ArrayList<>());
        }

        if(!UtilObject.isEmpty(plugin)){
            mixedTypeNotifications.get(notificationType).add(plugin);
        }else{
            log.warn("Unsupported notification type [{}].",notificationType);
        }
    }


    @Override
    public void send(NotificationMessage notificationMessage) throws NotificationException {

        // 순회하면서 데이터 출력
        mixedTypeNotifications.forEach((key, notification) -> {

            notification.forEach(notificationPlugin -> notificationPlugin.send(notificationMessage));

        });
    }


}