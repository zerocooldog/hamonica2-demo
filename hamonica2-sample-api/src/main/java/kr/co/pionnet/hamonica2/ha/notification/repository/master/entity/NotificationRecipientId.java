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
public class NotificationRecipientId implements Serializable {
    private static final long serialVersionUID = 4148134817184886425L;
    @Column(name = "recipient_no", nullable = false)
    private Integer recipientNo;

    @Column(name = "notification_id", nullable = false, length = 10)
    private String notificationId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        NotificationRecipientId entity = (NotificationRecipientId) o;
        return Objects.equals(this.recipientNo, entity.recipientNo) &&
                Objects.equals(this.notificationId, entity.notificationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipientNo, notificationId);
    }

}