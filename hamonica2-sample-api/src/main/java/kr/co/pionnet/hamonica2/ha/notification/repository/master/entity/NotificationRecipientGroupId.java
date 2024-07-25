package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class NotificationRecipientGroupId implements Serializable {
    private static final long serialVersionUID = -7123835652277354815L;
    @Column(name = "notification_id", nullable = false, length = 10)
    private String notificationId;

    @Column(name = "recipient_group_no", nullable = false)
    private Integer recipientGroupNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        NotificationRecipientGroupId entity = (NotificationRecipientGroupId) o;
        return Objects.equals(this.notificationId, entity.notificationId) &&
                Objects.equals(this.recipientGroupNo, entity.recipientGroupNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, recipientGroupNo);
    }

}