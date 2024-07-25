package kr.co.pionnet.hamonica2.ha.metrics.services;

import kr.co.pionnet.butterfly2.core.exception.ServiceException;
import kr.co.pionnet.hamonica2.ha.metrics.mappers.MetricGroupMapper;
import kr.co.pionnet.hamonica2.ha.metrics.mappers.MetricMapper;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.MetricGroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Slf4j
@Service
public class MetricsService {
    private final MetricMapper metricMapper;

    private final MetricGroupRepository metricGroupRepository;
    private final MetricGroupMapper metricGroupMapper;

    public MetricsService(MetricGroupRepository metricGroupRepository,
                          MetricMapper metricMapper, MetricGroupMapper metricGroupMapper) {
        this.metricGroupRepository = metricGroupRepository;
        this.metricMapper = metricMapper;
        this.metricGroupMapper = metricGroupMapper;
    }

    /**
     * 측정 지표 그룹에 속한 측정지표 정보를 불러온다.
     *
     * @param metricGroupId 측정지표 그룹아이디
     * @return MetricGroupResponse
     *
     */
    public MetricGroupResponse getMetricsByMetricGroupId(String metricGroupId) throws ServiceException {

        MetricGroupResponse result = null; // metricGroup이 존재하지 않으면 null을 반환합니다.

        try {

            result = metricGroupRepository.findById(metricGroupId)
                    .map(metricGroup -> {
                        // MetricGroup을 DTO로 변환합니다.
                        MetricGroupResponse metricGroupResponse = metricGroupMapper.toResponse(metricGroup);

                        // MetricGroupMappings를 MetricResponse 리스트로 변환합니다.
                        metricGroupResponse.setMetrics(
                                metricGroup.getMetricGroupMappings()
                                        .stream()
                                        .map(mapping -> metricMapper.toDto(mapping.getMetric()))
                                        .collect(Collectors.toList())
                        );

                        // 최종적으로 MetricGroupResponse를 빌드하여 반환합니다.
                        return metricGroupResponse;
                    })
                    .orElse(null);

        } catch (Exception e) {
            throw new ServiceException(e);
        }

        return result;
    }
}
