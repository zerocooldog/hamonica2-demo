package kr.co.pionnet.hamonica2.ha.metrics.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.MetricGroupEntity}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetricGroupRequest implements Serializable {
    @Size(max = 10)
    private String metricGroupId;
    @NotNull
    @Size(max = 50)
    private String metricGroupName;
    @NotNull
    @Size(max = 300)
    private String metricGroupNameI18n;
    @NotNull
    @Size(max = 10)
    private String parentMetricGroupId;
    @NotNull
    private Integer sortOrder;
}