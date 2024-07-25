package kr.co.pionnet.hamonica2.zconfiguration.jpa;

public interface EntityCharacterID {

    /**
     *    <pre>
     *      @PrePersist 어노테이션을 선언하여 아이디를 생성 한다.
     *
     *    예제 :
     *     @PrePersist
     *     public void generateId() {
     *         this.metricGroupId = "PREFIX_" + seq;
     *     }
     *    </pre>
     *
     */
    void generateId();
}
