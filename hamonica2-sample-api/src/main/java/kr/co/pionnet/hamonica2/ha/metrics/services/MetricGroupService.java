package kr.co.pionnet.hamonica2.ha.metrics.services;

import kr.co.pionnet.hamonica2.ha.metrics.mappers.MetricGroupMapper;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.MetricGroupRepository;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricGroupEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Slf4j
@Service
public class MetricGroupService {


    private final MetricGroupRepository metricGroupRepository;

    private final MetricGroupMapper metricGroupMapper;

    public MetricGroupService(
            MetricGroupRepository metricGroupRepository,
            MetricGroupMapper metricGroupMapper
    ) {
        this.metricGroupRepository = metricGroupRepository;
        this.metricGroupMapper = metricGroupMapper;
    }

    public MetricGroupResponse saveMetricGroup(MetricGroupRequest metricGroupRequest) {

        MetricGroupEntity metricGroupEntity = metricGroupMapper.toEntity(metricGroupRequest);

        metricGroupEntity.setMetricGroupNameI18n("");
        metricGroupEntity.setCreatorId("test");
        metricGroupEntity.setCreatedAt(Instant.now());

        log.debug("########### metricGroupEntity : {}", metricGroupEntity);
        return metricGroupMapper.toResponse(metricGroupRepository.persist(metricGroupEntity));
    }
}
