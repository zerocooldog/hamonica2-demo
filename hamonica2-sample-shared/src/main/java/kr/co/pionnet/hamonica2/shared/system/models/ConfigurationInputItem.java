package kr.co.pionnet.hamonica2.shared.system.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link kr.co.pionnet.hamonica2.shared.system.repository.master.entity.ConfigurationInputItemEntity}
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ConfigurationInputItem implements Serializable {
    @Size(max = 20)
    String creatorId;
    Instant createdAt;
    @Size(max = 20)
    String modifierId;
    Instant modifiedAt;
    Long configurationItemNo;
    @NotNull
    @Size(max = 300)
    String configurationId;
    @NotNull
    @Size(max = 50)
    String itemKey;
    @NotNull
    @Size(max = 50)
    String itemName;
    @Size(max = 300)
    String itemNameI18n;
    @Size(max = 100)
    String description;
    @NotNull
    Integer sortOrder;
}