package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.constant.SequenceName;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Comment("경보 그룹 연결")
@Entity
@Table(name = "alarm_group_mapping")
public class AlarmGroupMappingEntity  extends RegisterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SequenceName.ALARM_GROUP_MAPPING_ALARM_GROUP_MAPPING_NO)
    @Comment("경보 그룹 연결 번호")
    @Column(name = "alarm_group_mapping_no", nullable = false)
    private Long id;

    @Size(max = 10)
    @NotNull
    @Comment("경보 그룹아이디")
    @Column(name = "alarm_group_id", nullable = false, length = 10)
    private String alarmGroupId;

    @Comment("경보 번호")
    @Column(name = "alarm_no")
    private Integer alarmNo;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

}