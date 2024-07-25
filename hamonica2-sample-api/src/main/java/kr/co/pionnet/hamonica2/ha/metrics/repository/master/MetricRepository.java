package kr.co.pionnet.hamonica2.ha.metrics.repository.master;

import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.HamonicaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository 인터페이스를 상속 받을 경우 자동으로 Spring bean 으로 등록 된다.
 * 따러서 @Repository 어노테이션을 붙일 필요가 없다.
 * 그러나 QSDL 사용시 커스텀 구현이 필요한 경우 @Repository 어노테이션을 붙여주어야 한다.
 */
public interface MetricRepository extends HamonicaRepository<MetricEntity, String> {

    MetricEntity findByMetricId(String metricId);
}
