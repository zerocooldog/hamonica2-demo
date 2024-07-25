package kr.co.pionnet.hamonica2.shared.util;

import kr.co.pionnet.hamonica2.shared.constant.Const;

import java.util.Arrays;

/**
 * 본 클래스는 문자열을 조작 하는 유틸 클래스이다. 모든 프로젝트에서 사용할 유틸성 메소드를 구현할 경우에는 이곳에서 추가한다.
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
public class UtilText extends kr.co.pionnet.butterfly2.core.util.UtilText {

	/**
	 * 전화번호 format 변환
	 *
	 * @param value
	 * @return
	 *
	 * @since 2020.11.19 12:01
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	static public String cpNoFormatter(String value) {
		if (isEmpty(value))
			return value;
		else if (value.length() == 10)
			return formatter(value, "###-###-####");
		else if (value.length() == 11)
			return formatter(value, "###-####-####");
		else
			return value;
	}

	/**
	 * 인자값에서 문자열만 반환
	 * 
	 * @param value
	 * @return
	 *
	 * @since 2020.11.19 12:01
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static String getTextOnly(String value) {
		return UtilText.isEmpty(value) ? "" : value.replaceAll("[^a-zA-Z]", "");
	}

	/**
	 * 모든 문자열값이 {@code criteria}인지 확인
	 * 
	 * @param criteria 비교기준 문자열
	 * @param value    비교할 문자열
	 * @return
	 *
	 * @since 2020.11.19 12:01
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static boolean isAllMatchFor(String criteria, String... value) {

		return Arrays.asList(value).stream().allMatch(text -> UtilText.equals(criteria, text));

	}

	/**
	 * 문자열이 Y인 값이면 true 반환.
	 * @param character 문자 Y
	 * @return boolean
	 */
	public static boolean isTrue(String character){
		return Const.BOOLEAN_TRUE.equals(character);
	}
	/**
	 * 문자열이 Y인 값이 아니면 true 반환.
	 * @param character 문자 Y
	 * @return boolean
	 */
	public static boolean isNotTrue(String character){
		return !isTrue(character);
	}

	/**
	 * 문자열이 N인 값이면 true 반환.
	 * @param character 문자 N
	 * @return boolean
	 */
	public static boolean isFalse(String character){
		return Const.BOOLEAN_FALSE.equals(character);
	}


	/**
	 * 문자열이 S인 값이면 true 반환.
	 * @param character 문자 S
	 * @return boolean
	 */
	public static boolean isSuccess(String character){
		return Const.RESULT_SUCCESS.equals(character);
	}

	/**
	 * 문자열이 S인 값이 아니면 true 반환.
	 * @param character 문자 S
	 * @return boolean
	 */
	public static boolean isNotSuccess(String character){
		return !isSuccess(character);
	}

	/**
	 * 문자열이 F인 값이면 true 반환.
	 * @param character 문자 F
	 * @return boolean
	 */
	public static boolean isFail(String character){
		return Const.RESULT_FAIL.equals(character);
	}

	/**
	 * 문자열이 F인 값이 아니면 true 반환
	 * @param character 문자 F
	 * @return boolean
	 */
	public static boolean isNotFail(String character){
		return !isFail(character);
	}
}
