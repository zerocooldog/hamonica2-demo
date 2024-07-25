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
@Comment("경보 로그")
@Entity
@Table(name = "alarm_log")
public class AlarmLogEntity extends RegisteredAtEntity {

    @Id
    @Comment("경보로그번호")
    @Column(name = "alarm_log_no", nullable = false)
    private Long alarm_log_no;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Comment("경보 번호")
    @Column(name = "alarm_no")
    private Integer alarmNo;

    @Comment("경보 내용")
    @Column(name = "alarm_log", length = Integer.MAX_VALUE)
    private String alarmLog;

    @Comment("알림로그번호")
    @Column(name = "notification_log_no")
    private Long notificationLogNo;

}