package kr.co.pionnet.hamonica2.shared.system.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.ConfigurationEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * DTO for {@link ConfigurationEntity}
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Configuration implements Serializable {
    @Size(max = 20)
    String creatorId;
    Instant createdAt;
    @Size(max = 20)
    String modifierId;
    Instant modifiedAt;
    @Size(max = 300)
    String configurationId;
    @Size(max = 300)
    String parentConfigurationId;
    @NotNull
    @Size(max = 50)
    String configurationName;
    @Size(max = 300)
    String configurationNameI18n;
    @Size(max = 50)
    String configurationValue;
    @Size(max = 50)
    String configurationCategory;
    @Size(max = 50)
    String configurationCategoryName;
    @Size(max = 300)
    String configurationCategoryNameI18n;
    @Size(max = 10)
    String inputType;
    @Size(max = 300)
    String configurationVisibleId;
    Character configurationVisibleValue;
    @NotNull
    Integer sortOrder;
    @NotNull
    Character useYn;

    List<ConfigurationInputItem> configurationInputItems;

    List<?> customConfigurationInputItems;
}