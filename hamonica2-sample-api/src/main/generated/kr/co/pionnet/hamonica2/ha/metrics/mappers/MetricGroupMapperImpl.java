package kr.co.pionnet.hamonica2.ha.metrics.mappers;

import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupResponse;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricGroupEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-16T16:50:09+0900",
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

        metricGroupEntity.setCreatorId( metricGroupResponse.getCreatorId() );
        metricGroupEntity.setCreatedAt( metricGroupResponse.getCreatedAt() );
        metricGroupEntity.setModifierId( metricGroupResponse.getModifierId() );
        metricGroupEntity.setModifiedAt( metricGroupResponse.getModifiedAt() );
        metricGroupEntity.setMetricGroupId( metricGroupResponse.getMetricGroupId() );
        metricGroupEntity.setMetricGroupName( metricGroupResponse.getMetricGroupName() );
        metricGroupEntity.setMetricGroupNameI18n( metricGroupResponse.getMetricGroupNameI18n() );
        metricGroupEntity.setParentMetricGroupId( metricGroupResponse.getParentMetricGroupId() );
        metricGroupEntity.setSortOrder( metricGroupResponse.getSortOrder() );

        return metricGroupEntity;
    }

    @Override
    public MetricGroupResponse toResponse(MetricGroupEntity metricGroup) {
        if ( metricGroup == null ) {
            return null;
        }

        MetricGroupResponse.MetricGroupResponseBuilder<?, ?> metricGroupResponse = MetricGroupResponse.builder();

        metricGroupResponse.creatorId( metricGroup.getCreatorId() );
        metricGroupResponse.createdAt( metricGroup.getCreatedAt() );
        metricGroupResponse.modifierId( metricGroup.getModifierId() );
        metricGroupResponse.modifiedAt( metricGroup.getModifiedAt() );
        metricGroupResponse.metricGroupId( metricGroup.getMetricGroupId() );
        metricGroupResponse.metricGroupName( metricGroup.getMetricGroupName() );
        metricGroupResponse.metricGroupNameI18n( metricGroup.getMetricGroupNameI18n() );
        metricGroupResponse.parentMetricGroupId( metricGroup.getParentMetricGroupId() );
        metricGroupResponse.sortOrder( metricGroup.getSortOrder() );

        return metricGroupResponse.build();
    }

    @Override
    public MetricGroupEntity partialUpdate(MetricGroupResponse metricGroupResponse, MetricGroupEntity metricGroup) {
        if ( metricGroupResponse == null ) {
            return metricGroup;
        }

        if ( metricGroupResponse.getCreatorId() != null ) {
            metricGroup.setCreatorId( metricGroupResponse.getCreatorId() );
        }
        if ( metricGroupResponse.getCreatedAt() != null ) {
            metricGroup.setCreatedAt( metricGroupResponse.getCreatedAt() );
        }
        if ( metricGroupResponse.getModifierId() != null ) {
            metricGroup.setModifierId( metricGroupResponse.getModifierId() );
        }
        if ( metricGroupResponse.getModifiedAt() != null ) {
            metricGroup.setModifiedAt( metricGroupResponse.getModifiedAt() );
        }
        if ( metricGroupResponse.getMetricGroupId() != null ) {
            metricGroup.setMetricGroupId( metricGroupResponse.getMetricGroupId() );
        }
        if ( metricGroupResponse.getMetricGroupName() != null ) {
            metricGroup.setMetricGroupName( metricGroupResponse.getMetricGroupName() );
        }
        if ( metricGroupResponse.getMetricGroupNameI18n() != null ) {
            metricGroup.setMetricGroupNameI18n( metricGroupResponse.getMetricGroupNameI18n() );
        }
        if ( metricGroupResponse.getParentMetricGroupId() != null ) {
            metricGroup.setParentMetricGroupId( metricGroupResponse.getParentMetricGroupId() );
        }
        if ( metricGroupResponse.getSortOrder() != null ) {
            metricGroup.setSortOrder( metricGroupResponse.getSortOrder() );
        }

        return metricGroup;
    }

    @Override
    public MetricGroupEntity toEntity(MetricGroupRequest metricGroupRequest) {
        if ( metricGroupRequest == null ) {
            return null;
        }

        MetricGroupEntity metricGroupEntity = new MetricGroupEntity();

        metricGroupEntity.setMetricGroupId( metricGroupRequest.getMetricGroupId() );
        metricGroupEntity.setMetricGroupName( metricGroupRequest.getMetricGroupName() );
        metricGroupEntity.setMetricGroupNameI18n( metricGroupRequest.getMetricGroupNameI18n() );
        metricGroupEntity.setParentMetricGroupId( metricGroupRequest.getParentMetricGroupId() );
        metricGroupEntity.setSortOrder( metricGroupRequest.getSortOrder() );

        return metricGroupEntity;
    }

    @Override
    public MetricGroupRequest toRequest(MetricGroupEntity metricGroupEntity) {
        if ( metricGroupEntity == null ) {
            return null;
        }

        MetricGroupRequest metricGroupRequest = new MetricGroupRequest();

        metricGroupRequest.setMetricGroupId( metricGroupEntity.getMetricGroupId() );
        metricGroupRequest.setMetricGroupName( metricGroupEntity.getMetricGroupName() );
        metricGroupRequest.setMetricGroupNameI18n( metricGroupEntity.getMetricGroupNameI18n() );
        metricGroupRequest.setParentMetricGroupId( metricGroupEntity.getParentMetricGroupId() );
        metricGroupRequest.setSortOrder( metricGroupEntity.getSortOrder() );

        return metricGroupRequest;
    }

    @Override
    public MetricGroupEntity partialUpdate(MetricGroupRequest metricGroupRequest, MetricGroupEntity metricGroupEntity) {
        if ( metricGroupRequest == null ) {
            return metricGroupEntity;
        }

        if ( metricGroupRequest.getMetricGroupId() != null ) {
            metricGroupEntity.setMetricGroupId( metricGroupRequest.getMetricGroupId() );
        }
        if ( metricGroupRequest.getMetricGroupName() != null ) {
            metricGroupEntity.setMetricGroupName( metricGroupRequest.getMetricGroupName() );
        }
        if ( metricGroupRequest.getMetricGroupNameI18n() != null ) {
            metricGroupEntity.setMetricGroupNameI18n( metricGroupRequest.getMetricGroupNameI18n() );
        }
        if ( metricGroupRequest.getParentMetricGroupId() != null ) {
            metricGroupEntity.setParentMetricGroupId( metricGroupRequest.getParentMetricGroupId() );
        }
        if ( metricGroupRequest.getSortOrder() != null ) {
            metricGroupEntity.setSortOrder( metricGroupRequest.getSortOrder() );
        }

        return metricGroupEntity;
    }
}
