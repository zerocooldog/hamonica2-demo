package kr.co.pionnet.hamonica2.shared.system.services;

import kr.co.pionnet.hamonica2.constant.ConfigurationId;
import kr.co.pionnet.hamonica2.shared.constant.Const;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationConfig;
import kr.co.pionnet.hamonica2.shared.notification.services.NotificationService;
import kr.co.pionnet.hamonica2.shared.system.mappers.ConfigurationInputItemMapper;
import kr.co.pionnet.hamonica2.shared.system.mappers.ConfigurationMapper;
import kr.co.pionnet.hamonica2.shared.system.models.ConfigurationInputItem;
import kr.co.pionnet.hamonica2.shared.system.repository.master.ConfigurationInputItemRepository;
import kr.co.pionnet.hamonica2.shared.system.repository.master.ConfigurationRepository;
import kr.co.pionnet.hamonica2.shared.system.models.Configuration;
import kr.co.pionnet.hamonica2.shared.util.UtilObject;
import kr.co.pionnet.hamonica2.util.UtilText;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ConfigurationService {

    @Autowired
    NotificationService notificationService;

    @Autowired
    ConfigurationRepository configurationRepository;

    @Autowired
    ConfigurationInputItemRepository configurationInputItemRepository;

    @Autowired
    ConfigurationMapper configurationMapper;

    @Autowired
    private ConfigurationInputItemMapper configurationInputItemMapper;

    /**
     * 설정 정보 전체를 가져온다
     * @return List<Configuration>
     */
    public List<Configuration> findAll(){
        return  configurationMapper.toDtoList(configurationRepository.findAll());
    }


    public List<Configuration> getInputItemsByConfigurations() {
        return getInputItemsByConfigurations(null);
    }
        /**
         * 설정 정보 전체를 가져온다
         * @return List<Configuration>
         */
    public List<Configuration> getInputItemsByConfigurations(String configurationId){

        List<Configuration> configurations = UtilText.isBlank(configurationId) ?  findAll() : findHierachyByConfigurationId(configurationId);
        Map<String, List<ConfigurationInputItem>>  configurationInputItemsMap = new HashMap<>();

        NotificationConfig notificationConfig = notificationService.getNotificationConfigs();

        List<ConfigurationInputItem> configurationInputItems = configurationInputItemMapper.toDtoList(configurationInputItemRepository.findAll());

        if(UtilObject.isNotEmpty(configurationInputItems)){
            configurationInputItemsMap = configurationInputItems.stream().collect(Collectors.groupingBy(ConfigurationInputItem::getConfigurationId, Collectors.toList()));
        }


        for (Configuration configuration : configurations) {
            configuration.setConfigurationInputItems(configurationInputItemsMap.get(configuration.getConfigurationId()));

            if(ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_BROWSER.equals(configuration.getConfigurationId())){
//                configuration.setCustomConfigurationInputItems(notificationConfig.get());
            }else if(ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_EMAIL.equals(configuration.getConfigurationId())){
                configuration.setCustomConfigurationInputItems(notificationConfig.getNotificationEmailConfigs());
            }else if(ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION_SLACK.equals(configuration.getConfigurationId())){
                configuration.setCustomConfigurationInputItems(notificationConfig.getNotificationSlackConfigs());
            }
        }

        return  configurations;
    }

    /**
     *  알림 설정 정보 전체를 가져온다
     * @return List<Configuration>
     */
    public List<Configuration> getInputItemsByNotificationConfigurations(){
        return  getInputItemsByConfigurations(ConfigurationId.HAMONICA_PLUGIN_NOTIFICATION);
    }

    /**
     * 설정 정보를 계층형으로 가져온다.
     * @param configurationId 설정 아이디
     * @return List<Configuration>
     */
    public List<Configuration> findHierachyByConfigurationId(String configurationId){
        return  configurationMapper.toDtoList(configurationRepository.findHierachyByConfigurationId(configurationId, Const.BOOLEAN_TRUE));
    }

    /**
     * 설정 정보를 계층형으로 가져온다.
     * @param configurationId 설정 아이디
     * @param useYn 사용 여부
     * @return List<Configuration>
     */
    public List<Configuration> findHierachyByConfigurationIdAndUseYn(String configurationId, String useYn){
        return  configurationMapper.toDtoList(configurationRepository.findHierachyByConfigurationId(configurationId, useYn));
    }


}
