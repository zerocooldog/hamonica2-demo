package kr.co.pionnet.hamonica2.shared.util;

import kr.co.pionnet.butterfly2.core.util.UtilObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * 본 클래스는 Object 판단 및 조작 하는데 도움을 주는 유틸 클래스이다. 모든 프로젝트에서 사용할 유틸성 메소드를 구현할 경우에는
 * 이곳에서 추가한다.
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
@Slf4j
public class UtilObject extends kr.co.pionnet.butterfly2.core.util.UtilObject {

	/**
	 * Map, List 객체를 원하는 Class타입으로 변환 한다.
	 *
	 * @param data  자료형 객체, List, Map
	 * @param clazz 변환할 클래스 형식
	 * @return clazz 형식
	 *
	 * @since 2019.07.18 11:30
	 * @author 장진철
	 */
	@SuppressWarnings("unchecked")
	public static <U> U convertObject(Object data, Class<?> clazz) {
		return (U) UtilObjectMapper.getObjectMapper().convertValue(data, clazz);
	}


	/**
	 * 객체가 비어있지 않은지 검사
	 * 
	 * @param object
	 * @return
	 *
	 * @since 2020.01.20 03:28
	 * @author TENNESSEE
	 */
	public static boolean isNotEmpty(final Object object) {
		return !isEmpty(object);
	}

	/***
	 * 
	 * 숫자여부 체크
	 * 
	 * @param object
	 * @return
	 * 
	 * @since 2020.02.26 18:00
	 * @author choijy
	 * 
	 */
	public static boolean isNumeric(final Object object) {
		try {
			Double.parseDouble(object.toString());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
