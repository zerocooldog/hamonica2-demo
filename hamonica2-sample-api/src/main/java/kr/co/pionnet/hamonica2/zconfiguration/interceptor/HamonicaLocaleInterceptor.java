package kr.co.pionnet.hamonica2.zconfiguration.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

/**
 * 컨트롤러 실행 시 전, 후 처리
 *
 * @since 2019.05.22 03:23
 * @author 장진철(zerocooldog@nadoosoft.com) (zerocooldog@nadoosoft.com0)
 *
 *         <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력		
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2024.05.22 03:23 - 장진철 : 최초 작성
 *         </PRE>
 */
@Slf4j
@Component
public class HamonicaLocaleInterceptor implements HandlerInterceptor {

	@Autowired
	LocaleResolver localeResolver; //see: WebMvcConfig.localeResolver()

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		Locale locale = localeResolver.resolveLocale(request);
		String language = locale.getLanguage();

		log.debug("locale : {}", language);
		//사용자 정보

		//사용자 정보가 있고 현재 언어코드와 사용자 언어코드가 일치하지 않으면 사용자 언어코드로 설정 한다.
//		if(!language.equals(userInfo.getLanguage())){
//			LocaleContextHolder.setLocale(new Locale(language, countryCode);
//		}

		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}