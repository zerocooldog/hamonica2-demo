package kr.co.pionnet.hamonica2.shared.code;

import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;

import java.util.List;

/***
 * 시스템 코드 정보를 불러 온다.
 *
 * @since 2020.11.19 09:57
 * @author 장진철(zerocooldog@pionnet.co.kr)
 *
 *         <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력		
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2020.11.18 09:54 - 장진철(zerocooldog@pionnet.co.kr) : 최초 작성
 *         </PRE>
 */
public interface CodeCacheService {
	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroup     코드 그룹.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrpByCache(String codeGroup, Character codeGroupUseYn);

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroup     코드 그룹. enum 타입.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrpByCache(Enum<?> codeGroup, Character codeGroupUseYn);

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroup 코드 그룹.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrpByCache(String codeGroup);

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroup 코드 그룹. enum 타입
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrpByCache(Enum<?> codeGroup);

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroup  코드 그룹.
	 * @param code      코드 .
	 * @param codeUseYn 코드 사용 여부.
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCodeByCache(String codeGroup, String code, Character codeUseYn);

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroup  코드 그룹. enum 타입
	 * @param code      코드. enum 타입,
	 * @param codeUseYn 코드 사용 여부.
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCodeByCache(Enum<?> codeGroup, Enum<?> code, Character codeUseYn);

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroup 코드 그룹.
	 * @param codeGroup 코드.
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCodeByCache(String codeGroup, String code);

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroup 코드 그룹. enum 타입
	 * @param code    코드. enum 타입
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCodeByCache(Enum<?> codeGroup, Enum<?> code);

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는
	 * [사용,미사용] 구분 없이 모든 코드를 가져 올 수 있다.
	 * 
	 * @param codeGroup 코드 그룹.
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeListByCache(String codeGroup, Character codeUseYn);

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는
	 * [사용,미사용] 구분 없이 모든 코드를 가져 올 수 있다.
	 * 
	 * @param codeGroup 코드 그룹. enum 타입
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeListByCache(Enum<?> codeGroup, Character codeUseYn);

	/***
	 * 캐시 형태로 메모리에 올라가 있는 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 * 
	 * @param codeGroup 코드 그룹.
	 * @return List<?>
	 *
	 * @since 2019.06.26 09:57
	 * @author 장진철(zerocooldog@zen9.co.kr)
	 */
	public List<Code> getCodeListByCache(String codeGroup);

	/***
	 * 캐시 형태로 메모리에 올라가 있는 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 * 
	 * @param codeGroup 코드 그룹 enumType.
	 * @return List<?>
	 *
	 * @since 2019.06.26 09:57
	 * @author 장진철(zerocooldog@zen9.co.kr)
	 */
	public List<Code> getCodeListByCache(Enum<?> codeGroup);

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 * 
	 * @param codeGroup 코드 그룹.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getUseCodeListByCache(String codeGroup);

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 * 
	 * @param codeGroup 코드 그룹. enum 타입
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getUseCodeListByCache(Enum<?> codeGroup);

}
