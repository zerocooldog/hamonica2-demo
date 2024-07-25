package kr.co.pionnet.hamonica2.ha.system.controllers;

import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.util.UtilCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("api/code-group")
@RestController

public class CodeGroupController {

    @GetMapping
    public ResponseEntity<CodeGroup> getCodeGroup(@RequestParam String codeGroupId ){

        return ResponseEntity.ok(UtilCode.getCodeGrp(codeGroupId));

    }

}
