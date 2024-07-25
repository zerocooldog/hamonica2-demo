package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisteredAtEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "notification_message_queue")
public class NotificationMessageQueueEntity extends RegisteredAtEntity {

    @Id
    @Comment("알림 메세지 큐 번호")
    @Column(name = "notification_queue_no", nullable = false)
    private Long id;

    @Size(max = 20)
    @Comment("알림 유형 아이디")
    @Column(name = "notification_type_id", length = 20)
    private String notificationTypeId;

    @NotNull
    @Comment("알림 메세지")
    @Column(name = "notification_message", nullable = false, length = Integer.MAX_VALUE)
    private String notificationMessage;

    @Size(max = 10)
    @Comment("알림 아이디")
    @Column(name = "notification_id", length = 10)
    private String notificationId;

    @Comment("실패 횟수")
    @Column(name = "fail_count")
    private Short failCount;

}