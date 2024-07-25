package kr.co.pionnet.hamonica2.zconfiguration.plugin.config;

import kr.co.pionnet.hamonica2.common.ParameterMap;

import java.util.Map;

public abstract class DefaultPluginConfig implements PluginConfig {

    public static final String NOTIFICATION_TYPE_KEY = "notificationType";

    public static final String NOTIFICATION_CONFIG_KEY = "notificationConfig";

    /**
     * 플러그인 생성에 필요한 파라메터터 값 설정
     * @param entries 플러그인 생성에 필요한 파라메터터 값
     * @return ParameterMap
     *
     * @author 장진철(zerocooldog@pionnet.co.kr)
     * @since 2024-06-28
     */
    @SafeVarargs
    public final  ParameterMap newParameterMap(Map.Entry<String, Object>... entries){
        return new ParameterMap(Map.ofEntries(
                entries
        ));
    }

}
