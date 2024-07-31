package kr.co.pionnet.hamonica2.ha.sample.master;

import java.util.List;

import kr.co.pionnet.hamonica2.ha.sample.master.base.BaseTestDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
/**
 * 테이블 명 : TEST
 * 설명       : 테스트
 */
@Mapper
public interface TestDao extends BaseTestDao {
	
     /**
     * 기본 insert, update, delete 메소드는 BaseTestDao 클래스에 구현 되어있습니다.
     * BaseTestDao는 절대 수정 불가 하며 새로운 메소드 추가 하실 경우에는 해당 소스에서 작업 하시면 됩니다.
     * 
     */
	
	
	/**
	 * 캐시 읽기용 테스트
	 * @return
	 * @throws Exception
	 */
	List<Test> findAllByCache() throws Exception;
	
	List<Test> findAllByCacheAnno() throws Exception;
	
	int findAllByCacheNum() throws Exception;


    /**
     * 이 findAll 메소드는 Code Generator를 통하여 생성 되었습니다.
     * !!!! 데이터 양이 많지 않은 경우에만 사용하시기 바랍니다. !!!!
     * @param test 
     */
    @Select("SELECT ID, U_NO, NAME, REG_DTIME, CALL_DTIME FROM TEST WHERE REG_DTIME BETWEEN '2020-12-31' AND ${regDtime, jdbcType=TIMESTAMP}")
	List<Test> findConditionStatement(Test test);
    
    /**
     * 이 findAll 메소드는 Code Generator를 통하여 생성 되었습니다.
     * !!!! 데이터 양이 많지 않은 경우에만 사용하시기 바랍니다. !!!!
     * @param test 
     */
    @Select("SELECT ID, U_NO, NAME, REG_DTIME, CALL_DTIME FROM TEST WHERE REG_DTIME BETWEEN '2020-12-31' AND #{regDtime, jdbcType=TIMESTAMP}")
	List<Test> findCondition(Test test);

    /**
     * 이 updateByObjectPrimaryKey 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
//    @Update("<script> UPDATE TEST SET NAME='홍길동' WHERE NAME= #{name, jdbcType=VARCHAR} </script> ")
	int updateCondition(Test test) throws Exception;
}
