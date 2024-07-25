package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "recipient_group_recipient")
public class RecipientGroupRecipientEntity {

    @EmbeddedId
    private RecipientGroupRecipientId id;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

}