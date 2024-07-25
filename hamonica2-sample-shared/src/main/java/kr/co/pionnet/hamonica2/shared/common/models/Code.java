package kr.co.pionnet.hamonica2.shared.common.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.butterfly2.core.bean.RegisterModifierBean;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * DTO for {@link kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeEntity}
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Code extends RegisterModifierBean {

    @NotNull
    @Size(max = 6)
    private String codeGroupId;
    @NotNull
    @Size(max = 9)
    private String codeId;

    @Size(max = 30)
    private String codeName;
    @Size(max = 9)
    private String codeAddValue1;
    @Size(max = 9)
    private String codeAddValue2;
    @Size(max = 9)
    private String codeAddValue3;
    @Size(max = 100)
    private String description;
    @NotNull
    private Integer sortOrder;
    @NotNull
    private Character useYn;
    @NotNull
    private Character delYn;
    
    @NotNull
    private CodeGroup codeGroup;

}