package kr.co.pionnet.hamonica2.zconfiguration.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.pionnet.hamonica2.zconfiguration.interceptor.HamonicaDeviceHandlerInterceptor;
import kr.co.pionnet.hamonica2.zconfiguration.interceptor.HamonicaLocaleInterceptor;
import kr.co.pionnet.hamonica2.zconfiguration.resolver.DeviceHandlerMethodArgumentResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.List;

@Slf4j
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    private final ObjectMapper jacksonObjectMapper;

    public WebMvcConfig(ObjectMapper jacksonObjectMapper) {
        this.jacksonObjectMapper = jacksonObjectMapper;
    }

    /**
     * 기존의 MappingJackson2HttpMessageConverter를 재정의 한다.
     * Instant 객체를 json으로 Controller 변환시 : Java 8 date/time type java.time.Instant not supported by default: add Module  오류가 나서 설정 함.
     *
     * @return MappingJackson2HttpMessageConverter
     */
    @Bean
    public MappingJackson2HttpMessageConverter customMappingJackson2HttpMessageConverter() {
        return  new MappingJackson2HttpMessageConverter(jacksonObjectMapper);
    }

    /**
     * 기본 컨버터를 확장하거나 수정 한다.
     *
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(customMappingJackson2HttpMessageConverter());
    }



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(hamonicaLocaleInterceptor());
        registry.addInterceptor(hamonicaDeviceHandlerInterceptor());
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        //컨트롤러 매개변수에 Device 객체를 가져올수 있다.
        resolvers.add(deviceHandlerMethodArgumentResolver());
    }

    /**
     * 접속 디바이스(mobile,tablet,pc) 판단하는 객체를 사용할 수 있도 Controller argument에 등록.
     *
     * @return DeviceHandlerMethodArgumentResolver
     */
    @Bean
    public DeviceHandlerMethodArgumentResolver deviceHandlerMethodArgumentResolver() {
        return new DeviceHandlerMethodArgumentResolver();
    }


    /**
     * 접속 디바이스(mobile,tablet,pc) 판단하는 핸들러 등록
     *  spring-mobile 프로젝트가 중단 되었고 지원하는 버전도 spring-boot2까지만 된다.
     *  spring-boot3에서 사용하기 위하여 아래 패키지에서 리팩토링하여 사용한다.
     *
     * @see kr/co/pionnet/hamonica2/zconfiguration/interceptor/mobile/device
     * @see kr/co/pionnet/hamonica2/zconfiguration/interceptor/DeviceResolverHandlerInterceptor.java
     *
     * @return DeviceResolverHandlerInterceptor
     *
     * @author 장진철(zerocooldog@pionnet.co.kr)
     */
    @Bean
    public HamonicaDeviceHandlerInterceptor hamonicaDeviceHandlerInterceptor() {
        return new HamonicaDeviceHandlerInterceptor();
    }

    /**
     * 기본적으로 http header에 담겨오는 언어값으로 설정한다.
     *
     * @return LocaleResolver
     * @author 장진철(zerocooldog@pionnet.co.kr)
     */
    @Bean
    LocaleResolver localeResolver() {
        return new AcceptHeaderLocaleResolver();
    }

    @Bean
    public HamonicaLocaleInterceptor hamonicaLocaleInterceptor() {
        return new HamonicaLocaleInterceptor();
    }


}

