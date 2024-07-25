package kr.co.pionnet.hamonica2.ha.system.controllers;


import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.system.models.Configuration;
import kr.co.pionnet.hamonica2.shared.system.services.ConfigurationService;
import kr.co.pionnet.hamonica2.shared.util.UtilCode;
import kr.co.pionnet.hamonica2.util.UtilText;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("api/configurations")
@RestController
public class ConfigurationsController {

    @Autowired
    ConfigurationService configurationService;


    @GetMapping
    public ResponseEntity<List<Configuration>> getConfigurations(
            @RequestParam String configurationId,
            @RequestParam(required = false) String useYn
    ){


        List<Configuration> result =  null;

        if(!UtilText.isBlank(useYn)){
            result =  configurationService.findHierachyByConfigurationIdAndUseYn(configurationId, useYn);
        }else{
            result =  configurationService.findHierachyByConfigurationId(configurationId);
        }


        return ResponseEntity.ok(result);

    }

}
