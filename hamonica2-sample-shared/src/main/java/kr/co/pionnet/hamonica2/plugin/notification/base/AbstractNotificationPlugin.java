package kr.co.pionnet.hamonica2.plugin.notification.base;

import kr.co.pionnet.hamonica2.common.ParameterMap;
import kr.co.pionnet.hamonica2.plugin.HamonicaPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.constant.NotificationType;
import kr.co.pionnet.hamonica2.zconfiguration.plugin.config.DefaultPluginConfig;
import lombok.Getter;

@Getter
public abstract class AbstractNotificationPlugin<T> implements NotificationPlugin<T>, HamonicaPlugin {

    ParameterMap parameterMap = new ParameterMap();

    private final NotificationType notificationType;

    public AbstractNotificationPlugin(ParameterMap parameterMap){
        this.parameterMap = parameterMap;
        this.notificationType = parameterMap.get(DefaultPluginConfig.NOTIFICATION_TYPE_KEY, NotificationType.class);

        initialize();
    }

    /**
     * 전송 가능한지 여부
     * @param notificationMessage 알림 메세지 객체
     * @return boolean
     */
    public boolean isSendable(NotificationMessage notificationMessage){

        if(!notificationMessage.isAll()){
            return notificationMessage.isSendableByNotificationType(this.notificationType);
        }

        return true;
    }
}
