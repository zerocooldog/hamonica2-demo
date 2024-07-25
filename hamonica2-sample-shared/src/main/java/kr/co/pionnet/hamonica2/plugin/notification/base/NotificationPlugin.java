package kr.co.pionnet.hamonica2.plugin.notification.base;

import kr.co.pionnet.hamonica2.plugin.notification.exception.NotificationException;

public interface NotificationPlugin<NotificationMessage> {


    void send(NotificationMessage notificationMessage) throws NotificationException;

}
