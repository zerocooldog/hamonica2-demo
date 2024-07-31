package kr.co.pionnet.hamonica2.ha.sample.master.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;

/**
 * 테이블 명  : TEST
 * 설명        : 테스트
 */
@Getter
@Setter
@ToString
public class BaseTest  implements Serializable {

    /**
     * 이 필드는 Code Generator를 통하여 생성 되었습니다.
     * 설명 : 
     */
	private Integer id;
	
    /**
     * 이 필드는 Code Generator를 통하여 생성 되었습니다.
     * 설명 : 
     */
	private Integer uNo;
	
    /**
     * 이 필드는 Code Generator를 통하여 생성 되었습니다.
     * 설명 : 
     */
	private String name;
	
    /**
     * 이 필드는 Code Generator를 통하여 생성 되었습니다.
     * 설명 : 
     */
	private java.time.LocalDateTime regDtime;
	
    /**
     * 이 필드는 Code Generator를 통하여 생성 되었습니다.
     * 설명 : 
     */
	private java.time.LocalDateTime callDtime;
	
}
