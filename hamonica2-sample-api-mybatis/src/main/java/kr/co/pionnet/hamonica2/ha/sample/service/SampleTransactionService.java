package kr.co.pionnet.hamonica2.ha.sample.service;

import java.util.List;

//import kr.co.pionnet.hamonica2.cache.annotation.Cache;
import kr.co.pionnet.hamonica2.ha.sample.repository.master.Test;
import kr.co.pionnet.hamonica2.ha.sample.repository.master.TestDao;
import org.apache.ibatis.builder.xml.XMLStatementBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Throwable.class)
@Slf4j
@Service
public class SampleTransactionService {


	@Autowired
	TestDao testDao;
	/**
	 * 데이터 추가
	 * @param test
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor = Throwable.class)
	public int insert(Test test) throws Exception {
		return testDao.insert(test);
	}
	
	/**
	 * 데이터 업데이트
	 * @param test
	 * @return
	 * @throws Exception
	 */
	public int update(Test test) throws Exception {
		return testDao.update(test);
	}
	
	public int updateCondition(Test test) throws Exception {
		return testDao.updateCondition(test);
	}
	
	/**
	 * 데이터  Primary Key 조건에 해당하는 데이터만 수정(Object 로 데이터 전달)
	 * @param test
	 * @return
	 * @throws Exception
	 */
	public int updateByObjectPrimaryKey(Test test) throws Exception {
		return testDao.updateByObjectPrimaryKey(test);
	}
	
	/**
	 * 데이터  Primary Key 조건에 해당하는 데이터만 삭제
	 * @return
	 * @throws Exception
	 */
	public int deleteByPrimaryKey(Integer id, Integer uNo) throws Exception {
		return testDao.deleteByPrimaryKey(id, uNo);
	}
	
	/**
	 * 데이터  Primary Key 조건에 해당하는 데이터만 삭제(Object 로 데이터 전달)
	 * @param test
	 * @return
	 * @throws Exception
	 */
	public int deleteByObjectPrimaryKey(Test test) throws Exception {
		return testDao.deleteByObjectPrimaryKey(test);
	}
	
	/**
	 * 데이터  전체 삭제
	 * @return
	 * @throws Exception
	 */
	public int deleteAll() throws Exception {
		return testDao.deleteAll();
	}
	
	/**
	 * 데이터  Primary Key 조건에 해당하는 데이터만 찾기(Object로 데이터 전달)
	 * @param test
	 * @return
	 * @throws Exception
	 */
	@Transactional(readOnly = true)
	public Test findByObjectPrimaryKey(Test test) throws Exception {
		return testDao.findByObjectPrimaryKey(test);
	}
	
	/**
	 * 데이터  Primary Key 조건에 해당하는 데이터만 찾기
	 * @return
	 * @throws Exception
	 */
	@Transactional(readOnly = true)
	public Test findByPrimaryKey(Integer id, Integer uNo) throws Exception {
		return testDao.findByPrimaryKey(id, uNo);
	}
	
	/**
	 * 데이터( 조건에 해당하는 데이터만 찾기
	 * @param test
	 * @return
	 * @throws Exception
	 */
	@Transactional(readOnly = true)
	public List<Test> find(Test test) throws Exception {
		return testDao.find(test);
	}
	
	/**
	 * 모든 데이터 조회
	 * @return
	 * @throws Exception
	 */
	@Transactional(readOnly = true)
	public List<Test> findAll() throws Exception {
		return testDao.findAll();
	}


	@Transactional(readOnly = true)
	public List<Test> findConditionStatement(Test test) {
		return testDao.findConditionStatement(test);
	}

	@Transactional(readOnly = true)
	public List<Test> findCondition(Test test) {
		return testDao.findCondition(test);
	}
	
	/**
	 * 캐시에 있는 모든 데이터 조회
	 * @return
	 * @throws Exception
	 */
	public List<Test> findAllByCache() throws Exception {
		return testDao.findAllByCache();
	}
	
	
	/**
	 * 캐시에 있는 모든 데이터 조회
	 * @param i 
	 * @param test
	 * @return
	 * @throws Exception
	 */
//	@Cache(useCache = true, ttl = "20000")
	public List<Test> findAllByCacheAnno(int i, Test test) throws Exception {
		
		
		findAllByCache();
		
		int sample = 3;
		String haha = "4ad";
		return testDao.findAllByCacheAnno();
	}
	
	/**
	 * 캐시에 있는 모든 데이터 조회
	 * @param i 
	 * @param test
	 * @return
	 * @throws Exception
	 */
//	@Cache(useCache = true, include = "#i == 1 and #test.id == 2345")
	public List<Test> findAllByCacheAnnoCondition(int i, Test test) throws Exception {
		
		int sample = 3;
		String haha = "4ad";
		return testDao.findAllByCacheAnno();
	}
	
	/**
	 * 캐시에 있는 모든 데이터 조회
	 * @param i 
	 * @param test
	 * @return
	 * @throws Exception
	 */
	@Cacheable
//	@Cache(useCache = true, include = "#i == 1 and #test.id == 1231")
	public int findAllByCacheAnnoInt(int i, Test test) throws Exception {
		return testDao.findAllByCacheNum();
	}

//	@Cache(useCache = true)
	public List<?> findAllByCacheAnnoNoArguments() throws Exception {
		return testDao.findAllByCacheAnno();
	}
}
