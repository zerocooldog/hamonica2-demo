package kr.co.pionnet.hamonica2.ha.metrics.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricGroupEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * DTO for {@link MetricGroupEntity}
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MetricGroupResponse implements Serializable {
    @NotNull
    @Size(max = 20)
    String creatorId;
    @NotNull
    Instant createdAt;
    @Size(max = 20)
    String modifierId;
    Instant modifiedAt;
    @Size(max = 10)
    String metricGroupId;
    @NotNull
    @Size(max = 50)
    String metricGroupName;
    @NotNull
    @Size(max = 300)
    String metricGroupNameI18n;
    @NotNull
    @Size(max = 10)
    String parentMetricGroupId;
    @NotNull
    Integer sortOrder;

    List<MetricResponse> metrics;
}