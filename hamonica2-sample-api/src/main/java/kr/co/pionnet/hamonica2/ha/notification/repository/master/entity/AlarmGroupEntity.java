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
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Comment("경보 그룹")
@Entity
@Table(name = "alarm_group")
public class AlarmGroupEntity  extends RegisterModifierEntity {

    @Id
    @Size(max = 10)
    @Comment("경보 그룹아이디")
    @Column(name = "alarm_group_id", nullable = false, length = 10)
    private String alarmGroupId;

    @Size(max = 14)
    @NotNull
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", nullable = false, length = 14)
    private String workspaceId;

    @Size(max = 50)
    @NotNull
    @Comment("경보 그룹 명")
    @Column(name = "alarm_group_name", nullable = false, length = 50)
    private String alarmGroupName;

    @Size(max = 300)
    @Comment("경보 그룹 명 국제화")
    @Column(name = "alarm_group_name_i18n", length = 300)
    private String alarmGroupNameI18n;

    @Size(max = 10)
    @NotNull
    @Comment("부모 경보 그룹 아이디")
    @Column(name = "parent_alarm_group_id", nullable = false, length = 10)
    private String parentAlarmGroupId;

    @Size(max = 500)
    @Comment("설명")
    @Column(name = "description", length = 500)
    private String description;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

}