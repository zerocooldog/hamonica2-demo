package kr.co.pionnet.hamonica2.constant;

/**
 * 역할(권한) 상수를 정의 한다.
 *
 * @since 2019.05.22 03:14 
 * @author 장진철(zerocooldog@nadoosoft.com)  
 *
 * <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력		
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2019.05.22 03:14 - 장진철 : 최초 작성
 * </PRE>
 */
public interface RoleID {

//	// 최고 관리자 그룹
//	String SUPER_ADMIN_GROUP = "SY002001";
	
	/**
	 * 최고 관리자
	 */
	String SUPER_ADMIN = "ROL00001";
	
	/**
	 * 관리자
	 */
	String ADMIN = "ROL00002";
	
	/**
	 * 개발자
	 */
	String DEVELOPER = "ROL00003";

	/**
	 * 관찰자.
	 */
	String OBSERVER = "ROL00004";
	
	/**
	 * 손님.
	 */
	String GUEST = "ROL00005";
}
