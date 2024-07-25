package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Comment("이벤트")
@Entity
@Table(name = "event")
public class EventEntity extends RegisterModifierEntity {

    @Id
    @Size(max = 10)
    @Comment("이벤트 아이디")
    @Column(name = "event_id", nullable = false, length = 10)
    private String eventId;

    @Size(max = 20)
    @NotNull
    @Comment("이벤트 유형")
    @Column(name = "event_type", nullable = false, length = 20)
    private String eventType;

    @Size(max = 50)
    @NotNull
    @Comment("이벤트 명")
    @Column(name = "event_name", nullable = false, length = 50)
    private String eventName;

    @Size(max = 300)
    @Comment("이벤트 명 국제")
    @Column(name = "event_name_i18n", length = 300)
    private String eventNameI18n;

    @NotNull
    @Comment("이벤트 내용 형식")
    @Column(name = "event_content_template", nullable = false, length = Integer.MAX_VALUE)
    private String eventContentTemplate;

    @Size(max = 10)
    @NotNull
    @Comment("심각도")
    @Column(name = "severity", nullable = false, length = 10)
    private String severity;

    @Comment("기본 적용")
    @ColumnDefault("'Y'")
    @Column(name = "default_applied")
    private Character defaultApplied;

    @NotNull
    @Comment("사용여부")
    @ColumnDefault("'Y'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

    @NotNull
    @Comment("화면 노출 여부")
    @ColumnDefault("'Y'")
    @Column(name = "visible_yn", nullable = false)
    private Character visibleYn;

    @Size(max = 500)
    @Comment("설명")
    @Column(name = "description", length = 500)
    private String description;

    @NotNull
    @Comment("정렬순서")
    @ColumnDefault("0")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

}