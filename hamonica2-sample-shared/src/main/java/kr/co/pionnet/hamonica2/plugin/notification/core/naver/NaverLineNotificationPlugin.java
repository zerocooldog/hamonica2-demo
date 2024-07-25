package kr.co.pionnet.hamonica2.plugin.notification.core.naver;

import kr.co.pionnet.hamonica2.common.ParameterMap;
import kr.co.pionnet.hamonica2.plugin.notification.base.AbstractNotificationPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.base.NotificationMessage;
import kr.co.pionnet.hamonica2.plugin.notification.exception.NotificationException;

public class NaverLineNotificationPlugin extends AbstractNotificationPlugin<NotificationMessage> {

    public NaverLineNotificationPlugin(ParameterMap parameterMap) {
        super(parameterMap);
    }

    @Override
    public void initialize() throws NotificationException {

    }

    @Override
    public void send(NotificationMessage notificationMessage) throws NotificationException {

    }
}
