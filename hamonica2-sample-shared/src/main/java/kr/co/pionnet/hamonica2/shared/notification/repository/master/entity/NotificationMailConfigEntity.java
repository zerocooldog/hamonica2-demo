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
@Comment("알림 메일")
@Entity
@Table(name = "notification_mail_config")
public class NotificationMailConfigEntity extends RegisterModifierEntity {

    @GenericGenerator(
            name = StringPrefixedIdGenerator.GENERATOR_NAME,
            strategy = StringPrefixedIdGenerator.STRATEGY_PACKAGE,
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.SEQUENCE_PARAM, value = SequenceName.NOTIFICATION_MAIL_CONFIG_NOTIFICATION_MAIL_CONFIG_ID),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.VALUE_PREFIX_PARAM, value = "NMC"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedIdGenerator.LPAD_LENGTH_PARAM, value = "7")
            })
    @GeneratedValue(generator = StringPrefixedIdGenerator.GENERATOR_NAME)
    @Id
    @Size(max = 10)
    @Comment("메일 ID")
    @Column(name = "notification_mail_config_id", nullable = false, length = 10)
    private String notificationMailConfigId;

    @Size(max = 14)
    @Comment("작업공간 아이디")
    @Column(name = "workspace_id", length = 14)
    private String workspaceId;

    @Size(max = 20)
    @Comment("알림 유형 아이디")
    @Column(name = "notification_type_id", length = 20)
    private String notificationTypeId;

    @Size(max = 20)
    @NotNull
    @Comment("설정 유형")
    @ColumnDefault("'ALL'")
    @Column(name = "setting_type", nullable = false, length = 20)
    private String settingType;

    @Size(max = 20)
    @Comment("메일서버명")
    @Column(name = "mail_server_name", length = 20)
    private String mailServerName;

    @Size(max = 40)
    @Comment("보낸 사람 주소")
    @Column(name = "sender_address", length = 40)
    private String senderAddress;

    @Size(max = 20)
    @Comment("보낸 사람 메일")
    @Column(name = "sender_name", length = 20)
    private String senderName;

    @Size(max = 10)
    @Comment("제목 접두어")
    @Column(name = "title_prefix", length = 10)
    private String titlePrefix;

    @Size(max = 100)
    @Comment("메일 서버 호스트")
    @Column(name = "mail_host", length = 100)
    private String mailHost;

    @Size(max = 5)
    @Comment("메일 서버 포트")
    @Column(name = "mail_port", length = 5)
    private String mailPort;

    @Size(max = 40)
    @Comment("메일 접속 계정")
    @Column(name = "mail_account", length = 40)
    private String mailAccount;

    @Size(max = 100)
    @Comment("메일 접속 비밀번호")
    @Column(name = "mail_password", length = 100)
    private String mailPassword;

    @Comment("TLS 사용 여부")
    @ColumnDefault("'N'")
    @Column(name = "tls_use_yn")
    private Character tlsUseYn;

    @NotNull
    @Comment("정렬순서")
    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

}