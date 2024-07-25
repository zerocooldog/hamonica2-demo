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
@Entity
@Table(name = "workspace_alarm")
public class WorkspaceAlarmEntity extends RegisterModifierEntity {

    @Id
    @Size(max = 10)
    @Comment("작업공간 경보 아이디")
    @Column(name = "workspace_alarm_id", nullable = false, length = 10)
    private String workspaceAlarmId;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @NotNull
    @Comment("경보 번호")
    @Column(name = "alarm_no", nullable = false)
    private Integer alarmNo;

    @NotNull
    @Comment("화면 노출 여부")
    @ColumnDefault("'Y'")
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