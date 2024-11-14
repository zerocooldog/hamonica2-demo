package kr.co.pionnet.hamonica2.plugin;


import kr.co.pionnet.hamonica2.ParameterMap;

/**
 * ServiceLoader는 기본 생성자만 호출한다.
 * 파라메터를 생성자로 넘기기 위해 ServiceLoader 호출시 매개변수를 넘기기 위해 Factory 패턴으로 구현한다.
 *
 * @author 장진철 (zerocooldog@pionnet.co.kr)
 * @since 2024.06.27
 */
public interface ServiceFactory {


    /**
     *  플러그인 객체를 호출 생성한다.
     * @param parameterMap
     * @return
     */
    void create(ParameterMap parameterMap);

}
