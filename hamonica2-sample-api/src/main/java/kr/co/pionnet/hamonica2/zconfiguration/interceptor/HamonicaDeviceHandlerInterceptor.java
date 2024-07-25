package kr.co.pionnet.hamonica2.zconfiguration.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.pionnet.butterfly2.core.device.Device;
import kr.co.pionnet.butterfly2.core.device.DeviceResolver;
import kr.co.pionnet.butterfly2.core.device.DeviceUtils;
import kr.co.pionnet.butterfly2.core.device.LiteDeviceResolver;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * A Spring MVC interceptor that resolves the Device that originated the web request <i>before</i> any request handler is invoked.
 * The resolved Device is exported as a request attribute under the well-known name of {@link DeviceUtils#CURRENT_DEVICE_ATTRIBUTE}.
 * Request handlers such as @Controllers and views may then access the currentDevice to vary their control and rendering logic, respectively.
 * @author Keith Donald
 */
public class HamonicaDeviceHandlerInterceptor implements HandlerInterceptor {

	private final DeviceResolver deviceResolver;

	/**
	 * Create a device resolving {@link HandlerInterceptor} that defaults to a {@link LiteDeviceResolver} implementation.
	 */
	public HamonicaDeviceHandlerInterceptor() {
		this(new LiteDeviceResolver());
	}

	/**
	 * Create a device resolving {@link HandlerInterceptor}.
	 * @param deviceResolver the device resolver to delegate to in {@link #preHandle(HttpServletRequest, HttpServletResponse, Object)}.
	 */
	public HamonicaDeviceHandlerInterceptor(DeviceResolver deviceResolver) {
		this.deviceResolver = deviceResolver;
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Device device = (Device) deviceResolver.resolveDevice(request);
		request.setAttribute(DeviceUtils.CURRENT_DEVICE_ATTRIBUTE, device);
		return true;
	}

}
