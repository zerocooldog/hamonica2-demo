package kr.co.pionnet.hamonica2.ha.metrics.models;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * DTO for {@link kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity.Metric}
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MetricRequest implements Serializable {
    @NotBlank(message = "빈 값을 허용하지 않습니다.")
    String metricId;
    String metricGroupId;
    String metricName;
    String description;
}