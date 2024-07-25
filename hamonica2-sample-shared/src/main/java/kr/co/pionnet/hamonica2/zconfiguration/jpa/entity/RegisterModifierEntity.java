package kr.co.pionnet.hamonica2.zconfiguration.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Getter
@Setter
public class RegisterModifierEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(max = 20)
    @Column(name = "creator_id", nullable = false, length = 20)
    private String creatorId;

    @ColumnDefault("now()")
    @Column(name = "created_at", nullable = true, updatable = false , insertable = false)
    private Instant createdAt;

    @Size(max = 20)
    @Column(name = "modifier_id", length = 20)
    private String modifierId;

    @Column(name = "modified_at", updatable = true , insertable = false)
    private Instant modifiedAt;

}