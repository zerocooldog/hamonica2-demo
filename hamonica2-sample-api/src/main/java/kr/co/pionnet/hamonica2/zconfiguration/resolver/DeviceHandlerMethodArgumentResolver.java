package kr.co.pionnet.hamonica2.zconfiguration.resolver;


import kr.co.pionnet.butterfly2.core.device.Device;
import kr.co.pionnet.butterfly2.core.device.DeviceUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Spring MVC {@link HandlerMethodArgumentResolver} that resolves @Controller MethodParameters of type {@link Device}
 * to the value of the web request's {@link DeviceUtils#CURRENT_DEVICE_ATTRIBUTE current device} attribute.
 * @author Roy Clarkson
 */
public class DeviceHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

	public boolean supportsParameter(MethodParameter parameter) {
		return Device.class.isAssignableFrom(parameter.getParameterType());
	}

	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer modelAndViewContainer,
								  NativeWebRequest request, WebDataBinderFactory binderFactory) throws Exception {
		return DeviceUtils.getCurrentDevice(request);
	}

}
