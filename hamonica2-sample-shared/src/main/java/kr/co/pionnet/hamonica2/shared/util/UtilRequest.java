package kr.co.pionnet.hamonica2.shared.util;


import jakarta.servlet.http.HttpServletRequest;

/**
 * 본 클래스는 HttpServletRequest 처리에 도움을 주는 유틸 클래스이다. 모든 프로젝트에서 사용할 유틸성 메소드를 구현할
 * 경우에는 이곳에서 추가한다.
 * 
 * 단. 프로젝트 특성을 타는 유틸은 각 프로젝트 kr.co.pionnet.hamonica.util 패키지에서 별도 정의 한다.
 *
 * @since 2019.07.01 10:29
 * @author 장진철(zerocooldog@zen9.co.kr)
 *
 *         <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력		
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2019.07.01 10:29 - 장진철 : 최초 작성
 *         </PRE>
 */
public class UtilRequest extends kr.co.pionnet.butterfly2.core.util.UtilRequest {

	/**
	 * Remote IP (Client IP) 취득
	 *
	 * @param request
	 * @return ip or null
	 * @see <a href="http://lesstif.com/pages/viewpage.action?pageId=20775886">
	 *      Proxy(프락시) 환경에서 client IP 를 얻기 위한 X-Forwarded-For(XFF) http header</a>
	 */
	public static String getRemoteIP(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}

		if (UtilText.isEmpty(ip) || ip.split(",").length == 0) {
			return null;
		}

		return ip.split(",")[0];
	}

	/**
	 * Remote IP (Client IP) 취득
	 *
	 * @return ip or null
	 * @see <a href="http://lesstif.com/pages/viewpage.action?pageId=20775886">
	 *      Proxy(프락시) 환경에서 client IP 를 얻기 위한 X-Forwarded-For(XFF) http header</a>
	 */
	public static String getRemoteIP() {
		return getRemoteIP(getRequest());
	}

	/**
	 * setAttribute to session
	 *
	 * <pre>
	 *  세션의 존재여부를 확인한 뒤, 존재하지 않을 경우 새로 생성하고 set.
	 * </pre>
	 *
	 * @since 2020.11.19 12:01
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static void setSessionAttribute(String name, Object value) {
		if (UtilObject.isEmpty(getSession()))
			getSession(true).setAttribute(name, value);
		else
			getSession(false).setAttribute(name, value);
	}

	/**
	 * getAttribute from session
	 *
	 * 세션의 존재여부를 확인한 뒤, 존재하지 않을 경우 null 반환.
	 *
	 * @since 2020.11.19 12:01
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Object getSessionAttribute(String name) {
		if (UtilObject.isEmpty(getSession()))
			return null;
		else
			return getSession(false).getAttribute(name);
	}

	/**
	 * removeAttribute from session
	 *
	 * 세션의 존재여부를 확인한 뒤, 존재하지 않을 경우 null 반환.
	 *
	 * @since 2020.11.19 12:01
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static void removeSessionAttribute(String name) {
		if (UtilObject.isNotEmpty(getSession()))
			getSession(false).removeAttribute(name);
	}
}
