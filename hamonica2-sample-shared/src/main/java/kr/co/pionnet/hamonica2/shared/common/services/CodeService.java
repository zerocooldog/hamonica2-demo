package kr.co.pionnet.hamonica2.shared.common.services;

import kr.co.pionnet.butterfly2.core.util.UtilChar;
import kr.co.pionnet.hamonica2.shared.code.CodeCacheService;
import kr.co.pionnet.hamonica2.shared.code.CodeManager;
import kr.co.pionnet.hamonica2.shared.common.mappers.CodeMapper;
import kr.co.pionnet.hamonica2.shared.common.mappers.CodeGroupMapper;
import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.common.repository.master.CodeGroupRepository;
import kr.co.pionnet.hamonica2.shared.common.repository.master.CodeRepository;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeEntity;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeGroupEntity;
import kr.co.pionnet.hamonica2.shared.constant.Const;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/***
 * 시스템 코드 정보를 불러 온다.
 *
 * @since 2019.06.26 09:54
 * @author zerocooldog
 *
 *         <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력		
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2019.06.26 09:54 - 장진철(zerocooldog@zen9.co.kr) : 최초 작성
 *         </PRE>
 */
@Slf4j
@Service
public class CodeService implements kr.co.pionnet.hamonica2.shared.code.CodeService, CodeCacheService {


	private final CodeGroupRepository codeGroupRepository;
	private final CodeRepository codeRepository;
	private final CodeGroupMapper codeGroupEntityMapper;
	private final CodeMapper codeEntityMapper;

	public CodeService(
			CodeGroupRepository codeGroupRepository,
			CodeRepository codeRepository,
			CodeGroupMapper codeGroupEntityMapper,
			CodeMapper codeEntityMapper
	) {
		this.codeGroupRepository = codeGroupRepository;
		this.codeRepository = codeRepository;
		this.codeGroupEntityMapper = codeGroupEntityMapper;
		this.codeEntityMapper = codeEntityMapper;
	}

	/**
	 * 모든 코드 그룹 값을 가져온다.
	 *
	 * @return List<CodeGroup>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<CodeGroup> getAllCodeGrps() {
		// 코드 그룹 엔티티를 모두 조회하고, 각각을 DTO로 변환하여 리스트로 반환한다.
		return codeGroupEntityMapper.toDtoList(codeGroupRepository.findAll()); // 변환된 코드 그룹 리스트 반환
	}


	/***
	 * 모든 코드 값을 가져온다.
	 *
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getAllCodes() {
		return codeEntityMapper.toDtoList(codeRepository.findAllByOrderBySortOrderAsc());
	}

	/**
	 * 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroupId     코드 그룹.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrp(String codeGroupId, Character codeGroupUseYn) {

		CodeGroupEntity codeGroupEntity = null;

		if(UtilChar.isBlank(codeGroupUseYn)){
			codeGroupEntity = codeGroupRepository.findOneByCodeGroupId(codeGroupId);
		}else{
			codeGroupEntity = codeGroupRepository.findOneByCodeGroupIdAndUseYn(codeGroupId, codeGroupUseYn);
		}

		return codeGroupEntityMapper.toDto(codeGroupEntity);
	}

	/**
	 * 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroupId     코드 그룹. enum 타입.
	 * @param codeGroupIdUseYn 코드 그룹 사용 여부.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	@Override
	public CodeGroup getCodeGrp(Enum<?> codeGroupId, Character codeGroupIdUseYn) {
		return getCodeGrp(codeGroupId.toString(), codeGroupIdUseYn);
	}

	/**
	 * 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroup 코드 그룹.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	@Override
	public CodeGroup getCodeGrp(String codeGroup) {
		return getCodeGrp(codeGroup, Const.BOOLEAN_TRUE_CHAR);
	}

	/**
	 * 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroup 코드 그룹. enum 타입
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	@Override
	public CodeGroup getCodeGrp(Enum<?> codeGroup) {
		return getCodeGrp(codeGroup);
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹.
	 * @param codeId      코드 .
	 * @param codeUseYn 코드 사용 여부.
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCode(String codeGroupId, String codeId, Character codeUseYn) {

		Optional<CodeEntity> codeEntity = Optional.empty();

		if(UtilChar.isBlank(codeUseYn)){
			codeEntity  = codeRepository.findOneByCodeGroupIdAndCodeId(codeGroupId, codeId);
		}else{
			codeEntity  = codeRepository.findOneByCodeGroupIdAndCodeIdAndUseYn(codeGroupId, codeId, codeUseYn);
		}

		return codeEntityMapper.toDto(codeEntity.orElse(null));
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroup  코드 그룹.
	 * @param code      코드 .
	 * @param codeUseYn 코드 사용 여부.
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCode(Enum<?> codeGroup, String code, Character codeUseYn) {
		return getCode(codeGroup.toString(), code, codeUseYn);
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroup  코드 그룹. enum 타입
	 * @param code      코드. enum 타입,
	 * @param codeUseYn 코드 사용 여부.
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCode(Enum<?> codeGroup, Enum<?> code, Character codeUseYn) {
		return getCode(codeGroup.toString(), code.toString(), codeUseYn);
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @param code 코드.
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCode(String codeGroupId, String code) {
		return getCode(codeGroupId, code, Const.BOOLEAN_TRUE_CHAR);
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @param code 코드.
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCode(Enum<?> codeGroupId, String code) {
		return getCode(codeGroupId.toString(), code, Const.BOOLEAN_TRUE_CHAR);
	}

	/**
	 * 코드 정보를 가져온다.
	 *
	 * @param codeGroupId 코드 그룹. enum 타입
	 * @param code    코드. enum 타입
	 * @return
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCode(Enum<?> codeGroupId, Enum<?> code) {
		return getCode(codeGroupId, code, Const.BOOLEAN_TRUE_CHAR);
	}

	/***
	 * 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는 [사용,미사용] 구분 없이 모든 코드를 가져
	 * 올 수 있다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeList(String codeGroupId, Character codeUseYn) {

		List<CodeEntity> codes = null;

		if(UtilChar.isBlank(codeUseYn)){
			codes = codeRepository.findByCodeGroupIdOrderBySortOrderAsc(codeGroupId).orElse(null);
		}else{
			codes = codeRepository.findByCodeGroupIdAndUseYnOrderBySortOrderAsc(codeGroupId, codeUseYn).orElse(null);
		}

		return codeEntityMapper.toDtoList(codes);
	}

	/***
	 * 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는 [사용,미사용] 구분 없이 모든 코드를 가져
	 * 올 수 있다.
	 *
	 * @param codeGroupId 코드 그룹. enum 타입
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeList(Enum<?> codeGroupId, Character codeUseYn) {
		return getCodeList(codeGroupId.toString(), codeUseYn);
	}

	/***
	 * 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeList(String codeGroupId) {
		return getCodeList(codeGroupId, null);
	}

	/***
	 * 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 *
	 * @param codeGroupId 코드 그룹 enumType.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeList(Enum<?> codeGroupId) {
		return getCodeList(codeGroupId.toString(), null);
	}

	/***
	 * 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getUseCodeList(String codeGroupId) {
		return getCodeList(codeGroupId, Const.BOOLEAN_TRUE_CHAR);
	}

	/***
	 * 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 *
	 * @param codeGroupId 코드 그룹. enum 타입
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getUseCodeList(Enum<?> codeGroupId) {
		return getCodeList(codeGroupId.toString(), null);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroupId     코드 그룹.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrpByCache(String codeGroupId, Character codeGroupUseYn) {
		return CodeManager.getInstance().getCodeGrp(codeGroupId, codeGroupUseYn);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.
	 *
	 * @param codeGroupId     코드 그룹. enum 타입.
	 * @param codeGroupUseYn 코드 그룹 사용 여부.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrpByCache(Enum<?> codeGroupId, Character codeGroupUseYn) {
		return CodeManager.getInstance().getCodeGrp(codeGroupId, codeGroupUseYn);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrpByCache(String codeGroupId) {
		return CodeManager.getInstance().getCodeGrp(codeGroupId, Const.BOOLEAN_TRUE_CHAR);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹 정보를 가져온다.사용 여부가 Y인 것.
	 *
	 * @param codeGroupId 코드 그룹. enum 타입
	 * @return Code.class
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public CodeGroup getCodeGrpByCache(Enum<?> codeGroupId) {
		return CodeManager.getInstance().getCodeGrp(codeGroupId);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹.
	 * @param codeId      코드 .
	 * @param codeUseYn 코드 사용 여부.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCodeByCache(String codeGroupId, String codeId, Character codeUseYn) {
		return CodeManager.getInstance().getCode(codeGroupId, codeId, codeUseYn);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroupId  코드 그룹. enum 타입
	 * @param codeId      코드. enum 타입,
	 * @param codeUseYn 코드 사용 여부.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCodeByCache(Enum<?> codeGroupId, Enum<?> codeId, Character codeUseYn) {
		return CodeManager.getInstance().getCode(codeGroupId, codeId, codeUseYn);
	}

	/**
	 * 캐시 형태로 메모리에 올라가 있는 코드 정보를 가져온다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @param codeId  코드.
	 * @return Code
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public Code getCodeByCache(String codeGroupId, String codeId) {
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
	public Code getCodeByCache(Enum<?> codeGroupId, Enum<?> codeId) {
		return CodeManager.getInstance().getCode(codeGroupId, codeId);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는
	 * [사용,미사용] 구분 없이 모든 코드를 가져 올 수 있다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeListByCache(String codeGroupId, Character codeUseYn) {
		return CodeManager.getInstance().getCodeList(codeGroupId, codeUseYn);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 가져온다. 코드 사용 여부를 통하여 실제 사용하거나, 또는
	 * [사용,미사용] 구분 없이 모든 코드를 가져 올 수 있다.
	 *
	 * @param codeGroupId 코드 그룹. enum 타입
	 * @param codeUseYn   코드 사용 여부.
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeListByCache(Enum<?> codeGroupId, Character codeUseYn) {
		return CodeManager.getInstance().getCodeList(codeGroupId, codeUseYn);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeListByCache(String codeGroupId) {
		return CodeManager.getInstance().getCodeList(codeGroupId);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 사용여부 관계 없이 코드 그룹에 해당하는 코드 목록을 가져온다.
	 *
	 * @param codeGroupId 코드 그룹 enumType.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getCodeListByCache(Enum<?> codeGroupId) {
		return CodeManager.getInstance().getCodeList(codeGroupId);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 *
	 * @param codeGroupId 코드 그룹.
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getUseCodeListByCache(String codeGroupId) {
		return CodeManager.getInstance().getUseCodeList(codeGroupId);
	}

	/***
	 * 캐시 형태로 메모리에 올라가 있는 코드 그룹에 해당하는 코드 목록을 사용여부가 Y인 것만 가져온다.
	 *
	 * @param codeGroupId 코드 그룹. enum 타입
	 * @return List<?>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getUseCodeListByCache(Enum<?> codeGroupId) {
		return CodeManager.getInstance().getUseCodeList(codeGroupId);
	}


	/**
	 * getFilterCodeList (cdAddVal1 로 filter 하여 코드 값 반환)
	 *
	 * @param codeGroupId 코드그룹 아이디
	 * @param codeGroupUseYn 코드 그룹 사용 엽
	 * @param cdAddVal1 추가 값1
	 * @return List<Code>
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	public List<Code> getFilterCodeList(String codeGroupId, Character codeGroupUseYn, String cdAddVal1) {
		return getCodeList(codeGroupId, codeGroupUseYn).stream().filter(code -> code.getCodeAddValue1().equals(cdAddVal1)).toList();
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
	public Code getCodeByCodeName(String codeGroupId, String codeName) {
		return getCodeList(codeGroupId).stream().filter(code -> code.getCodeName().equals(codeName)).findFirst().orElse(null);
	}

	public List<Code> getCodeByCodeNameList(String codeGroupId, String[] codeName) {

		return getCodeList(
					codeGroupId).stream().filter(code -> Arrays.stream(codeName).anyMatch(s -> s.equals(code.getCodeName()))
			).toList();
	}
}
