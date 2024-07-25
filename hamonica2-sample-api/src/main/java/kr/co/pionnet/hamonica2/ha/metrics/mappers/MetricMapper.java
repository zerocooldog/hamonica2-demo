package kr.co.pionnet.hamonica2.ha.metrics.mappers;

import kr.co.pionnet.hamonica2.ha.metrics.models.MetricRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MetricMapper {
    MetricEntity toEntity(MetricResponse metricResponse);

    MetricResponse toDto(MetricEntity metric);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    MetricEntity partialUpdate(MetricResponse metricResponse, @MappingTarget MetricEntity metric);

    MetricEntity toEntity(MetricRequest metricRequest);

    MetricRequest toDto1(MetricEntity metric);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    MetricEntity partialUpdate(MetricRequest metricRequest, @MappingTarget MetricEntity metric);
}