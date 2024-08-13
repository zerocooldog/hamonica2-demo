package kr.co.pionnet.hamonica2.ha.metrics.mappers;

import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T10:59:46+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class MetricMapperImpl implements MetricMapper {

    @Override
    public MetricEntity toEntity(MetricResponse metricResponse) {
        if ( metricResponse == null ) {
            return null;
        }

        MetricEntity metricEntity = new MetricEntity();

        metricEntity.setCreatorId( metricResponse.getCreatorId() );
        metricEntity.setCreatedAt( metricResponse.getCreatedAt() );
        metricEntity.setModifierId( metricResponse.getModifierId() );
        metricEntity.setModifiedAt( metricResponse.getModifiedAt() );

        return metricEntity;
    }

    @Override
    public MetricResponse toDto(MetricEntity metric) {
        if ( metric == null ) {
            return null;
        }

        MetricResponse metricResponse = new MetricResponse();

        metricResponse.setCreatorId( metric.getCreatorId() );
        metricResponse.setCreatedAt( metric.getCreatedAt() );
        metricResponse.setModifierId( metric.getModifierId() );
        metricResponse.setModifiedAt( metric.getModifiedAt() );

        return metricResponse;
    }

    @Override
    public MetricEntity partialUpdate(MetricResponse metricResponse, MetricEntity metric) {
        if ( metricResponse == null ) {
            return metric;
        }

        if ( metricResponse.getCreatorId() != null ) {
            metric.setCreatorId( metricResponse.getCreatorId() );
        }
        if ( metricResponse.getCreatedAt() != null ) {
            metric.setCreatedAt( metricResponse.getCreatedAt() );
        }
        if ( metricResponse.getModifierId() != null ) {
            metric.setModifierId( metricResponse.getModifierId() );
        }
        if ( metricResponse.getModifiedAt() != null ) {
            metric.setModifiedAt( metricResponse.getModifiedAt() );
        }

        return metric;
    }

    @Override
    public MetricEntity toEntity(MetricRequest metricRequest) {
        if ( metricRequest == null ) {
            return null;
        }

        MetricEntity metricEntity = new MetricEntity();

        return metricEntity;
    }

    @Override
    public MetricRequest toDto1(MetricEntity metric) {
        if ( metric == null ) {
            return null;
        }

        MetricRequest metricRequest = new MetricRequest();

        return metricRequest;
    }

    @Override
    public MetricEntity partialUpdate(MetricRequest metricRequest, MetricEntity metric) {
        if ( metricRequest == null ) {
            return metric;
        }

        return metric;
    }
}
