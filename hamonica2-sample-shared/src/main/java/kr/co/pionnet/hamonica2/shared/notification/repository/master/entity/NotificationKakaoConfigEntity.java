package kr.co.pionnet.hamonica2.shared.notification.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.constant.SequenceName;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.identifier.StringPrefixedIdGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@Comment("알림 KAKAO 설정")
@Entity
@Table(name = "notification_kakao_config")
public class NotificationKakaoConfigEntity extends RegisterModifierEntity {

    @GenericGenerator(
            name = StringPrefixedIdGenerator.GENERATOR_NAME,
            strategy = StringPrefixedIdGenerator.STRATEGY_PACKAGE,
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.SEQUENCE_PARAM, value = SequenceName.NOTIFICATION_KAKAO_CONFIG_NOTIFICATION_KAKAO_CONFIG_ID),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.VALUE_PREFIX_PARAM, value = "NKC"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.LPAD_LENGTH_PARAM, value = "7")
            })
    @GeneratedValue(generator = StringPrefixedIdGenerator.GENERATOR_NAME)
    @Id
    @Size(max = 10)
    @Comment("알림 유형 설정 아이디")
    @Column(name = "notification_kakao_config_id", nullable = false, length = 10)
    private String notificationKakaoConfigId;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Size(max = 20)
    @NotNull
    @Comment("알림 유형 아이디")
    @Column(name = "notification_type_id", nullable = false, length = 20)
    private String notificationTypeId;

    @Size(max = 20)
    @NotNull
    @Comment("설정 유형")
    @ColumnDefault("'ALL'")
    @Column(name = "setting_type", nullable = false, length = 20)
    private String settingType;

    @Size(max = 100)
    @Comment("설명")
    @Column(name = "description", length = 100)
    private String description;

    @Size(max = 500)
    @Comment("엑세스토큰")
    @Column(name = "oauth_access_token", length = 500)
    private String oauthAccessToken;

    @Size(max = 500)
    @Comment("내용 전달 주소")
    @Column(name = "web_hook_url", length = 500)
    private String webHookUrl;

    @Size(max = 200)
    @Comment("수신자 UUIDS")
    @Column(name = "receiver_uuids", length = 200)
    private String receiverUuids;

    @NotNull
    @Comment("정렬순서")
    @ColumnDefault("0")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @NotNull
    @Comment("사용 유무")
    @ColumnDefault("'Y'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

}