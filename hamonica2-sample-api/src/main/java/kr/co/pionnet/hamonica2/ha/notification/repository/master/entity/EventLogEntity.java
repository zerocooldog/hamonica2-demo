package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.constant.SequenceName;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisteredAtEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "event_log")
public class EventLogEntity extends RegisteredAtEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SequenceName.EVENT_LOG_EVENT_LOG_NO_SEQ)
    @Comment("이벤트 로그 번호")
    @Column(name = "event_log_no", nullable = false)
    private Long id;

    @Comment("이벤트 로그")
    @Column(name = "event_log", length = Integer.MAX_VALUE)
    private String eventLog;

    @NotNull
    @Comment("작업공간 이벤트 번호")
    @Column(name = "workspace_event_no", nullable = false)
    private Long workspaceEventNo;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Size(max = 20)
    @NotNull
    @Comment("등록자")
    @Column(name = "creator_id", nullable = false, length = 20)
    private String creatorId;

}