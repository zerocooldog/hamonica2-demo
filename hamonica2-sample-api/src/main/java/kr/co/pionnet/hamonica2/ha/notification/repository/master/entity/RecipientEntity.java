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
@Table(name = "recipient")
public class RecipientEntity extends RegisterModifierEntity {

    @Id
    @Comment("수신자번호")
    @Column(name = "recipient_no", nullable = false)
    private Integer id;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Size(max = 20)
    @NotNull
    @Comment("수신자명")
    @Column(name = "recipient_name", nullable = false, length = 20)
    private String recipientName;

    @Size(max = 12)
    @NotNull
    @Comment("휴대폰번호")
    @Column(name = "cell_no", nullable = false, length = 12)
    private String cellNo;

    @Size(max = 30)
    @NotNull
    @Comment("이메일")
    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Size(max = 20)
    @Comment("알림 유형 아이디")
    @Column(name = "notification_type_id", length = 20)
    private String notificationTypeId;

    @NotNull
    @Comment("사용 유무")
    @ColumnDefault("'Y'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

}