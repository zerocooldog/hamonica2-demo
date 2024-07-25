package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Entity
@Table(name = "event_group_mapping")
public class EventGroupMappingEntity extends RegisterEntity {


    @Id
    @Comment("이벤트 그룹 연결 번호")
    @Column(name = "event_group_mapping_no", nullable = false)
    private Long id;

    @Size(max = 10)
    @NotNull
    @Comment("이벤트 그룹아이디")
    @Column(name = "event_group_id", nullable = false, length = 10)
    private String eventGroupId;

    @Size(max = 10)
    @NotNull
    @Comment("이벤트 아이디")
    @Column(name = "event_id", nullable = false, length = 10)
    private String eventId;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

}