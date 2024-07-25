package kr.co.pionnet.hamonica2.ha.metrics.controllers;

import kr.co.pionnet.butterfly2.core.controller.BaseController;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricResponse;
import kr.co.pionnet.hamonica2.ha.metrics.services.MetricService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("api/metric")
@RestController
public class MetricController extends BaseController {

    @Autowired
    MetricService metricService;


    @GetMapping
    public ResponseEntity<MetricResponse> getMetricByMetricGroup(@RequestBody MetricRequest metricsParameter){
        return ResponseEntity.ok(metricService.getMetric(metricsParameter));
    }

}
