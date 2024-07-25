package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisteredAtEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "notification_log")
public class NotificationLogEntity extends RegisteredAtEntity {

    @Id
    @Comment("알림로그번호")
    @Column(name = "notification_log_no", nullable = false)
    private Long id;

    @Size(max = 300)
    @Comment("알림 유형들")
    @Column(name = "notification_types", length = 300)
    private String notificationTypes;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

}