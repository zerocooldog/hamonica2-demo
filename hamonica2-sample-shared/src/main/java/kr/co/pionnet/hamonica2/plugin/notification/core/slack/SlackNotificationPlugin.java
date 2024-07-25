package kr.co.pionnet.hamonica2.plugin.notification.core.slack;

import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import kr.co.pionnet.hamonica2.common.ParameterMap;
import kr.co.pionnet.hamonica2.plugin.notification.base.AbstractNotificationPlugin;
import kr.co.pionnet.hamonica2.plugin.notification.base.DefaultNotificationConfig;
import kr.co.pionnet.hamonica2.plugin.notification.base.NotificationMessage;
import kr.co.pionnet.hamonica2.plugin.notification.constant.NotificationType;
import kr.co.pionnet.hamonica2.plugin.notification.exception.NotificationException;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationSlackConfig;
import kr.co.pionnet.hamonica2.util.UtilText;
import kr.co.pionnet.hamonica2.zconfiguration.plugin.config.DefaultPluginConfig;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class SlackNotificationPlugin extends AbstractNotificationPlugin<NotificationMessage> {

    private final Slack slack = Slack.getInstance();


    private NotificationSlackConfig notificationSlackConfig;

    public SlackNotificationPlugin(ParameterMap parameterMap) {
        super(parameterMap);
    }

    @Override
    public void initialize() throws NotificationException {
        this.notificationSlackConfig = getParameterMap().get(DefaultPluginConfig.NOTIFICATION_CONFIG_KEY, NotificationSlackConfig.class);
    }

    @Override
    public void send(NotificationMessage notificationMessage) throws NotificationException {

        if(!isSendable(notificationMessage)){
            log.debug("It is not a sendable notification type [{}].", getNotificationType());
            return;
        }

        try {

            //일반 메세지
            if(!UtilText.isBlank(notificationSlackConfig.getOauthAccessToken())){
                sendByTokens(notificationSlackConfig.getOauthAccessToken(), notificationMessage.getMessage());
            }

            //BOT 메세지
            if(!UtilText.isBlank(notificationSlackConfig.getBotUserAccessToken())){
                sendByTokens(notificationSlackConfig.getBotUserAccessToken(), notificationMessage.getMessage());
            }

        }catch (Exception e){
            throw new NotificationException(e);
        }

    }


    private void sendByTokens(String token, String message) throws Exception{

            List<String> channels = Arrays.stream(notificationSlackConfig.getChannelIds().split(",")).toList();

            for (String channel : channels) {
                ChatPostMessageRequest request = ChatPostMessageRequest.builder()
                        .channel(channel) // 메시지를 보낼 채널명
                        .text(message)
                        .build();

                MethodsClient methods = slack.methods(notificationSlackConfig.getOauthAccessToken());

                // 메시지 전송
                ChatPostMessageResponse  response = methods.chatPostMessage(request);

                if (response.isOk()) {
                    log.debug("Message successfully sent to the Slack channel[{}].",channel);
                } else {
                    log.warn("Failed to send message to the Slack channel{}].",channel);
                }

            }
    }
}
