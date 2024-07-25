package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "notification_type")
public class NotificationTypeEntity extends RegisterModifierEntity {

    @Id
    @Size(max = 20)
    @Comment("알림 유형 아이디")
    @Column(name = "notification_type_id", nullable = false, length = 20)
    private String notificationTypeId;

    @Size(max = 30)
    @Comment("알림 유형 명")
    @Column(name = "notification_type_name", length = 30)
    private String notificationTypeName;

    @Size(max = 300)
    @Comment("설명")
    @Column(name = "description", length = 300)
    private String description;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

}