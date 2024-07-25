package kr.co.pionnet.hamonica2.shared.common.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * DTO for {@link kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeGroupEntity}
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CodeGroup implements Serializable {
    @NotNull
    @Size(max = 20)
    private String creatorId;
    @NotNull
    private Instant createdAt;
    @Size(max = 20)
    private String modifierId;
    private Instant modifiedAt;
    @Size(max = 6)
    private String codeGroupId;
    @Size(max = 30)
    private String codeGroupName;
    @Size(max = 100)
    private String description;
    @NotNull
    private Integer sortOrder;
    @NotNull
    private Character systemCodeYn;
    @NotNull
    private Character useYn;
    @NotNull
    private Character delYn;

    List<Code> codes;
}