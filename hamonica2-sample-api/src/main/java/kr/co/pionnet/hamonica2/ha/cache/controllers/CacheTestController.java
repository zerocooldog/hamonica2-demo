package kr.co.pionnet.hamonica2.ha.cache.controllers;

import ch.qos.logback.classic.AsyncAppender;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import jakarta.servlet.http.HttpServletRequest;
import kr.co.pionnet.hamonica2.cache.test.testModule.testClass.*;
import kr.co.pionnet.hamonica2.cache.util.UtilClass;
import kr.co.pionnet.hamonica2.ha.cache.services.CacheTestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.HashMap;


@Slf4j
@RequiredArgsConstructor
@RequestMapping("cache/code")
@RestController
public class CacheTestController {

    private final CacheTestService cacheTestService;
    public String nowHashKey;

    @Value("${spring.application.name}")
    private String cacheName;

    @PostMapping("initCacheTest")
    public ResponseEntity<?> initCacheTest(){
        cacheTestService.initCacheTest("id1");
        return ResponseEntity.ok("ok");

    }

    @PostMapping("cacheTestService")
    public ResponseEntity<?> cacheTestService(HttpServletRequest request){
        HashMap<String, String> test = new HashMap<>();
        test.put("idid", "11");
        UtilClass utilClass = new UtilClass();
        AsyncAppender asyncAppender = new AsyncAppender();
        MetricResponse metricResponse = new MetricResponse();

        metricResponse.setMetricId("1111");
        metricResponse.setTest(1234);

        Enterprise enterprise1 = new Enterprise();
        enterprise1.setEnterpriseName("test111");
        metricResponse.setEnterprise(enterprise1);

        testObject testObject = new testObject();
        testObject.setValue(22);
        int[] ints = {1,2,3,4,5};

        //boolean enablePrimaryCache = AgentConfig.enablimplementation 'org.springframework.boot:spring-boot-starter'PrimaryCache;

        // 대용량 객체
        // Enterprise enterprise = JavaFakerExample.enterprise1;
        //enterprise.setGlobal(true);

        cacheName = "kr.co.pionnet.hamonica2.ha.cache.services.CacheTestService.fetchUserInfoFromDatabase:-653454472";
        //cacheName = "test1";
        cacheTestService.getCacheList(cacheName, nowHashKey);
        log.debug("현재 캐시 키 : {}", nowHashKey);
        log.debug("결과 : {}", cacheTestService.fetchUserInfoFromDatabase("id1", ints, test, metricResponse, "G123827323"));

        //cacheTestService.methodTest("asd", 1);
        String hamonicaHashKey = (String)request.getAttribute("hamonicaHashKey");
        nowHashKey = hamonicaHashKey;
        log.debug("현재 캐시 키2 : {}", nowHashKey);
        log.debug("현재 캐시 키 이름 : {}", cacheName);
        cacheTestService.getCacheList(cacheName, nowHashKey);


/*        cacheName = "test1";
        cacheTestService.getCacheList(cacheName, "id1");
        log.debug("현재 캐시 키 : {}", "id1");
        log.debug("결과 : {}", cacheTestService.fetchUserInfoFromDatabase("id1", ints, test, metricResponse, enterprise));
        String hamonicaHashKey = (String)request.getAttribute("hamonicaHashKey");
        nowHashKey = hamonicaHashKey;
        log.debug("현재 캐시 키2 : {}", "id1");
        log.debug("현재 캐시 키 이름 : {}", cacheName);
        cacheTestService.getCacheList(cacheName, "id1");*/

/*
        log.debug("===============================캐시 evict");
        cacheTestService.cacheEvictTest(nowHashKey);
        cacheTestService.getCacheList(cacheName, nowHashKey);*/

        return ResponseEntity.ok("");

    }

    @PostMapping("cacheTestServiceSleep")
    public ResponseEntity<?> cacheTestServiceSleep(HttpServletRequest request) throws InterruptedException {
        HashMap<String, String> test = new HashMap<>();
        test.put("idid", "11");
        MetricResponse metricResponse = new MetricResponse();
        metricResponse.setMetricId("1111");
        metricResponse.setTest(1234);


        testObject testObject = new testObject();
        testObject.setValue(22);
        int[] ints = {1,2,3,4,5};
        request.setAttribute("isSleepRequest", true);

        // 대용량 객체
        Enterprise enterprise = JavaFakerExampleSimple.enterprise1;

        cacheTestService.getCacheList(cacheName, nowHashKey);
        log.debug("현재 캐시 키 : {}", nowHashKey);
        log.debug("결과 : {}", cacheTestService.fetchUserInfoFromDatabase("id1", ints, test, metricResponse, "G123827323"));
        String hamonicaHashKey = (String)request.getAttribute("hamonicaHashKey");
        nowHashKey = hamonicaHashKey;
        cacheTestService.getCacheList(cacheName, nowHashKey);

        return ResponseEntity.ok("");

    }


    @PostMapping("hashTest")
    public ResponseEntity<?> hashTest() throws JsonProcessingException {
        Enterprise enterprise = JavaFakerExample.enterprise1;
        Enterprise enterprise2 = JavaFakerExampleHalf.enterprise1;
        ObjectMapper objectMapper = new ObjectMapper();
        String input = objectMapper.writeValueAsString(enterprise2);
        //String input = "Benchmarking the performance of Guava and Apache Commons Codec libraries for hashing";

        Address address1 = new Address();
        address1.setStreet("test");
        String aa = "test";
        String bb = "test";

        Address address2 = new Address();
        address2.setStreet("test");

        log.debug("해시코드1 : {}", aa.hashCode());
        log.debug("해시코드2 : {}", bb.hashCode());

        return ResponseEntity.ok("ok");

    }

    @GetMapping("getPid")
    public ResponseEntity<?> getPid(HttpServletRequest request) throws IOException, AttachNotSupportedException, AgentLoadException, AgentInitializationException {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        System.out.println("JVM PID: " + pid);
        // JVM의 PID로 attach
        return ResponseEntity.ok("ok");
    }
}
