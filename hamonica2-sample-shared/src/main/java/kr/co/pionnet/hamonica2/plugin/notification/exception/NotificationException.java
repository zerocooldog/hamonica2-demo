package kr.co.pionnet.hamonica2.plugin.notification.exception;

public class NotificationException extends RuntimeException {


    public NotificationException(Throwable throwable) {
        super(throwable);
    }

    public NotificationException(String message) {
        super(message);
    }

    public NotificationException(String message, Throwable cause) {
        super(message, cause);
    }
}