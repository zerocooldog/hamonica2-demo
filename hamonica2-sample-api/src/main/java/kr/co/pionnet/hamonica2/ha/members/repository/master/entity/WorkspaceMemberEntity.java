package kr.co.pionnet.hamonica2.ha.members.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.constant.SequenceName;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "workspace_member")
public class WorkspaceMemberEntity extends RegisterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SequenceName.WORKSPACE_MEMBER_WORKSPACE_MEMBER_ID_SEQ)
    @Comment("작업공간 참여자 아이디")
    @Column(name = "workspace_member_id", nullable = false)
    private Long workspaceMemberId;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Size(max = 14)
    @NotNull
    @Comment("회원아이디")
    @Column(name = "member_id", nullable = false, length = 14)
    private String memberId;

    @Size(max = 8)
    @NotNull
    @Comment("역할아이디")
    @Column(name = "role_id", nullable = false, length = 8)
    private String roleId;

}