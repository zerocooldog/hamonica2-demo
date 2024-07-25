package kr.co.pionnet.hamonica2.zconfiguration;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.pionnet.butterfly2.core.util.UtilObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ComponentScan(basePackages = {
        "kr.co.pionnet.butterfly2",
        "kr.co.pionnet.hamonica2.shared.common.mappers"
})
public class HamonicaConfiguration {

    /**
     * @Configuration 호출 되기 전에 @Component 어노테이션 먼저 호출 된다.
     * 특정 객체를 읽고 난 후 미리 설정해야할 로직이 있으면 사용한다.
     *
     * @since 2024-05-28
     * @author 장진철(zerocooldog@pionnet.co.kr)
     */
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return beanFactory -> {

            log.debug("start BeanFactoryPostProcessor");

            //ObjectMapper를 설정 한다.
            UtilObjectMapper.setObjectMapper( beanFactory.getBean(ObjectMapper.class));

        };
    }
}
