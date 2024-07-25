package kr.co.pionnet.hamonica2.ha.external.controller;


import kr.co.pionnet.butterfly2.core.device.Device;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RequestMapping("api/external")
@RestController
public class AppMetricsController {

    @GetMapping("metrics/metric")
    public ResponseEntity<?> saveMetric(Device device){


        log.debug("########### device : {}", device.getDevicePlatform());
        log.debug("########### device mobile : {}", device.isMobile());
        log.debug("########### device tablet : {}", device.isTablet());
        log.debug("########### device desktop : {}", device.isNormal());
//        Metrics.builder().metricGroup()

        return null;
    }
}
