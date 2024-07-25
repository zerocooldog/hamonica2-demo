package kr.co.pionnet.hamonica2.plugin.notification.base;

import kr.co.pionnet.hamonica2.plugin.notification.constant.NotificationType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class NotificationMessage {

    private final List<NotificationType> notificationTypes = new ArrayList<>();

    private String message;

    /**
     * 활성화 되어 있는 모든 알림 유형으로 메세지를 전송 가능.
     * 
     * @return boolean
     */
    public boolean isAll(){
        return notificationTypes.isEmpty();
    }

    /**
     * 활성화 되어 있는 모든 알림 유형으로 메세지를 전송 가능.
     *
     * @return boolean
     */
    public boolean isSendableByNotificationType(NotificationType notificationType){
        return notificationTypes.contains(notificationType);
    }
}
