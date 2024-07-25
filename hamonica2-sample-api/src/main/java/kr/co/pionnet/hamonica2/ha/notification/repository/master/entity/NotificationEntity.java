package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "notification")
public class NotificationEntity extends RegisterEntity {

    @Id
    @Size(max = 10)
    @Comment("알림 아이디")
    @Column(name = "notification_id", nullable = false, length = 10)
    private String notificationId;

    @Size(max = 20)
    @NotNull
    @Comment("알림 유형 아이디")
    @Column(name = "notification_type_id", nullable = false, length = 20)
    private String notificationTypeId;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Size(max = 10)
    @NotNull
    @Comment("작업공간 경보 아이디")
    @Column(name = "workspace_alarm_id", nullable = false, length = 10)
    private String workspaceAlarmId;

}