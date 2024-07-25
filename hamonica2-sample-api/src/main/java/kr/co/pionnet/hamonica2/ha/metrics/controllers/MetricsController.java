package kr.co.pionnet.hamonica2.ha.metrics.controllers;

import kr.co.pionnet.butterfly2.core.controller.BaseController;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupResponse;
import kr.co.pionnet.hamonica2.ha.metrics.services.MetricsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("api/metrics")
@RestController
public class MetricsController extends BaseController {


    private final MetricsService metricsService;

    public MetricsController(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @GetMapping("/metric-group/{metricGroupId}")
    public ResponseEntity<MetricGroupResponse> getMetricByMetricGroup(
            @PathVariable("metricGroupId") String metricGroupId
    ){
        return ResponseEntity.ok(metricsService.getMetricsByMetricGroupId(metricGroupId));
    }

}
