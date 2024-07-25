package kr.co.pionnet.hamonica2.zconfiguration.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
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
public  class RegisteredAtEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @ColumnDefault("now()")
    @Column(name = "created_at", nullable = true, updatable = false , insertable = false)
    private Instant createdAt;


}
