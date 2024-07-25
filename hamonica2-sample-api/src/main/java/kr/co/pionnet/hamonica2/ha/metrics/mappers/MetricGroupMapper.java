package kr.co.pionnet.hamonica2.ha.metrics.mappers;

import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricGroupEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MetricGroupMapper {

    MetricGroupEntity toEntity(MetricGroupResponse metricGroupResponse);

        // metrics는 나중에 별도로 설정할 것이므로 여기서는 무시합니다.
    MetricGroupResponse toResponse(MetricGroupEntity metricGroup);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    MetricGroupEntity partialUpdate(MetricGroupResponse metricGroupResponse, @MappingTarget MetricGroupEntity metricGroup);

    MetricGroupEntity toEntity(MetricGroupRequest metricGroupRequest);

    MetricGroupRequest toRequest(MetricGroupEntity metricGroupEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    MetricGroupEntity partialUpdate(MetricGroupRequest metricGroupRequest, @MappingTarget MetricGroupEntity metricGroupEntity);
}