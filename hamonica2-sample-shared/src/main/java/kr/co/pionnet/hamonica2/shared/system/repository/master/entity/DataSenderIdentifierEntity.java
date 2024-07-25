package kr.co.pionnet.hamonica2.shared.system.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "data_sender_identifier")
public class DataSenderIdentifierEntity  extends RegisterModifierEntity {

    @Id
    @Size(max = 14)
    @Comment("전송자 아이디")
    @Column(name = "sender_id", nullable = false, length = 14)
    private String senderId;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Size(max = 40)
    @Comment("전송자 명")
    @Column(name = "sender_name", length = 40)
    private String senderName;

    @Size(max = 10)
    @NotNull
    @Comment("전송자 유형")
    @Column(name = "sender_type", nullable = false, length = 10)
    private String senderType;

}