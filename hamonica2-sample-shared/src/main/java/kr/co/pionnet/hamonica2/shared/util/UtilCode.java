package kr.co.pionnet.hamonica2.shared.util;

import kr.co.pionnet.hamonica2.shared.code.CodeManager;
import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.common.services.CodeService;
import kr.co.pionnet.hamonica2.shared.constant.Const;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 본 클래스는 Code 값을 조회시 도움을 주는 유틸 클래스이다. 모든 프로젝트에서 사용할 유틸성 메소드를 구현할 경우에는 이곳에서 추가한다.
 * Common.getCode()로도 접근이 가능 하며 함수는 동일하다. 코드 함수를 바로 호출할수 있게 축약 처리 한것이다.
 * 이외 별도 공통 코드조회와 필요한 항목을 정의하면 된다.
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
public class UtilCode {
	
	private static CodeService codeService;

	public static void setCodeService(CodeService codeService) {
		UtilCode.codeService = codeService;
	}

	/***
	 * 모든 코드 그룹 값을 가져온다.
	 *
	 * @return List<CommonCode>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<CodeGroup> getAllCodeGrps() {
		return codeService.getAllCodeGrps();
	}

	/***
	 * 모든 코드 그룹 값을 가져온다.
	 *
	 * @return List<CommonCode>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getAllCodes() {
		return codeService.getAllCodes();
	}
	
	/**
	 * 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroup     코드 그룹.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static CodeGroup getCodeGrp(String codeGroup, Character codeGroupUseYn) {
		return codeService.getCodeGrp(codeGroup, codeGroupUseYn);
	}

	/**
	 * 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroup     코드 그룹. enum 타입.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return Code.class
	 *
	 * @since 2019.06.26 10:09
	 * @author 장진철(zerocooldog@zen9.co.kr)
	 */
	public static CodeGroup getCodeGrp(Enum<?> codeGroup, Character codeGroupUseYn) {
		return codeService.getCodeGrp(codeGroup, codeGroupUseYn);
	}

	/**
	 * 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroup 코드 그룹.
	 * @return Code.class
	 *
	 * @since 2019.06.26 10:09
	 * @author 장진철(zerocooldog@zen9.co.kr)
	 */
	public static CodeGroup getCodeGrp(String codeGroup) {
		return codeService.getCodeGrp(codeGroup);
	}

	/**
	 * 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroup 코드 그룹 아이디. enum 타입
	 * @return CodeGroup
	 *
	 * @since 2019.06.26 10:09
	 * @author 장진철(zerocooldog@zen9.co.kr)
	 */
	public static CodeGroup getCodeGrp(Enum<?> codeGroup) {
		return codeService.getCodeGrp(codeGroup);
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹 아이디.
	 * @param codeId      코드 아이디.
	 * @param codeUseYn 코드 사용 여부.
	 * @return Code
	 *
	 * @since 2019.06.26 10:09
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCode(String codeGroupId, String codeId, Character codeUseYn) {
		return codeService.getCode(codeGroupId, codeId, codeUseYn);
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹아이디 .
	 * @param codeId      코드 아이디 .
	 * @param codeUseYn 코드 사용 여부.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCode(Enum<?> codeGroupId, String codeId, Character codeUseYn) {
		return codeService.getCode(codeGroupId, codeId, codeUseYn);
	}


	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹 아이디. enum 타입
	 * @param codeId      코드 아이디. enum 타입,
	 * @param codeUseYn 코드 사용 여부.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCode(Enum<?> codeGroupId, Enum<?> codeId, Character codeUseYn) {
		return codeService.getCode(codeGroupId, codeId, codeUseYn);
	}


	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId 코드 그룹 아이디.
	 * @param codeId 코드 아이디.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCode(String codeGroupId, String codeId) {
		return codeService.getCode(codeGroupId, codeId);
	}


	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId 코드 그룹 아이디.
	 * @param codeId 코드 아이디.
	 * @return Code
	 *
	 * @since 2019.06.26 10:09
	 * @author 장진철(zerocooldog@zen9.co.kr)
	 */
	public static Code getCode(Enum<?> codeGroupId, String codeId) {
		return codeService.getCode(codeGroupId, codeId);
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId 코드 그룹 아이디.
	 * @param codeId 코드 아이디.
	 * @return Code
	 *
	 * @since 2019.06.26 10:09
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCode(Enum<?> codeGroupId, Enum<?> codeId) {
		return codeService.getCode(codeGroupId, codeId);
	}

	/***
	 * 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는 [사용,미사용] 구분 없이 모든 코드를 가져
	 * 올 수 있다.
	 *
	 * @param codeGroupId 코드 그룹 아이디.
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeList(String codeGroupId, Character codeUseYn) {
		return codeService.getCodeList(codeGroupId, codeUseYn);
	}

	/***
	 * 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는 [사용,미사용] 구분 없이 모든 코드를 가져
	 * 올 수 있다.
	 * 
	 * @param codeGroupId 코드 그룹 아이디. enum 타입
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeList(Enum<?> codeGroupId, Character codeUseYn) {
		return codeService.getCodeList(codeGroupId, codeUseYn);
	}

	/***
	 * 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 * 
	 * @param codeGroupId 코드 그룹 아이디.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getCodeList(String codeGroupId) {
		return codeService.getCodeList(codeGroupId);
	}

	/***
	 * 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 * 
	 * @param codeGroupId 코드 그룹 아이디 enumType.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getCodeList(Enum<?> codeGroupId) {
		return codeService.getCodeList(codeGroupId);
	}

	/***
	 * 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 * 
	 * @param codeGroupId 코드 그룹 아이디
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getUseCodeList(String codeGroupId) {
		return codeService.getCodeList(codeGroupId);
	}

	/***
	 * 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 * 
	 * @param codeGroupId 코드 그룹 아이디. enum 타입
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getUseCodeList(Enum<?> codeGroupId) {
		return codeService.getCodeList(codeGroupId);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroupId     코드 그룹 아이디.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return CodeGroup
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static CodeGroup getCodeGrpByCache(String codeGroupId, Character codeGroupUseYn) {
		return CodeManager.getInstance().getCodeGrp(codeGroupId, codeGroupUseYn);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroupId     코드 그룹 아이디.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return CodeGroup
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static CodeGroup getCodeGrpByCache(Enum<?> codeGroupId, Character codeGroupUseYn) {
		return CodeManager.getInstance().getCodeGrp(codeGroupId, codeGroupUseYn);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroupId     코드 그룹 아이디.
	 * @return CodeGroup
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static CodeGroup getCodeGrpByCache(String codeGroupId) {
		return CodeManager.getInstance().getCodeGrp(codeGroupId, Const.BOOLEAN_TRUE_CHAR);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroupId 코드 그룹 아이디. enum 타입
	 * @return CodeGroup
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static CodeGroup getCodeGrpByCache(Enum<?> codeGroupId) {
		return CodeManager.getInstance().getCodeGrp(codeGroupId);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹 아이디
	 * @param codeId      코드 아이디.
	 * @param codeUseYn 코드 사용 여부.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCodeByCache(String codeGroupId, String codeId, Character codeUseYn) {
		return CodeManager.getInstance().getCode(codeGroupId, codeId, codeUseYn);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹 아이디
	 * @param codeId      코드 아이디.
	 * @param codeUseYn 코드 사용 여부.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCodeByCache(Enum<?> codeGroupId, Enum<?> codeId, Character codeUseYn) {
		return CodeManager.getInstance().getCode(codeGroupId, codeId, codeUseYn);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹 아이디
	 * @param codeId      코드 아이디.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCodeByCache(String codeGroupId, String codeId) {
		return CodeManager.getInstance().getCode(codeGroupId, codeId);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroupId 코드 그룹. enum 타입
	 * @param codeId    코드. enum 타입
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCodeByCache(Enum<?> codeGroupId, Enum<?> codeId) {
		return CodeManager.getInstance().getCode(codeGroupId, codeId);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는
	 * [사용,미사용] 구분 없이 모든 코드를 가져 올 수 있다.
	 * 
	 * @param codeGroupId 코드 그룹 아이디
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getCodeListByCache(String codeGroupId, Character codeUseYn) {
		return CodeManager.getInstance().getCodeList(codeGroupId, codeUseYn);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는
	 * [사용,미사용] 구분 없이 모든 코드를 가져 올 수 있다.
	 * 
	 * @param codeGroupId 코드 그룹 아이디 enum 타입
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getCodeListByCache(Enum<?> codeGroupId, Character codeUseYn) {
		return CodeManager.getInstance().getCodeList(codeGroupId, codeUseYn);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 * 
	 * @param codeGroupId 코드 그룹 아이디.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getCodeListByCache(String codeGroupId) {
		return CodeManager.getInstance().getCodeList(codeGroupId);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 * 
	 * @param codeGroup 코드 그룹 enumType.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getCodeListByCache(Enum<?> codeGroup) {
		return CodeManager.getInstance().getCodeList(codeGroup);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 * 
	 * @param codeGroup 코드 그룹.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getUseCodeListByCache(String codeGroup) {
		return CodeManager.getInstance().getUseCodeList(codeGroup);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 * 
	 * @param codeGroup 코드 그룹. enum 타입
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getUseCodeListByCache(Enum<?> codeGroup) {
		return CodeManager.getInstance().getUseCodeList(codeGroup);
	}


	/**
	 * getFilterCodeList (cdAddVal1 로 filter 하여 코드 값 반환)
	 * 
	 * @param codeGroupId 코드 그룹 아이디
	 * @param codeGroupUseYn 코드 그룹 사용 여부
	 * @param cdAddVal1 코드 추가 값1
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static List<Code> getFilterCodeList(String codeGroupId,  Character codeGroupUseYn, String cdAddVal1) {
		return codeService.getFilterCodeList(codeGroupId, codeGroupUseYn, cdAddVal1);
	}
	
	/**
	 * 코드그룹명과 코드명으로 코드정보 가져온다.
	 *
	 * @param codeGroupId 코드 그룹 아이디
	 * @param codeName 코드 명
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public static Code getCodeByCodeName(String codeGroupId, String codeName) {
		return codeService.getCodeByCodeName(codeGroupId, codeName);
	}

	public static List<Code> getCodeByCodeNameList(String codeGroup, String[] CodeName) {
		return codeService.getCodeByCodeNameList(codeGroup, CodeName);

	}

}
