package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.constant.SequenceName;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import java.time.Instant;

@Getter
@Setter
@Comment("경보")
@Entity
@Table(name = "alarm")
public class AlarmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SequenceName.ALARM_ALARM_NO_SEQ)
    @Comment("경보 번호")
    @Column(name = "alarm_no", nullable = false)
    private Integer alarmNo;

    @Size(max = 50)
    @NotNull
    @Comment("경보 유형")
    @Column(name = "alarm_type", nullable = false, length = 50)
    private String alarmType;

    @Size(max = 50)
    @NotNull
    @Comment("경보 발생 데이터 출처")
    @Column(name = "alarm_source_type", nullable = false, length = 50)
    private String alarmSourceType;

    @Size(max = 20)
    @NotNull
    @Comment("심각도")
    @Column(name = "severity", nullable = false, length = 20)
    private String severity;

    @Comment("경보 조건")
    @Column(name = "alarm_condition", length = Integer.MAX_VALUE)
    private String alarmCondition;

    @NotNull
    @Comment("경보 발생 내용 형식 사용")
    @Column(name = "alarm_content_template_use_yn", nullable = false)
    private Character alarmContentTemplateUseYn;

    @NotNull
    @Comment("경보 발생 내용 형식")
    @Column(name = "alarm_content_template", nullable = false, length = Integer.MAX_VALUE)
    private String alarmContentTemplate;

    @Comment("기본 적용 여부")
    @ColumnDefault("'Y'")
    @Column(name = "default_applied_yn")
    private Character defaultAppliedYn;

    @Size(max = 100)
    @Comment("설명")
    @Column(name = "description", length = 100)
    private String description;

    @NotNull
    @Comment("알림 사용 유무")
    @ColumnDefault("'Y'")
    @Column(name = "notification_use_yn", nullable = false)
    private Character notificationUseYn;

    @NotNull
    @Comment("정렬순서")
    @ColumnDefault("0")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @NotNull
    @Comment("사용 유무")
    @ColumnDefault("'Y'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

    @Size(max = 20)
    @NotNull
    @Comment("등록자")
    @Column(name = "creator_id", nullable = false, length = 20)
    private String creatorId;

    @NotNull
    @Comment("등록일시")
    @ColumnDefault("now()")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Size(max = 20)
    @Comment("수정자")
    @Column(name = "modifier_id", length = 20)
    private String modifierId;

    @Comment("수정일시")
    @Column(name = "modified_at")
    private Instant modifiedAt;

}