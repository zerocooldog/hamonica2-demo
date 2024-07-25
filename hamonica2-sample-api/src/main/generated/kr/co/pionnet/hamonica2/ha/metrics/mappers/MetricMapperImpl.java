package kr.co.pionnet.hamonica2.ha.metrics.mappers;

import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-25T13:30:58+0900",
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
        metricEntity.setMetricId( metricResponse.getMetricId() );
        metricEntity.setMetricName( metricResponse.getMetricName() );

        return metricEntity;
    }

    @Override
    public MetricResponse toDto(MetricEntity metric) {
        if ( metric == null ) {
            return null;
        }

        MetricResponse.MetricResponseBuilder<?, ?> metricResponse = MetricResponse.builder();

        metricResponse.creatorId( metric.getCreatorId() );
        metricResponse.createdAt( metric.getCreatedAt() );
        metricResponse.modifierId( metric.getModifierId() );
        metricResponse.modifiedAt( metric.getModifiedAt() );
        metricResponse.metricId( metric.getMetricId() );
        metricResponse.metricName( metric.getMetricName() );

        return metricResponse.build();
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
        if ( metricResponse.getMetricId() != null ) {
            metric.setMetricId( metricResponse.getMetricId() );
        }
        if ( metricResponse.getMetricName() != null ) {
            metric.setMetricName( metricResponse.getMetricName() );
        }

        return metric;
    }

    @Override
    public MetricEntity toEntity(MetricRequest metricRequest) {
        if ( metricRequest == null ) {
            return null;
        }

        MetricEntity metricEntity = new MetricEntity();

        metricEntity.setMetricId( metricRequest.getMetricId() );
        metricEntity.setMetricName( metricRequest.getMetricName() );

        return metricEntity;
    }

    @Override
    public MetricRequest toDto1(MetricEntity metric) {
        if ( metric == null ) {
            return null;
        }

        MetricRequest.MetricRequestBuilder<?, ?> metricRequest = MetricRequest.builder();

        metricRequest.metricId( metric.getMetricId() );
        metricRequest.metricName( metric.getMetricName() );

        return metricRequest.build();
    }

    @Override
    public MetricEntity partialUpdate(MetricRequest metricRequest, MetricEntity metric) {
        if ( metricRequest == null ) {
            return metric;
        }

        if ( metricRequest.getMetricId() != null ) {
            metric.setMetricId( metricRequest.getMetricId() );
        }
        if ( metricRequest.getMetricName() != null ) {
            metric.setMetricName( metricRequest.getMetricName() );
        }

        return metric;
    }
}
