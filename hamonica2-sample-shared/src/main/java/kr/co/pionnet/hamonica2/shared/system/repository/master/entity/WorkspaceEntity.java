package kr.co.pionnet.hamonica2.shared.system.repository.master.entity;

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
@Table(name = "workspace")
public class WorkspaceEntity  extends RegisterModifierEntity {

    @Id
    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", nullable = false, length = 14)
    private String workspaceId;

    @Size(max = 40)
    @Comment("작업공간 명")
    @Column(name = "workspace_name", length = 40)
    private String workspaceName;

    @Size(max = 14)
    @Comment("소유자 아이디")
    @Column(name = "ower_id", length = 14)
    private String owerId;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

}