package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.constant.SequenceName;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;


@Getter
@Setter
@Entity
@Table(name = "workspace_event")
public class WorkspaceEventEntity extends RegisterModifierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SequenceName.WORKSPACE_EVENT_WORKSPACE_EVENT_NO_SEQ)
    @Comment("작업공간 이벤트 번호")
    @Column(name = "workspace_event_no", nullable = false)
    private Long workspaceEventNo;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Size(max = 10)
    @Comment("이벤트 아이디")
    @Column(name = "event_id", length = 10)
    private String eventId;

    @Comment("이벤트 그룹 연결 번호")
    @Column(name = "event_group_mapping_no")
    private Long eventGroupMappingNo;

    @NotNull
    @Comment("경보 항목 노출 여부")
    @ColumnDefault("'Y'")
    @Column(name = "alarm_reference", nullable = false)
    private Character alarmReference;

    @NotNull
    @Comment("화면 노출 여부")
    @Column(name = "visible_yn", nullable = false)
    private Character visibleYn;

    @NotNull
    @Comment("사용여부")
    @ColumnDefault("'Y'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

    @Size(max = 500)
    @Comment("설명")
    @Column(name = "description", length = 500)
    private String description;

}