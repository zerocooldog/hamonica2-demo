package kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.constant.SequenceName;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.identifier.StringPrefixedIdGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@Getter
@Setter
@Entity
@Table(name = "metric_group")
public class MetricGroupEntity extends RegisterModifierEntity {

    @Id
    @Size(max = 10)
    @Column(name = "metric_group_id", nullable = false, length = 10)
    @GenericGenerator(
            name = StringPrefixedIdGenerator.GENERATOR_NAME,
            strategy = StringPrefixedIdGenerator.STRATEGY_PACKAGE,
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.SEQUENCE_PARAM, value = SequenceName.METRIC_GROUP_METRIC_GROUP_ID_SEQ),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.VALUE_PREFIX_PARAM, value = "MTG"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.LPAD_LENGTH_PARAM, value = "7")
            })
    @GeneratedValue(generator = StringPrefixedIdGenerator.GENERATOR_NAME)
    private String metricGroupId;

    @Size(max = 50)
    @NotNull
    @Comment("측정지표 그룹 명")
    @Column(name = "metric_group_name", nullable = false, length = 50)
    private String metricGroupName;

    @Size(max = 300)
    @NotNull
    @Comment("측정지표 그룹 명 국제화")
    @Column(name = "metric_group_name_i18n", nullable = false, length = 300)
    private String metricGroupNameI18n;

    @Size(max = 10)
    @NotNull
    @Comment("부모 측정지표 그룹 아이디")
    @Column(name = "parent_metric_group_id", nullable = false, length = 10)
    private String parentMetricGroupId;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @OneToMany(mappedBy = "metricGroup")
    @ToString.Exclude
    private List<MetricGroupMappingEntity> metricGroupMappings = new ArrayList<>();
}