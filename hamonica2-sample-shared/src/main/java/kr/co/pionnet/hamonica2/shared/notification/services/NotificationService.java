package kr.co.pionnet.hamonica2.shared.notification.services;

import kr.co.pionnet.hamonica2.plugin.notification.constant.NotificationType;
import kr.co.pionnet.hamonica2.shared.notification.mappers.NotificationConfigMapper;
import kr.co.pionnet.hamonica2.shared.notification.mappers.NotificationKakaoConfigMapper;
import kr.co.pionnet.hamonica2.shared.notification.mappers.NotificationMailConfigMapper;
import kr.co.pionnet.hamonica2.shared.notification.mappers.NotificationSlackConfigMapper;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.NotificationKakaoConfigRepository;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.NotificationMailConfigRepository;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.NotificationSlackConfigRepository;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationConfigEntities;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationKakaoConfigEntity;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationMailConfigEntity;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationSlackConfigEntity;
import kr.co.pionnet.hamonica2.shared.util.UtilObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Transactional(readOnly = true)
@Service
public class NotificationService {

    @Autowired
    private NotificationMailConfigRepository notificationMailConfigRepository;

    @Autowired
    private NotificationSlackConfigRepository notificationSlackConfigRepository;

    @Autowired
    private NotificationKakaoConfigRepository notificationKakaoConfigRepository;

    @Autowired
    private NotificationConfigMapper notificationConfigMapper;

    @Autowired
    private NotificationMailConfigMapper notificationMailConfigMapper;

    @Autowired
    private NotificationSlackConfigMapper notificationSlackConfigMapper;

    @Autowired
    private NotificationKakaoConfigMapper notificationKakaoConfigMapper;


    /**
     * 알림 유형별 설정 정보를 가져온다.
     *
     * @return NotificationConfig
     *
     * @since 2024.07.11
     * @author 장진철(zerocooldog@pionnet.co.kr)
     */
    public NotificationConfig getNotificationConfigs(){

        Sort sort = Sort.by(Sort.Order.asc("sortOrder"));

        return notificationConfigMapper.toDto(NotificationConfigEntities
                .builder()
                    .notificationMailConfigs(notificationMailConfigRepository.findAll(sort))
                    .notificationSlackConfigs(notificationSlackConfigRepository.findAll(sort))
                    .notificationKakaoConfigs(notificationKakaoConfigRepository.findAll(sort))
                .build());
    }

    /**
     * 알림 유형별 설정 정보를 가져온다.
     *
     * @param notificationType 알림 유형
     *
     * @return Object 각 유형별 config 객체로 반환.
     */
    public Object getNotificationConfigByNotificationType(String notificationType) {

        Sort sort = Sort.by(Sort.Order.asc("sortOrder"));

        return switch (NotificationType.valueOf(notificationType)) {
//            case BROWSER -> notificationMailConfigRepository.findAll(sort);
            case EMAIL -> notificationMailConfigMapper.toDtoList(notificationMailConfigRepository.findAll(sort));
//            case SMS -> notificationMailConfigRepository.findAll(sort);
            case SLACK -> notificationSlackConfigMapper.toDtoList(notificationSlackConfigRepository.findAll(sort));
            case KAKAO_WORK, KAKAO_TALK -> notificationKakaoConfigMapper.toDtoList(notificationKakaoConfigRepository.findAll(sort));
            default -> null;
        };
    }

    /**
     * 알림 유형별 설정 정보를 저장한다.
     *
     * @return NotificationConfig
     *
     * @since 2024.07.11
     * @author 장진철(zerocooldog@pionnet.co.kr)
     */
    @Transactional
    public NotificationConfig saveNotificationConfigs(NotificationConfig notificationConfig){

        List<NotificationMailConfigEntity> notificationMailConfigEntities = notificationMailConfigMapper.toEntityList(notificationConfig.getNotificationEmailConfigs());
        List<NotificationSlackConfigEntity> notificationSlackConfigEntities =  notificationSlackConfigMapper.toEntityList(notificationConfig.getNotificationSlackConfigs());
        List<NotificationKakaoConfigEntity> notificationKakaoConfigEntities =  notificationKakaoConfigMapper.toEntityList(notificationConfig.getNotificationKakaoConfigs());

        if(!UtilObject.isEmpty(notificationMailConfigEntities)){
            notificationMailConfigRepository.persistAll(notificationMailConfigEntities);
        }

        if(!UtilObject.isEmpty(notificationSlackConfigEntities)){
            notificationSlackConfigRepository.persistAll(notificationSlackConfigEntities);
        }

        if(!UtilObject.isEmpty(notificationKakaoConfigEntities)){
            notificationKakaoConfigRepository.persistAll(notificationKakaoConfigEntities);
        }

        return notificationConfigMapper.toDto(NotificationConfigEntities
                .builder()
                    .notificationMailConfigs(notificationMailConfigEntities)
                    .notificationSlackConfigs(notificationSlackConfigEntities)
                    .notificationKakaoConfigs(notificationKakaoConfigEntities)
                .build());
    }

    /**
     * 알림 유형별 설정 정보를 수정한다.
     *
     * @return NotificationConfig
     *
     * @since 2024.07.11
     * @author 장진철(zerocooldog@pionnet.co.kr)
     */
    @Transactional
    public NotificationConfig modifyNotificationConfigs(NotificationConfig notificationConfig){

        List<NotificationMailConfigEntity> notificationMailConfigEntities = notificationMailConfigMapper.toEntityList(notificationConfig.getNotificationEmailConfigs());
        List<NotificationSlackConfigEntity> notificationSlackConfigEntities =  notificationSlackConfigMapper.toEntityList(notificationConfig.getNotificationSlackConfigs());
        List<NotificationKakaoConfigEntity> notificationKakaoConfigEntities =  notificationKakaoConfigMapper.toEntityList(notificationConfig.getNotificationKakaoConfigs());

        if(!UtilObject.isEmpty(notificationMailConfigEntities)){
            notificationMailConfigRepository.mergeAll(notificationMailConfigEntities);
        }

        if(!UtilObject.isEmpty(notificationSlackConfigEntities)){
            notificationSlackConfigRepository.mergeAll(notificationSlackConfigEntities);
        }

        if(!UtilObject.isEmpty(notificationKakaoConfigEntities)){
            notificationKakaoConfigRepository.mergeAll(notificationKakaoConfigEntities);
        }

        return notificationConfigMapper.toDto(NotificationConfigEntities
                .builder()
                .notificationMailConfigs(notificationMailConfigEntities)
                .notificationSlackConfigs(notificationSlackConfigEntities)
                .notificationKakaoConfigs(notificationKakaoConfigEntities)
                .build());
    }

}
