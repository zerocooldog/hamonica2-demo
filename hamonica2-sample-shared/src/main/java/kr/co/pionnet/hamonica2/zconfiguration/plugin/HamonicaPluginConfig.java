package kr.co.pionnet.hamonica2.zconfiguration.plugin;

import kr.co.pionnet.hamonica2.constant.ConfigurationId;
import kr.co.pionnet.hamonica2.plugin.notification.constant.NotificationType;
import kr.co.pionnet.hamonica2.shared.constant.Const;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationEmailConfig;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationKakaoConfig;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationSlackConfig;
import kr.co.pionnet.hamonica2.shared.system.models.Configuration;
import kr.co.pionnet.hamonica2.shared.system.models.ConfigurationInputItem;
import kr.co.pionnet.hamonica2.shared.system.services.ConfigurationService;
import kr.co.pionnet.hamonica2.shared.util.UtilObject;
import kr.co.pionnet.hamonica2.shared.util.UtilText;
import kr.co.pionnet.hamonica2.zconfiguration.plugin.config.DefaultPluginConfig;
import kr.co.pionnet.hamonica2.zconfiguration.plugin.notification.property.NotificationPluginConfigProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Component
public class HamonicaPluginConfig extends DefaultPluginConfig {

//    @Autowired
//    NotificationPluginConfigProperty notificationPluginConfigProperty;

    @Autowired
    ConfigurationService configurationService;


    /**
     * 설정 아이디가 같은지 확인한다.
     * @param configurationMap 설정 객체
     * @param configurationId 설정 아이디
     * @return boolean
     */
    public boolean isEnabled(Map<String, Configuration> configurationMap, String configurationId){

        Configuration configuration = configurationMap.get(configurationId);

        return configurationId.equals(configuration.getConfigurationId())  && UtilText.isTrue(configuration.getConfigurationValue());
    }

    /**
     *  알림 객체 정보를 호출 하낟.
     * @param configurationMap 설정 객체
     * @param configurationId 설정 아이디
     * @return boolean
     */
    public List<Object> getNotificationConfig(Map<String, Configuration> configurationMap,  String configurationId){
        return (List<Object>) configurationMap.get(configurationId).getCustomConfigurationInputItems();
    }

    @Override
    public void setPlugin() {

        List<Configuration> notificationConfigurations = configurationService.getInputItemsByNotificationConfigurations();
        Map<String, Configuration> configMap = notificationConfigurations.stream().collect(Collectors.toMap(Configuration::getConfigurationId, configuration -> configuration));


            //알림 여부가 켜있지 않으면 더이상 진행하지 않는다.
            if (!isEnabled(configMap, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_ENABLED)) {
                log.debug("The notification plugin usage is not enabled");
                return;
            }


            //Browser 알림 옵션이 켜져있으면 Browser 알림 플러그인을 실행한다.
//        if(isEnabled(notificationConfiguration, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_BROWSER_ENABLED)){
//
//            Plugin.NOTIFICATION .create( newParameterMap(
//                    Map.entry(NOTIFICATION_TYPE_KEY, NotificationType.BROWSER),
//                    Map.entry(NOTIFICATION_CONFIG_KEY, (NotificationSlackConfig)getNotificationConfig(notificationConfigurations, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_BROWSER))
//            ));
//        }

            //Email 알림 옵션이 켜져있으면 Email 알림 플러그인을 실행한다.
//            if (isEnabled(notificationConfiguration, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_EMAIL_ENABLED)) {
//
//                Plugin.NOTIFICATION.create(newParameterMap(
//                        Map.entry(NOTIFICATION_TYPE_KEY, NotificationType.EMAIL),
//                        Map.entry(NOTIFICATION_CONFIG_KEY, getNotificationConfig(notificationConfigurations, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_EMAIL))
//                ));
//            }

            //SMS 알림 옵션이 켜져있으면 SMS 알림 플러그인을 실행한다.
//        if(notificationPluginConfigProperty.getSms().isEnabled()){
//
//            Plugin.NOTIFICATION .create( newParameterMap(
//                    Map.entry(NOTIFICATION_TYPE_KEY, NotificationType.SMS),
//                    Map.entry(NOTIFICATION_CONFIG_KEY, (NotificationSlackConfig)getNotificationConfig(notificationConfigurations, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_BROWSER))
//            ));
//        }

        //SLACK 알림 옵션이 켜져있으면 슬랙 알림 플러그인을 실행한다.
        if (isEnabled(configMap, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_SLACK_ENABLED)) {


            List<Object> slackConfigs = getNotificationConfig(configMap, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_SLACK);

            for (Object slackConfig : slackConfigs) {
                Plugin.NOTIFICATION.create(newParameterMap(
                        Map.entry(NOTIFICATION_TYPE_KEY, NotificationType.SLACK),
                        Map.entry(NOTIFICATION_CONFIG_KEY, slackConfig)
                ));
            }

        }

        //Kakao Talk 알림 옵션이 켜져있으면 Kakao Talk 알림 플러그인을 실행한다.
//        if (isEnabled(notificationConfiguration, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_KAKAO_TALK_ENABLED)) {
//
//            Plugin.NOTIFICATION.create(newParameterMap(
//                    Map.entry(NOTIFICATION_TYPE_KEY, NotificationType.KAKAO_TALK),
//                    Map.entry(NOTIFICATION_CONFIG_KEY, getNotificationConfig(notificationConfigurations, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_BROWSER))
//            ));
//        }
//
//        //Kakao Work 알림 옵션이 켜져있으면 Kakao work 알림 플러그인을 실행한다.
//        if (isEnabled(notificationConfiguration, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_KAKAO_WORK_ENABLED)) {
//
//            Plugin.NOTIFICATION.create(newParameterMap(
//                    Map.entry(NOTIFICATION_TYPE_KEY, NotificationType.KAKAO_WORK),
//                    Map.entry(NOTIFICATION_CONFIG_KEY, getNotificationConfig(notificationConfigurations, ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_BROWSER))
//            ));
//        }

            //Naver Line 알림 옵션이 켜져있으면 Naver Line 알림 플러그인을 실행한다.
//        if(notificationPluginConfigProperty.getNaverLine().isEnabled()){
//
//            Plugin.NOTIFICATION .create( newParameterMap(
//                    Map.entry(NOTIFICATION_TYPE_KEY, NotificationType.KAKAO_WORK),
//                    Map.entry(NOTIFICATION_CONFIG_KEY, notificationPluginConfigProperty.getNaverLine())
//            ));
//        }

            //Naver Line 알림 옵션이 켜져있으면 Naver Line 알림 플러그인을 실행한다.
//        if(notificationPluginConfigProperty.getJandi().isEnabled()){
//
//            Plugin.NOTIFICATION .create( newParameterMap(
//                    Map.entry(NOTIFICATION_TYPE_KEY, NotificationType.JANDI),
//                    Map.entry(NOTIFICATION_CONFIG_KEY, notificationPluginConfigProperty.getJandi())
//            ));
//        }
    }
}
