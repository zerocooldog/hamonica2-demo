package kr.co.pionnet.hamonica2.ha.notification.controllers;

import kr.co.pionnet.butterfly2.core.controller.BaseController;
import kr.co.pionnet.hamonica2.plugin.Plugin;
import kr.co.pionnet.hamonica2.plugin.notification.base.NotificationMessage;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationConfig;
import kr.co.pionnet.hamonica2.shared.notification.services.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("api/notification")
@RestController
public class NotificationController extends BaseController {

    @Autowired
    NotificationService notificationService;

    @GetMapping("configs")
    public ResponseEntity<NotificationConfig> getNotificationConfig(){
        return ResponseEntity.ok(notificationService.getNotificationConfigs());
    }

    @GetMapping("config/{notificationType}")
    public ResponseEntity<?> getNotificationConfigByNotificationType(@PathVariable String notificationType ){
        return ResponseEntity.ok(notificationService.getNotificationConfigByNotificationType(notificationType));
    }


    @PostMapping("configs")
    public ResponseEntity<NotificationConfig> saveNotificationConfigs(@RequestBody NotificationConfig notificationConfig) throws Exception {
        return ResponseEntity.ok(notificationService.saveNotificationConfigs(notificationConfig));
    }

    @PatchMapping("configs")
    public ResponseEntity<NotificationConfig> modifyNotificationConfigs(@RequestBody NotificationConfig notificationConfig) throws Exception {
        return ResponseEntity.ok(notificationService.modifyNotificationConfigs(notificationConfig));
    }


    @PostMapping("message")
    public ResponseEntity<?> sendMessage(@RequestBody NotificationMessage message ){

        log.debug("########### 전송 중?");
        Plugin.NOTIFICATION.send(message);

        return ResponseEntity.ok(message);
    }


}
