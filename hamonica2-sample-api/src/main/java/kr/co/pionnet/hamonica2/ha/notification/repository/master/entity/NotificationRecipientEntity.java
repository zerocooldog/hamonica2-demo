package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notification_recipient")
public class NotificationRecipientEntity {
    @EmbeddedId
    private NotificationRecipientId id;

    //TODO [Reverse Engineering] generate columns from DB
}