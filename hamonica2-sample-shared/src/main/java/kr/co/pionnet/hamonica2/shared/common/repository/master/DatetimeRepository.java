package kr.co.pionnet.hamonica2.shared.common.repository.master;

import jakarta.persistence.Query;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.JpaMasterRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.ZonedDateTime;

@Repository
public class DatetimeRepository extends JpaMasterRepository {

    /**
     * DB 현재 시간을 가져온다.
     *
     * @return Instant;
     */
    public ZonedDateTime getCurrentDBDatetime() {
        Query query = entityManager.createNativeQuery("SELECT now()", ZonedDateTime.class);
        return (ZonedDateTime) query.getSingleResult();
    }
}
