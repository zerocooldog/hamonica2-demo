package kr.co.pionnet.hamonica2.shared.system.repository.master.entity;

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
@Entity
@Table(name = "role")
public class RoleEntity  extends RegisterModifierEntity {

    @Id
    @Size(max = 8)
    @Comment("역할아이디")
    @Column(name = "role_id", nullable = false, length = 8)
    private String roleId;

    @Size(max = 20)
    @NotNull
    @Comment("역할명")
    @Column(name = "role_name", nullable = false, length = 20)
    private String roleName;

    @Size(max = 300)
    @Comment("역할명 국제화")
    @Column(name = "role_name_i18n", length = 300)
    private String roleNameI18n;

    @Size(max = 8)
    @NotNull
    @Comment("역할 유형")
    @Column(name = "role_type", nullable = false, length = 8)
    private String roleType;

    @NotNull
    @Comment("쓰기권한여부")
    @ColumnDefault("'Y'")
    @Column(name = "write_yn", nullable = false)
    private Character writeYn;

    @NotNull
    @Comment("읽기권한여부")
    @ColumnDefault("'Y'")
    @Column(name = "read_yn", nullable = false)
    private Character readYn;

    @NotNull
    @Comment("사용여부")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

    @Size(max = 100)
    @Comment("설명")
    @Column(name = "description", length = 100)
    private String description;

}