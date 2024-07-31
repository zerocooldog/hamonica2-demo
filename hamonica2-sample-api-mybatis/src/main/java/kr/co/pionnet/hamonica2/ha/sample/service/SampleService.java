package kr.co.pionnet.hamonica2.ha.sample.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SampleService {

	public void test(int i) {

		log.debug("test : {}", i);
	}
	
	public void getValue(String value) {

		log.debug("value : {}", value);
	}
}
