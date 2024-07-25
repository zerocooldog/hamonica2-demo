package kr.co.pionnet.hamonica2.shared.common.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@IdClass(CodeId.class)
@Comment("공통코드")
@Entity
@Table(name = "code")
public class CodeEntity extends RegisterModifierEntity {
    @Id
    @Comment("코드그룹")
    @Column(name = "code_group_id", nullable = false, length = 6)
    private String codeGroupId;

    @Id
    @Comment("코드")
    @Column(name = "code_id", nullable = false, length = 9)
    private String codeId;

    @Size(max = 30)
    @Comment("코드명")
    @Column(name = "code_name", length = 30)
    private String codeName;

    @Size(max = 9)
    @Comment("추가값1")
    @Column(name = "code_add_value1", length = 9)
    private String codeAddValue1;

    @Size(max = 9)
    @Comment("추가값2")
    @Column(name = "code_add_value2", length = 9)
    private String codeAddValue2;

    @Size(max = 9)
    @Comment("추가값3")
    @Column(name = "code_add_value3", length = 9)
    private String codeAddValue3;

    @Size(max = 100)
    @Comment("설명")
    @Column(name = "description", length = 100)
    private String description;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "code_group_id", referencedColumnName = "code_group_id", insertable = false, updatable = false)
    private CodeGroupEntity codeGroup;
}