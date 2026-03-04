package kr.co.pionnet.hamonica2.shared.common.services;

import kr.co.pionnet.hamonica2.shared.common.repository.master.DatetimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZonedDateTime;

@Service
public class DatetimeService {


    @Autowired
    DatetimeRepository datetimeRepository;

    /**
     * 현재 시간을 가져온다.
     * @return Instant
     */
    public ZonedDateTime getCurrentDBDatetime() {
        return datetimeRepository.getCurrentDBDatetime();
    }
}
