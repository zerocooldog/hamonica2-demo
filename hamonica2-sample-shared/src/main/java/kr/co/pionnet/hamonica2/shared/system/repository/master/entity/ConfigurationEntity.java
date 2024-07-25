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
@Table(name = "configuration")
public class ConfigurationEntity extends RegisterModifierEntity {


    @Id
    @Size(max = 300)
    @Column(name = "configuration_id", nullable = false, length = 300)
    private String configurationId;

    @Size(max = 300)
    @Column(name = "parent_configuration_id", length = 300)
    private String parentConfigurationId;

    @Size(max = 50)
    @NotNull
    @ColumnDefault("'Y'")
    @Column(name = "configuration_name", nullable = false, length = 50)
    private String configurationName;

    @Size(max = 300)
    @Column(name = "configuration_name_i18n", length = 300)
    private String configurationNameI18n;

    @Size(max = 50)
    @Column(name = "configuration_value", length = 50)
    private String configurationValue;

    @Size(max = 50)
    @Column(name = "configuration_category", length = 50)
    private String configurationCategory;

    @Size(max = 50)
    @Column(name = "configuration_category_name", length = 50)
    private String configurationCategoryName;

    @Size(max = 300)
    @Column(name = "configuration_category_name_i18n", length = 300)
    private String configurationCategoryNameI18n;

    @Size(max = 10)
    @Column(name = "input_type", length = 10)
    private String inputType;

    @Size(max = 300)
    @Column(name = "configuration_visible_id", length = 300)
    private String configurationVisibleId;

    @Column(name = "configuration_visible_value")
    private Character configurationVisibleValue;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @NotNull
    @ColumnDefault("'Y'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

}