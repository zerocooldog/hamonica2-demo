package kr.co.pionnet.hamonica2.ha.system.controllers;

import kr.co.pionnet.hamonica2.shared.common.models.Code;
import kr.co.pionnet.hamonica2.shared.util.UtilCode;
import kr.co.pionnet.hamonica2.util.UtilText;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("api/code-groups")
@RestController

public class CodeGroupsController {


    @GetMapping
    public ResponseEntity<List<Code>> getCodes(@RequestParam String codeGroupId ){

        if(UtilText.isBlank(codeGroupId)){
            return ResponseEntity.ok(UtilCode.getAllCodes());
        }
        return ResponseEntity.ok(UtilCode.getCodeList(codeGroupId));

    }

}
