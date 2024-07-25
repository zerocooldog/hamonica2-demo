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
@Table(name = "configuration_input_item")
public class ConfigurationInputItemEntity  extends RegisterModifierEntity {

    @Id
    @Column(name = "configuration_items_no", nullable = false)
    private Long configurationItemNo;

    @Size(max = 300)
    @NotNull
    @Comment("설정 아이디")
    @Column(name = "configuration_id", nullable = false, length = 300)
    private String configurationId;

    @Size(max = 50)
    @NotNull
    @Comment("항목 값(Key)")
    @Column(name = "item_key", nullable = false, length = 50)
    private String itemKey;

    @Size(max = 50)
    @NotNull
    @Comment("항목 명")
    @Column(name = "item_name", nullable = false, length = 50)
    private String itemName;

    @Size(max = 300)
    @Comment("항목 명 국제화")
    @Column(name = "item_name_i18n", length = 300)
    private String itemNameI18n;

    @Size(max = 100)
    @Comment("설명")
    @Column(name = "description", length = 100)
    private String description;

    @NotNull
    @Comment("정렬순서")
    @ColumnDefault("0")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;


}