package kr.co.pionnet.hamonica2.ha.metrics.models;

import kr.co.pionnet.butterfly2.core.bean.RegisterModifierBean;
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
public class MetricResponse extends RegisterModifierBean implements Serializable {

    String metricId;
    String metricGroupId;
    String metricName;
    String description;
}