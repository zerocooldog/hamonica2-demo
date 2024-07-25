package kr.co.pionnet.hamonica2.constant;

public interface SequenceName {

    /***
     * AlarmEntity 시퀀스 채번 명
     * 테이블: alarm
     */
    String ALARM_ALARM_NO_SEQ = "alarm_alarm_no_seq";

    /***
     * AlarmGroupMappingEntity 시퀀스 채번 명
     * 테이블: alarm_group_mapping
     */
    String ALARM_GROUP_MAPPING_ALARM_GROUP_MAPPING_NO = "alarm_group_mapping_alarm_group_mapping_no_seq";

    /***
     * EventLogEntity 시퀀스 채번 명
     * 테이블: event_log
     */
    String EVENT_LOG_EVENT_LOG_NO_SEQ = "event_log_event_log_no_seq" ;

    /***
     * WorkspaceEventEntity 시퀀스 채번 명
     * 테이블: workspace_event
     */
    String WORKSPACE_EVENT_WORKSPACE_EVENT_NO_SEQ = "workspace_event_workspace_event_no_seq";

    /***
     * WorkspaceMemberEntity 시퀀스 채번 명
     * 테이블: workspace_member
     */
    String WORKSPACE_MEMBER_WORKSPACE_MEMBER_ID_SEQ = "workspace_member_workspace_member_id_seq";

    /***
     * MetricGroupEntity 시퀀스 채번 명
     * 테이블: metric_group
     */
    String METRIC_GROUP_METRIC_GROUP_ID_SEQ = "metric_group_metric_group_id_seq";

    /***
     * NotificationMailConfig 시퀀스 채번 명
     * 테이블: notification_mail_config
     */
    String NOTIFICATION_MAIL_CONFIG_NOTIFICATION_MAIL_CONFIG_ID = "notification_mail_config_notification_mail_config_id";

    /***
     * NotificationSlackConfig 시퀀스 채번 명
     * 테이블: notification_mail_config
     */
    String NOTIFICATION_SLACK_CONFIG_NOTIFICATION_SLACK_CONFIG_ID = "notification_slack_config_notification_slack_config_id";

    /***
     * NotificationKakaoConfig 시퀀스 채번 명
     * 테이블: notification_kakao_config
     */
    String NOTIFICATION_KAKAO_CONFIG_NOTIFICATION_KAKAO_CONFIG_ID = "notification_kakao_config_notification_kakao_config_id";

}