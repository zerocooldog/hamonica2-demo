package kr.co.pionnet.hamonica2.shared.util;

import kr.co.pionnet.hamonica2.shared.common.services.DatetimeService;

import java.time.Instant;

/**
 * 본 클래스는 Date 데이터를 조작 하는 유틸 클래스이다. 모든 프로젝트에서 사용할 유틸성 메소드를 구현할 경우에는 이곳에서 추가한다.
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
public class UtilDate extends kr.co.pionnet.butterfly2.core.util.UtilDate {


	private static DatetimeService datetimeService;

	public static void setDatetimeRepository(DatetimeService datetimeService) {
		UtilDate.datetimeService = datetimeService;
	}

    
	/**
	 * 실제 DB에서 현재 시간을 가져온다.
	 *
	 * @return Timestamp
	 *
	 * @since 2019.12.03 03:02
     * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Instant getDateAtDB() {
		return datetimeService.getCurrentDBDatetime();
	}
}
