package kr.co.pionnet.hamonica2.ha.system.controllers;

import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.util.UtilCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("api/code")
@RestController

public class CodeController {

    @GetMapping
    public ResponseEntity<Code> getCode(@RequestParam String codeGroupId, @RequestParam String codeId ){

        return ResponseEntity.ok(UtilCode.getCode(codeGroupId, codeId));

    }
}
