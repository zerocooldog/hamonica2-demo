package kr.co.pionnet.hamonica2.shared.system.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.RoleEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * DTO for {@link RoleEntity}
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {
    @Size(max = 8)
    String roleId;
    @NotNull
    @Size(max = 20)
    String roleName;
    @Size(max = 300)
    String roleNameI18n;
    @NotNull
    @Size(max = 8)
    String roleType;
    @NotNull
    Character writeYn;
    @NotNull
    Character readYn;
    @NotNull
    Character useYn;
    @Size(max = 100)
    String description;
}