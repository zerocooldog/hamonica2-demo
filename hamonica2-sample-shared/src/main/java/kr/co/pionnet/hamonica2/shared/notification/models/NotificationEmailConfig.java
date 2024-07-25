package kr.co.pionnet.hamonica2.shared.notification.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationMailConfigEntity}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEmailConfig implements Serializable {
    @NotNull
    @Size(max = 20)
    private String creatorId;
    @NotNull
    private Instant createdAt;
    @Size(max = 20)
    private String modifierId;
    private Instant modifiedAt;
    @Size(max = 10)
    private String notificationMailConfigId;
    @Size(max = 14)
    private String workspaceId;
    @Size(max = 20)
    private String notificationTypeId;
    @NotNull
    @Size(max = 20)
    private String settingType;
    @Size(max = 20)
    private String mailServerName;
    @Size(max = 40)
    private String senderAddress;
    @Size(max = 20)
    private String senderName;
    @Size(max = 10)
    private String titlePrefix;
    @Size(max = 100)
    private String mailHost;
    @Size(max = 5)
    private String mailPort;
    @Size(max = 40)
    private String mailAccount;
    @Size(max = 100)
    private String mailPassword;
    private Character tlsUseYn;
    @NotNull
    private Integer sortOrder;
}