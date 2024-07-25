package kr.co.pionnet.hamonica2.shared.common.repository.master.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@Comment("공통코드그룹")
@Entity
@Table(name = "code_group")
public class CodeGroupEntity extends RegisterModifierEntity {
    @Id
    @Size(max = 6)
    @Comment("코드그룹")
    @Column(name = "code_group_id", nullable = false, length = 6)
    private String codeGroupId;

    @Size(max = 30)
    @Comment("코드그룹명")
    @Column(name = "code_group_name", length = 30)
    private String codeGroupName;

    @Size(max = 100)
    @Comment("설명")
    @Column(name = "description", length = 100)
    private String description;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @NotNull
    @Comment("시스템코드여부")
    @ColumnDefault("'N'")
    @Column(name = "system_code_yn", nullable = false)
    private Character systemCodeYn;

    @NotNull
    @Comment("사용여부")
    @ColumnDefault("'N'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

    @NotNull
    @Comment("삭제여부")
    @ColumnDefault("'N'")
    @Column(name = "del_yn", nullable = false)
    private Character delYn;

}