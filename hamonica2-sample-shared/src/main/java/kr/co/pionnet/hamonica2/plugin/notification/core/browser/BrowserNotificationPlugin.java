package kr.co.pionnet.hamonica2.plugin.notification.core.browser;

import kr.co.pionnet.hamonica2.ParameterMap;
import kr.co.pionnet.hamonica2.plugin.notification.base.AbstractNotificationPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.base.NotificationMessage;
import kr.co.pionnet.hamonica2.plugin.notification.exception.NotificationException;

public class BrowserNotificationPlugin extends AbstractNotificationPlugin<NotificationMessage> {

    public BrowserNotificationPlugin(ParameterMap parameterMap) {
        super(parameterMap);
    }

    @Override
    public void initialize() throws NotificationException {

    }

    @Override
    public void send(NotificationMessage notificationMessage) throws NotificationException {

    }
}
