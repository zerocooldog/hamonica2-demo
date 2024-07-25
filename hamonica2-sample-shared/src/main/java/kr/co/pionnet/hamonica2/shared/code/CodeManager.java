package kr.co.pionnet.hamonica2.shared.code;

import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.constant.Const;
import kr.co.pionnet.hamonica2.shared.util.UtilCode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 공통 코드를 메모리에서 관리한다.
 *
 * @since 2020.11.19 09:57
 * @author 장진철(zerocooldog@pionnet.co.kr)
 *
 *         <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력		
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2020.02.20 20:29 - 장진철(zerocooldog) : 최초 작성
 *         </PRE>
 */
@Slf4j
public class CodeManager implements CodeService, Runnable {

	/**
	 * 공통 코드 및 그룹코드 정보를 담는 객체.
	 */
	private final LinkedHashMap<String, CodeGroup> codeGrpCache = new LinkedHashMap<String, CodeGroup>();

	private final LinkedHashMap<String, List<Code>> codeCache = new LinkedHashMap<String, List<Code>>();

	private static class Singleton {
		private static final CodeManager instance = new CodeManager();
	}

	public static CodeManager getInstance() {
		return Singleton.instance;
	}

	private CodeManager() {

		// 코드 정보 설정
		init();

		// 쓰레드 실행.
		Thread t = new Thread(this);
		t.setDaemon(true);
		t.setName("CodeManager");
		t.start();
	}

	/**
	 * 코드 그룹 및 코드 정보를 불러와 cache 객체에 담는다.
	 *
	 * @since 2020.11.19 09:57
	 * @author 장진철(zerocooldog@pionnet.co.kr)
	 */
	private void init() {

		List<CodeGroup> codeGrps = UtilCode.getAllCodeGrps();
		List<Code> codes = UtilCode.getAllCodes();

		// 코드 그룹 아이디로 코드 그룹 정보를 담고 있는 객체를 codeGrpCache 객체에 저장
		// 코드 그룹 아이디로 코드 목록 정보를 담기위해 codeCache객체에 저장
		for (CodeGroup codeGroup : codeGrps) {
			codeGrpCache.put(codeGroup.getCodeGroupId(), codeGroup);
			codeCache.put(codeGroup.getCodeGroupId(), new ArrayList<>());
		}

		// 코드 그룹 별로 코드 정보를 저장한다.
		// 이미 위에서 코드 그룹 별로 List객체를 생성하여 저장하였기 때문에 null 처리 생략. 필요하면 추후에 처리
		for (Code code : codes) {

			List<Code> codeList = codeCache.get(code.getCodeGroupId());

			if (codeList != null) {
				code.setCodeGroup(null); //코드 그룹 정보는 넣지 않는다.
				codeList.add(code);
			}
		}

		log.debug("codeGrpCache : {}", codeGrpCache);
		log.debug("codeCache : {}", codeCache);
	}

	@Override
	public void run() {

//		while (true) {
//
//		}
	}

	@Override
	public CodeGroup getCodeGrp(String codeGrp, Character codeGrpUseYn) {

		if (codeGrpUseYn == null) {
			throw new NullPointerException("useYn value is null.");
		}

        CodeGroup cdGrp = codeGrpCache.get(codeGrp);
        if (cdGrp != null && codeGrpUseYn.equals(cdGrp.getUseYn())) {
            return cdGrp;
        }

        return null;
	}

	@Override
	public CodeGroup getCodeGrp(Enum<?> codeGroupId, Character codeGrpUseYn) {
		return getCodeGrp(codeGroupId.toString(), codeGrpUseYn);
	}

	@Override
	public CodeGroup getCodeGrp(String codeGrp) {
		return getCodeGrp(codeGrp, Const.BOOLEAN_TRUE_CHAR);
	}

	@Override
	public CodeGroup getCodeGrp(Enum<?> codeGrp) {
		return getCodeGrp(codeGrp,Const.BOOLEAN_TRUE_CHAR);
	}

	@Override
	public Code getCode(String codeGrp, String code, Character codeUseYn) {

		if (codeUseYn == null) {
			throw new NullPointerException("useYn value is null.");
		}

        List<Code> codeList = codeCache.get(codeGrp);

        if (codeList != null) {
            for (Code codeObject : codeList) {
                // 코드값이 일치하고 사용 여부가 일치하면 리턴.
                if (code.equals(codeObject.getCodeId()) && codeUseYn.equals(codeObject.getUseYn())) {
                    return codeObject;
                }
            } // end for (Code Code : codeList) {
        } // end if (codeList != null)

        return null;
	}

	@Override
	public Code getCode(Enum<?> codeGroupId, String code, Character codeUseYn) {
		return getCode(codeGroupId.toString(), code, codeUseYn);
	}

	@Override
	public Code getCode(Enum<?> codeGroupId, Enum<?> code, Character codeUseYn) {
		return getCode(codeGroupId.toString(), code.toString(), codeUseYn);
	}

	@Override
	public Code getCode(String codeGrp, String code) {
		return getCode(codeGrp, code,Const.BOOLEAN_TRUE_CHAR);
	}

	@Override
	public Code getCode(Enum<?> codeGrp, String code) {
		return getCode(codeGrp, code,Const.BOOLEAN_TRUE_CHAR);
	}

	@Override
	public Code getCode(Enum<?> codeGrp, Enum<?> code) {
		return getCode(codeGrp, code,Const.BOOLEAN_TRUE_CHAR);
	}

	@Override
	public List<Code> getCodeList(String codeGrp, Character codeUseYn) {

		List<Code> result = new ArrayList<Code>();

        List<Code> codeList = codeCache.get(codeGrp);

        if (codeList != null) {
            for (Code code : codeList) {
                // 사용 여부가 일치하거나 값이 없을 경우 반환 값에 추가.
                if (codeUseYn == null || codeUseYn.equals(code.getUseYn())) {
                    result.add(code);
                }
            } // end for (Code Code : codeList) {
        } // end if (codeList != null)

        return (result.isEmpty()) ? null : result;
	}

	@Override
	public List<Code> getCodeList(Enum<?> codeGroupId, Character codeUseYn) {
		return getCodeList(codeGroupId.toString(), codeUseYn);
	}

	@Override
	public List<Code> getCodeList(String codeGrp) {
		return getCodeList(codeGrp, null);

	}

	@Override
	public List<Code> getCodeList(Enum<?> codeGrp) {
		return getCodeList(codeGrp, null);
	}

	@Override
	public List<Code> getUseCodeList(String codeGrp) {
		return getCodeList(codeGrp,Const.BOOLEAN_TRUE_CHAR);
	}

	@Override
	public List<Code> getUseCodeList(Enum<?> codeGrp) {
		return getCodeList(codeGrp,Const.BOOLEAN_TRUE_CHAR);
	}

}
