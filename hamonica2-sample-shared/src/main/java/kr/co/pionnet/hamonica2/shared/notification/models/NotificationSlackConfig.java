package kr.co.pionnet.hamonica2.shared.notification.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationSlackConfigEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link NotificationSlackConfigEntity}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationSlackConfig implements Serializable {
    @NotNull
    @Size(max = 20)
    private String creatorId;
    @NotNull
    private Instant createdAt;
    @Size(max = 20)
    private String modifierId;
    private Instant modifiedAt;
    @Size(max = 10)
    private String notificationSlackConfigId;
    @Size(max = 14)
    private String workspaceId;
    @NotNull
    @Size(max = 20)
    private String notificationTypeId;
    @NotNull
    @Size(max = 20)
    private String settingType;
    @Size(max = 100)
    private String description;
    @Size(max = 500)
    private String oauthAccessToken;
    @Size(max = 500)
    private String botUserAccessToken;
    @Size(max = 200)
    private String channelIds;
    @NotNull
    private Integer sortOrder;
    @NotNull
    private Character useYn;
}