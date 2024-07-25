package kr.co.pionnet.hamonica2.shared.util;

import kr.co.pionnet.butterfly2.core.provider.CommonContextProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

@Slf4j
public class UtilContext {

	public static ApplicationContext getContext() {
		return CommonContextProvider.getApplicationContext();
	}

	public static Object getBean(String beanName) {
		ApplicationContext applicationContext = getContext();
		return applicationContext.getBean(beanName);
	}

	public static <T> T getBean(Class<?> clazz) {
		ApplicationContext applicationContext = getContext();
		return (T) applicationContext.getBean(clazz);
	}

}
