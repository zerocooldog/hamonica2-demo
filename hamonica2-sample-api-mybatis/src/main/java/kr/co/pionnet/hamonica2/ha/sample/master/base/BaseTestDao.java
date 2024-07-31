
package kr.co.pionnet.hamonica2.ha.sample.master.base;

import java.util.List;

import kr.co.pionnet.hamonica2.ha.sample.master.Test;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


/**
 * 테이블 명 : TEST
 * 설명       : 테스트
 *
 * ※ 절대 수정 금지. 해당 파일은 code generator 작동 시 내용을 전부 덮어 씌우게 됩니다. 
 *
 */
 

public interface BaseTestDao {

    /**
     * 이 findByPrimaryKey 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Select("SELECT ID, U_NO, NAME, REG_DTIME, CALL_DTIME FROM TEST WHERE ID=#{id, jdbcType=INTEGER}  AND U_NO=#{uNo, jdbcType=INTEGER} ")
    Test findByPrimaryKey(@Param("id") Integer id , @Param("uNo") Integer uNo) throws Exception;

    /**
     * 이 findByObjectPrimaryKey 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Select("SELECT ID, U_NO, NAME, REG_DTIME, CALL_DTIME FROM TEST WHERE ID=#{id, jdbcType=INTEGER}  AND U_NO=#{uNo, jdbcType=INTEGER} ")
	Test findByObjectPrimaryKey(Test test) throws Exception;

    /**
     * 이 findAll 메소드는 Code Generator를 통하여 생성 되었습니다.
     * !!!! 데이터 양이 많지 않은 경우에만 사용하시기 바랍니다. !!!!
     */
    @Select("SELECT ID, U_NO, NAME, REG_DTIME, CALL_DTIME FROM TEST ")
	List<Test> findAll() throws Exception;
	
    /**
     * 이 findBy 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
     @Select("<script> SELECT ID, U_NO, NAME, REG_DTIME, CALL_DTIME FROM TEST WHERE <if test=' id != null and id != \"\" '>ID=#{id, jdbcType=INTEGER} </if><if test=' uNo != null and uNo != \"\" '> AND U_NO=#{uNo, jdbcType=INTEGER} </if><if test=' name != null and name != \"\" '> AND NAME=#{name, jdbcType=VARCHAR} </if><if test=' regDtime != null and regDtime != \"\" '> AND REG_DTIME=#{regDtime, jdbcType=TIMESTAMP} </if><if test=' callDtime != null and callDtime != \"\" '> AND CALL_DTIME=#{callDtime, jdbcType=TIMESTAMP} </if></script> ")
	List<Test> find(Test test) throws Exception;
		
    /**
     * 이 select 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Insert("<script> INSERT INTO TEST (ID, U_NO, NAME, REG_DTIME, CALL_DTIME) VALUES (#{id, jdbcType=INTEGER} , #{uNo, jdbcType=INTEGER} , <choose> <when test='name == null  or name == \"\"'> null </when> <otherwise> #{name, jdbcType=VARCHAR} </otherwise> </choose> , <choose><when test='regDtime != null'>#{REG_DTIME, jdbcType=TIMESTAMP}</when><otherwise>CURRENT_TIMESTAMP()</otherwise></choose>, <choose><when test='callDtime != null'>#{CALL_DTIME, jdbcType=TIMESTAMP}</when><otherwise>null</otherwise></choose>) </script> ")
	int insert(Test test) throws Exception;
	
    /**
     * 이 updateByObjectPrimaryKey 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Update("<script> UPDATE TEST SET <if test='name != null'><choose> <when test='name == null  or name == \"\"'> null </when> <otherwise> NAME=#{name, jdbcType=VARCHAR} </otherwise> </choose> </if><if test='regDtime != null'>, <choose><when test='regDtime != null'>#{regDtime, jdbcType=TIMESTAMP}</when><otherwise>CURRENT_TIMESTAMP()</otherwise></choose></if><if test='callDtime != null'>, <choose><when test='callDtime != null'>#{callDtime, jdbcType=TIMESTAMP}</when><otherwise>null</otherwise></choose></if>WHERE ID=#{id, jdbcType=INTEGER}  AND U_NO=#{uNo, jdbcType=INTEGER} </script> ")
	int updateByObjectPrimaryKey(Test test) throws Exception;
	
    /**
     * 이 updateByPrimaryKey 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Update("<script> UPDATE TEST SET <if test='name != null'><choose> <when test='name == null  or name == \"\"'> null </when> <otherwise> NAME=#{name, jdbcType=VARCHAR} </otherwise> </choose> </if><if test='regDtime != null'>, <choose><when test='regDtime != null'>#{regDtime, jdbcType=TIMESTAMP}</when><otherwise>CURRENT_TIMESTAMP()</otherwise></choose></if><if test='callDtime != null'>, <choose><when test='callDtime != null'>#{callDtime, jdbcType=TIMESTAMP}</when><otherwise>null</otherwise></choose></if>WHERE <if test=' id != null and id != \"\" '>ID=#{id, jdbcType=INTEGER} </if><if test=' uNo != null and uNo != \"\" '> AND U_NO=#{uNo, jdbcType=INTEGER} </if><if test=' name != null and name != \"\" '> AND NAME=#{name, jdbcType=VARCHAR} </if><if test=' regDtime != null and regDtime != \"\" '> AND REG_DTIME=#{regDtime, jdbcType=TIMESTAMP} </if><if test=' callDtime != null and callDtime != \"\" '> AND CALL_DTIME=#{callDtime, jdbcType=TIMESTAMP} </if></script> ")
	int update(Test test) throws Exception;
	
	 /**
     * 이 deleteByPrimaryKey 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Delete("<script> DELETE FROM TEST WHERE ID=#{id, jdbcType=INTEGER}  AND U_NO=#{uNo, jdbcType=INTEGER} </script> ") 
	int deleteByPrimaryKey(@Param("id") Integer id ,@Param("uNo") Integer uNo) throws Exception;

	/**
     * 이 deleteByObjectPrimaryKey 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Delete("<script> DELETE FROM TEST WHERE ID=#{id, jdbcType=INTEGER}  AND U_NO=#{uNo, jdbcType=INTEGER} </script> ") 
	int deleteByObjectPrimaryKey(Test test) throws Exception;
	
	/**
     * 이 delete 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Delete("<script> DELETE FROM TEST WHERE <if test=' id != null and id != \"\" '>ID=#{id, jdbcType=INTEGER} </if><if test=' uNo != null and uNo != \"\" '> AND U_NO=#{uNo, jdbcType=INTEGER} </if><if test=' name != null and name != \"\" '> AND NAME=#{name, jdbcType=VARCHAR} </if><if test=' regDtime != null and regDtime != \"\" '> AND REG_DTIME=#{regDtime, jdbcType=TIMESTAMP} </if><if test=' callDtime != null and callDtime != \"\" '> AND CALL_DTIME=#{callDtime, jdbcType=TIMESTAMP} </if></script> ") 
	int delete(Test test) throws Exception;
	
	/**
     * 이 deleteAll 메소드는 Code Generator를 통하여 생성 되었습니다.
     */
    @Delete("DELETE FROM TEST ") 
	int deleteAll() throws Exception;
	

}
