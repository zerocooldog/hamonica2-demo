package kr.co.pionnet.hamonica2.ha.cache.services;

import jakarta.persistence.criteria.CriteriaBuilder;
import kr.co.pionnet.hamonica2.cache.annotation.HamonicaCache;
import kr.co.pionnet.hamonica2.cache.caches.HamonicaCommonCache;
import kr.co.pionnet.hamonica2.cache.manager.HamonicaCacheManager;
import kr.co.pionnet.hamonica2.cache.test.testModule.testClass.Enterprise;
import kr.co.pionnet.hamonica2.cache.test.testModule.testClass.MetricResponse;
import kr.co.pionnet.hamonica2.ha.cache.repository.master.CacheTestRepository;
import kr.co.pionnet.hamonica2.ha.cache.repository.master.entity.CacheTestEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
@HamonicaCache(category = "test")
public class CacheTestService {

    private int idx = 0;

    private final CacheTestRepository cacheTestRepository;

    public CacheTestService(CacheTestRepository cacheTestRepository) {
        this.cacheTestRepository = cacheTestRepository;
    }

    public void initCacheTest(String id){
        CacheTestEntity id1 = new CacheTestEntity(id, "test@@");
        CacheTestEntity persist = (CacheTestEntity) cacheTestRepository.persist(id1);

        log.debug("========================> {} ", persist);

    }


    //@Cacheable(value = "testCache", key = "#id", cacheResolver = "cacheResolver")
    //@Cacheable(value = "testCache", key = "#metricResponse")
    //@HamonicaCacheable(cacheKey = "#id + '-' + #metricResponse")
    //@HamonicaCacheable(cacheKey = "#id + '-' + #metricResponse")
    //@HamonicaCacheable
    //@Cacheable(value = "hamonica2-api", key = "#root.methodName")
    //@HamonicaCacheable(cacheKey = "#root.methodName", condition = "#id == 'id1'")

    //@Cacheable(value = "test1", condition = "#metricResponse.enterprise != null and #metricResponse.enterprise.enterpriseName != ''")
    @Cacheable
    public Optional<CacheTestEntity> fetchUserInfoFromDatabase(String id, int[] num, Map<String, String> map, MetricResponse metricResponse, String goosCd) {
        log.debug("디비조회");
        Optional<CacheTestEntity> result = cacheTestRepository.findById(id);
        //methodTest("aaa", 1);

        return result;
    }

    @Cacheable
    public Integer methodTest(String a, Integer b) {
        log.debug("메소드 실행 2");
        return b;
    }


    @HamonicaCache(businessKey = "'GOOD_CD:' + #goosCd", primaryCacheTtl = 100, secondaryCacheTtl = 150, value = false, enablePrimaryCache = false, enableSecondaryCache = false)
    @Cacheable
    public Optional<CacheTestEntity> fetchUserInfoFromDatabase1(String id, int[] num, Map<String, String> map, MetricResponse metricResponse, Enterprise enterprise, String goosCd) {
        log.debug("디비조회");
        Optional<CacheTestEntity> result = cacheTestRepository.findById(id);

        return result;
    }

    @Cacheable
    public Optional<CacheTestEntity> fetchUserInfoFromDatabase2(String id, int[] num, Map<String, String> map, MetricResponse metricResponse, Enterprise enterprise, String goosCd) {
        log.debug("디비조회");
        Optional<CacheTestEntity> result = cacheTestRepository.findById(id);

        return result;
    }

    @HamonicaCache(businessKey = "'GOOD_CD:' + #goosCd")
    public Optional<CacheTestEntity> fetchUserInfoFromDatabase3(String id, int[] num, Map<String, String> map, MetricResponse metricResponse, Enterprise enterprise, String goosCd) {
        log.debug("디비조회");
        Optional<CacheTestEntity> result = cacheTestRepository.findById(id);

        return result;
    }

    public void getCacheList(String cacheName, String key) {

        // 1,2 차 캐시 kye, name 통해서 직접 조회
        List<HamonicaCommonCache> cacheList = HamonicaCacheManager.getCacheList(cacheName);

        log.debug("====================================================");
        int index = 1;
        for(Cache cache : cacheList){
            Cache.ValueWrapper valueWrapper = cache.get(key);
            log.debug("======================>{}차 캐시 결과1 :  {} ", index, cache);
            log.debug("======================>{}차 캐시 결과2 :  {} ", index, valueWrapper);
            if(valueWrapper != null){
                log.debug("======================>{}차 캐시 결과3 :  {} ", index, valueWrapper.get());
            }
            index++;
        }
        log.debug("====================================================");

        HamonicaCommonCache primaryCache = HamonicaCacheManager.getPrimaryCache(cacheName);
        HamonicaCommonCache secondaryCache = HamonicaCacheManager.getSecondaryCache(cacheName);

        Cache.ValueWrapper valueWrapper1 = primaryCache.get(key);
        Cache.ValueWrapper valueWrapper2 = secondaryCache.get(key);

        log.debug("======================>1차 캐시 결과1 :  {} ", primaryCache);
        log.debug("======================>1차 캐시 결과2 :  {} ", valueWrapper1);
        if(valueWrapper1 != null){
            log.debug("======================>1차 캐시 결과3 :  {} ", valueWrapper1.get());
        }

        log.debug("======================>2차 캐시 결과1 :  {} ", secondaryCache);
        log.debug("======================>2차 캐시 결과2 :  {} ", valueWrapper2);
        if(valueWrapper2 != null){
            log.debug("======================>2차 캐시 결과3 :  {} ", valueWrapper2.get());
        }

    }

}
