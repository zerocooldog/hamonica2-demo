package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Comment;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class RecipientGroupRecipientId implements Serializable {

    @Serial
    private static final long serialVersionUID = -7179973591906284385L;

    @Comment("수신자 그룹 번호")
    @Column(name = "recipient_group_no", nullable = false)
    private Integer recipientGroupNo;

    @Comment("수신자번호")
    @Column(name = "recipient_no", nullable = false)
    private Integer recipientNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RecipientGroupRecipientId entity = (RecipientGroupRecipientId) o;
        return Objects.equals(this.recipientNo, entity.recipientNo) &&
                Objects.equals(this.recipientGroupNo, entity.recipientGroupNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipientNo, recipientGroupNo);
    }

}