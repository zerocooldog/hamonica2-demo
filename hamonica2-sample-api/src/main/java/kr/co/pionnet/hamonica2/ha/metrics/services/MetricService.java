package kr.co.pionnet.hamonica2.ha.metrics.services;

import kr.co.pionnet.hamonica2.ha.metrics.mappers.MetricMapper;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.MetricRepository;
import org.springframework.stereotype.Service;

@Service
public class MetricService {


    private final MetricRepository metricRepository;
    private final MetricMapper metricMapper;

    public MetricService(MetricRepository metricRepository,
                         MetricMapper metricMapper) {
        this.metricRepository = metricRepository;
        this.metricMapper = metricMapper;
    }

    public MetricResponse getMetric(MetricRequest metricsParameter) {
        return metricMapper.toDto(metricRepository.findByMetricId(metricsParameter.getMetricId()));

    }
}
