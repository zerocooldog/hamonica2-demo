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
@Entity
@Table(name = "recipient_group")
public class RecipientGroupEntity extends RegisterModifierEntity {

    @Id
    @Comment("수신자 그룹 번호")
    @Column(name = "recipient_group_no", nullable = false)
    private Integer id;

    @Size(max = 30)
    @NotNull
    @Comment("수신자 그룹 명")
    @Column(name = "recipient_group_name", nullable = false, length = 30)
    private String recipientGroupName;

    @Size(max = 14)
    @NotNull
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", nullable = false, length = 14)
    private String workspaceId;

}