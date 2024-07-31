package kr.co.pionnet.hamonica2.ha.sample.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


import jakarta.servlet.http.HttpServletResponse;
import kr.co.pionnet.butterfly2.core.controller.BaseController;
import kr.co.pionnet.hamonica2.ha.sample.repository.master.Test;
import kr.co.pionnet.hamonica2.ha.sample.service.SampleTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;

import static kr.co.pionnet.butterfly2.core.util.UtilResponse.writeJson;

@Slf4j
@Controller
@RequestMapping("sample/transaction")
public class SampleTransactionController extends BaseController {

	@Autowired
	SampleTransactionService sampleTransactionService;

	@GetMapping("insert")
	public void insert() throws Exception {

		Test test = new Test();
		test.setId((int)(Math.random() * 1000000));
		test.setName("장진철");
		test.setUNo((int)(Math.random() * 1000000));

		log.debug("######### insert {}", test);

		sampleTransactionService.insert(test);
	}

	@GetMapping("update")
	public void update() throws Exception {

		Test test = new Test();
		test.setName("장진철");

		sampleTransactionService.updateCondition(test);
	}

	@GetMapping(value = "findAll")
	public void findAll(HttpServletResponse response) throws Exception {

		List<?> dataList = sampleTransactionService.findAll();
		writeJson(response, dataList);

		log.debug("findAll size : {}", (dataList != null) ? dataList.size() : 0);
	}

	@GetMapping(value = "findAllWithHeader")
	public void findAllWithHeader(HttpServletResponse response, @RequestHeader("header") String header) throws Exception {

		if (Objects.equals(header, "asdf")) {
			List<?> dataList = sampleTransactionService.findAllByCache();
			writeJson(response, dataList);
			log.debug("findAll size : {}", (dataList != null) ? dataList.size() : 0);
		}
	}

	@GetMapping("findConditionStatement")
	public void findConditionStatement() throws Exception {

		Test test = new Test();
		test.setRegDtime(LocalDateTime.now());

		List<?> dataList = sampleTransactionService.findConditionStatement(test);

		log.debug("findAll size : {}", (dataList != null) ? dataList.size() : 0);
	}

	@GetMapping("findCondition")
	public void findCondition() throws Exception {

		Test test = new Test();
		test.setRegDtime(LocalDateTime.now());

		List<?> dataList = sampleTransactionService.findCondition(test);

		log.debug("findAll size : {}", (dataList != null) ? dataList.size() : 0);
	}

	@GetMapping("findAllByCache")
	public void findAllByCache(HttpServletResponse response) throws Exception {

		List<?> dataList = sampleTransactionService.findAllByCache();
		writeJson(response, dataList);
		log.debug("findAll size : {}", (dataList != null) ? dataList.size() : 0);
	}

	@GetMapping("findAllByCacheAnno")
	public void findAllByCacheAnno(HttpServletResponse response, @RequestParam(value = "number") int number) throws Exception {

		Test test = new Test();
		test.setId(1231);

		List<?> dataList = sampleTransactionService.findAllByCacheAnno(number, test);
		sampleTransactionService.findAllByCacheAnnoCondition(1, test);
		writeJson(response, dataList);
	}

	@GetMapping("findAllByCacheAnnoCondition")
	public void findAllByCacheAnnoCondition(HttpServletResponse response) throws Exception {

		Test test = new Test();
		test.setId(1231);

		List<?> dataList = sampleTransactionService.findAllByCacheAnnoCondition(1, test);

		log.debug("findAll size : {}", (dataList != null) ? dataList.size() : 0);
		writeJson(response, dataList);
	}

	@GetMapping("findAllByCacheAnnoOther")
	public void findAllByCacheAnnoOther(HttpServletResponse response) throws Exception {

		Test test = new Test();
		test.setId(51231);

		List<?> dataList = sampleTransactionService.findAllByCacheAnno(3434, test);

		log.debug("findAll size : {}", (dataList != null) ? dataList.size() : 0);
		writeJson(response, dataList);
	}

	@GetMapping("findAllByCacheAnnoInt")
	public void findAllByCacheAnnoInt(HttpServletResponse response) throws Exception {

		Test test = new Test();
		test.setId(1231);

		log.debug("findAllByCacheAnnoInt : {}", sampleTransactionService.findAllByCacheAnnoInt(1, test));
	}
}