package kr.co.pionnet.hamonica2.user;

import jakarta.servlet.http.HttpSession;
import kr.co.pionnet.hamonica2.shared.util.UtilRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.List;

/**
 * 로그인 관련된 처리를 담당 하는 매니저 클래스 이다.
 * 로그인 되었을 경우 회원 객체를 불러 올 수 있고 그 외 회원 인증 여부등을 확인 할 수 있다.
 *
 * @since 2019.05.22 03:15 
 * @author 장진철(zerocooldog@nadoosoft.com)  
 *
 * <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력		
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2019.05.22 03:15 - 장진철 : 최초 작성
 * </PRE>
 */
@Slf4j
public class LoginManager {

	/**
	 * 사용자 세션 정보를 저장한다.
	 * 
	 * @return UserDetails
	 */
	public static void setUserDetails(UserDetails userDetails) {

		Authentication authentication = getAuthentication();

		if (authentication != null) {
			SecurityContextHolder.getContext().setAuthentication(authentication);
			UsernamePasswordAuthenticationToken newAuth = new UsernamePasswordAuthenticationToken(null, null, userDetails.getAuthorities());
			newAuth.setDetails(userDetails);
		}

		log.debug("LoginManager.setUserDetails Authentication value : {} ", authentication);

	}

	/**
	 * 사용자 세션 정보를 가져온다.
	 * 
	 * @return UserDetails
	 */
	public static UserDetails getUserDetails() {

		UserDetails userDetails = (UserDetails) getDetails();

		if (userDetails == null || !(userDetails instanceof UserDetails)) {
			return new UserDetails(null);
		}

		return userDetails;
	}

	/**
	 * 로그인 여부
	 * 
	 * @return true or false
	 */
	public static boolean isLogin() {
		return getAuthentication() != null;
	}
	
	/**
	 * 역할 아이디
	 * 
	 * @return true or false
	 */
	public static List<String> getRoleIds() {
		return getUserDetails().getRoleIds();
	}
	
	/**
	 * 사용자에게 역할이 있는 여부.
	 * 
	 * @return true or false
	 */
	public static boolean isRole(String roleId) {
		return getUserDetails().isRole(roleId);
	}
	
	/**
	 * 최고 관리자 역할 여부.
	 * 
	 * @return true or false
	 */
	public static boolean isSuperAdmin() {
		return getUserDetails().isSuperAdmin();
	}
	
	/**
	 * 최고 관리자 역할 여부.
	 * 
	 * @return true or false
	 */
	public static boolean isAdmin() {
		return getUserDetails().isAdmin();
	}
	
	
	/**
	 * 로그인한 유저 아이디
	 * 
	 * @return true or false
	 */
	public static String getId() {
//		return getUserDetails().getId();
		return "00000000000000";
	}


	/**
	 * 세션 초기화 . 로그아웃시 사용
	 */

	public static void invalidate() {

		HttpSession session = UtilRequest.getSession();

		// 사용자 정의 세션 null 처리

		// session.setAttribute(BaseConst._USER_SESSION_KEY, null);

		session.invalidate();
	}

	/**
	 * Authentication 조회
	 * 
	 * @return Authentication
	 */
	public static Authentication getAuthentication() {
		SecurityContext context = null;
		try {
			context = SecurityContextHolder.getContext();
		} catch (Exception e) {

		}
		if (context == null)
			return null;

		Authentication authentication = context.getAuthentication();
		
		if (authentication == null || !authentication.isAuthenticated()
				|| authentication instanceof AnonymousAuthenticationToken)
			return null;

		return authentication;
	}

	public static Object getDetails() {
		Authentication authentication = getAuthentication();
		if (authentication == null)
			return null;

		return authentication.getDetails();
	}
}
