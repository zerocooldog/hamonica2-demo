package kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterEntity;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "metric_group_mapping")
public class MetricGroupMappingEntity extends RegisterEntity {

    @Id
    @Comment("측정지표 그룹 연결 번호")
    @Column(name = "metric_group_mapping_no", nullable = false)
    private Long id;

    @Size(max = 10)
    @NotNull
    @Comment("측정지표 그룹아이디")
    @Column(name = "metric_group_id", nullable = false, length = 10, insertable=false, updatable=false)
    private String metricGroupId;

    @Size(max = 60)
    @NotNull
    @Comment("측정항목아이디")
    @Column(name = "metric_id", nullable = false, length = 60, insertable=false, updatable=false)
    private String metricId;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @ManyToOne
    @JoinColumn(name = "metric_group_id")
    private MetricGroupEntity metricGroup = new MetricGroupEntity();


    @ManyToOne
    @JoinColumn(name = "metric_id")
    private MetricEntity metric = new MetricEntity();


}