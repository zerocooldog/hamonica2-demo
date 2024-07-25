package kr.co.pionnet.hamonica2.ha.metrics.repository.master;

import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricGroupMappingEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.HamonicaRepository;

public interface MetricGroupMappingRepository extends HamonicaRepository<MetricGroupMappingEntity, Long> {
    MetricGroupMappingEntity findByMetricGroupId(String metricGroupId);
}