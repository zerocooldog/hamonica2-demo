package kr.co.pionnet.hamonica2.ha.metrics.controllers;

import kr.co.pionnet.butterfly2.core.controller.BaseController;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupRequest;
import kr.co.pionnet.hamonica2.ha.metrics.models.MetricGroupResponse;
import kr.co.pionnet.hamonica2.ha.metrics.services.MetricGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("api/metric-group")
@RestController
public class MetricGroupController extends BaseController {


    @Autowired
    private MetricGroupService metricGroupService;


    @PostMapping
    public ResponseEntity<MetricGroupResponse> getMetricByMetricGroup(@RequestBody MetricGroupRequest metricGroupRequest) throws Exception {

        log.debug("############ call : {} ", metricGroupRequest);
        MetricGroupResponse  metricGroupResponse = metricGroupService.saveMetricGroup(metricGroupRequest);
        log.debug("############ metricGroupResponse : {} ", metricGroupResponse);


        return ResponseEntity.ok(metricGroupResponse);
    }

}
