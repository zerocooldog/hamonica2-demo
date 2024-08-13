package kr.co.pionnet.hamonica2.ha.metrics.mappers;

import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricGroupEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T10:59:46+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class MetricGroupMapperImpl implements MetricGroupMapper {

    @Override
    public MetricGroupEntity toEntity(MetricGroupResponse metricGroupResponse) {
        if ( metricGroupResponse == null ) {
            return null;
        }

        MetricGroupEntity metricGroupEntity = new MetricGroupEntity();

        return metricGroupEntity;
    }

    @Override
    public MetricGroupResponse toResponse(MetricGroupEntity metricGroup) {
        if ( metricGroup == null ) {
            return null;
        }

        MetricGroupResponse metricGroupResponse = new MetricGroupResponse();

        return metricGroupResponse;
    }

    @Override
    public MetricGroupEntity partialUpdate(MetricGroupResponse metricGroupResponse, MetricGroupEntity metricGroup) {
        if ( metricGroupResponse == null ) {
            return metricGroup;
        }

        return metricGroup;
    }

    @Override
    public MetricGroupEntity toEntity(MetricGroupRequest metricGroupRequest) {
        if ( metricGroupRequest == null ) {
            return null;
        }

        MetricGroupEntity metricGroupEntity = new MetricGroupEntity();

        return metricGroupEntity;
    }

    @Override
    public MetricGroupRequest toRequest(MetricGroupEntity metricGroupEntity) {
        if ( metricGroupEntity == null ) {
            return null;
        }

        MetricGroupRequest metricGroupRequest = new MetricGroupRequest();

        return metricGroupRequest;
    }

    @Override
    public MetricGroupEntity partialUpdate(MetricGroupRequest metricGroupRequest, MetricGroupEntity metricGroupEntity) {
        if ( metricGroupRequest == null ) {
            return metricGroupEntity;
        }

        return metricGroupEntity;
    }
}
