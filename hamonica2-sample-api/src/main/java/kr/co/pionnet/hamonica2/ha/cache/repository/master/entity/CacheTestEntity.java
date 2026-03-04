
package kr.co.pionnet.hamonica2.ha.cache.repository.master.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;

import java.io.Serializable;

@Getter
@Setter
@Entity
@ToString
@Table(name = "cache_test")
public class CacheTestEntity implements Serializable {

    public CacheTestEntity() {
    }

    public CacheTestEntity(String testId, String testName) {
        this.testId = testId;
        this.testName = testName;
    }

    @Id
    @Size(max = 30)
    @Comment("테스트_id")
    @Column(name = "test_id", nullable = false, length = 30)
    private String testId;

    @Size(max = 30)
    @Comment("테스트_name")
    @Column(name = "test_name", length = 30)
    private String testName;
}
