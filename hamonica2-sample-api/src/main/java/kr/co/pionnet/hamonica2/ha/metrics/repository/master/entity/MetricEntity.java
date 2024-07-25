package kr.co.pionnet.hamonica2.ha.metrics.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "metric")
public class MetricEntity  extends RegisterModifierEntity {

    @Id
    @Size(max = 60)
    @Comment("측정항목아이디")
    @Column(name = "metric_id", nullable = false, length = 60)
    private String metricId;

    @Size(max = 30)
    @Comment("측정항목명")
    @Column(name = "metric_name", length = 30)
    private String metricName;

    @Size(max = 10)
    @Comment("측정항목유형")
    @Column(name = "metric_type", length = 10)
    private String metricType;

    @Size(max = 10)
    @Comment("데이터유형")
    @Column(name = "metric_data_type", length = 10)
    private String metricDataType;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @NotNull
    @Comment("측정지표 목록 노출 여부")
    @ColumnDefault("'Y'")
    @Column(name = "visible_yn", nullable = false)
    private Character visibleYn;

    @NotNull
    @Comment("사용여부")
    @ColumnDefault("'Y'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

    @NotNull
    @Comment("위젯 측정지표 목록 노출 여부")
    @ColumnDefault("'N'")
    @Column(name = "widget_metric_visible_yn", nullable = false)
    private Character widgetMetricVisibleYn;

    @NotNull
    @Comment("위젯 측정지표 사용 여부")
    @ColumnDefault("'N'")
    @Column(name = "widget_metric_use_yn", nullable = false)
    private Character widgetMetricUseYn;

    @NotNull
    @Comment("전송자별 합계 사용")
    @ColumnDefault("'N'")
    @Column(name = "sum_by_senders_use_yn", nullable = false)
    private Character sumBySendersUseYn;

    @NotNull
    @Comment("전송자별 평균 사용")
    @ColumnDefault("'N'")
    @Column(name = "avg_by_senders_use_yn", nullable = false)
    private Character avgBySendersUseYn;

    @NotNull
    @Comment("전송자별 갯수 사용")
    @ColumnDefault("'N'")
    @Column(name = "count_by_senders_use_yn", nullable = false)
    private Character countBySendersUseYn;

    @OneToMany(mappedBy = "metric")
    private List<MetricGroupMappingEntity> metricGroupMappings = new ArrayList<>();


}