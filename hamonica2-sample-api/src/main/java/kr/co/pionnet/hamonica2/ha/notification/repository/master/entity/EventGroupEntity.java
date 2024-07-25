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
@Comment("이벤트 그룹")
@Entity
@Table(name = "event_group")
public class EventGroupEntity extends RegisterModifierEntity {

    @Id
    @Size(max = 10)
    @Comment("이벤트 그룹아이디")
    @Column(name = "event_group_id", nullable = false, length = 10)
    private String eventGroupId;

    @Size(max = 50)
    @NotNull
    @Comment("이벤트 그룹 명")
    @Column(name = "event_group_name", nullable = false, length = 50)
    private String eventGroupName;

    @Size(max = 300)
    @NotNull
    @Comment("이벤트 그룹 명 국제화")
    @Column(name = "event_group_name_i18n", nullable = false, length = 300)
    private String eventGroupNameI18n;

    @Size(max = 10)
    @NotNull
    @Comment("부모 이벤트 그룹 아이디")
    @Column(name = "parent_event_group_id", nullable = false, length = 10)
    private String parentEventGroupId;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

}