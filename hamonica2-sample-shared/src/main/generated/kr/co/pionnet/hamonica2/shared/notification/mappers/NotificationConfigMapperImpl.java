package kr.co.pionnet.hamonica2.shared.notification.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationConfig;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationKakaoConfig;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationSlackConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationConfigEntities;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationKakaoConfigEntity;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationSlackConfigEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-25T13:30:55+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class NotificationConfigMapperImpl implements NotificationConfigMapper {

    @Override
    public NotificationConfigEntities toEntity(NotificationConfig model) {
        if ( model == null ) {
            return null;
        }

        NotificationConfigEntities.NotificationConfigEntitiesBuilder notificationConfigEntities = NotificationConfigEntities.builder();

        notificationConfigEntities.notificationSlackConfigs( notificationSlackConfigListToNotificationSlackConfigEntityList( model.getNotificationSlackConfigs() ) );
        notificationConfigEntities.notificationKakaoConfigs( notificationKakaoConfigListToNotificationKakaoConfigEntityList( model.getNotificationKakaoConfigs() ) );

        return notificationConfigEntities.build();
    }

    @Override
    public NotificationConfig toDto(NotificationConfigEntities entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationConfig.NotificationConfigBuilder notificationConfig = NotificationConfig.builder();

        notificationConfig.notificationSlackConfigs( notificationSlackConfigEntityListToNotificationSlackConfigList( entity.getNotificationSlackConfigs() ) );
        notificationConfig.notificationKakaoConfigs( notificationKakaoConfigEntityListToNotificationKakaoConfigList( entity.getNotificationKakaoConfigs() ) );

        return notificationConfig.build();
    }

    @Override
    public List<NotificationConfigEntities> toEntityList(List<NotificationConfig> model) {
        if ( model == null ) {
            return null;
        }

        List<NotificationConfigEntities> list = new ArrayList<NotificationConfigEntities>( model.size() );
        for ( NotificationConfig notificationConfig : model ) {
            list.add( toEntity( notificationConfig ) );
        }

        setCreatorId( list );

        return list;
    }

    @Override
    public List<NotificationConfig> toDtoList(List<NotificationConfigEntities> entity) {
        if ( entity == null ) {
            return null;
        }

        List<NotificationConfig> list = new ArrayList<NotificationConfig>( entity.size() );
        for ( NotificationConfigEntities notificationConfigEntities : entity ) {
            list.add( toDto( notificationConfigEntities ) );
        }

        return list;
    }

    @Override
    public NotificationConfigEntities partialUpdate(NotificationConfig model, NotificationConfigEntities entity) {
        if ( model == null ) {
            return entity;
        }

        if ( entity.getNotificationSlackConfigs() != null ) {
            List<NotificationSlackConfigEntity> list = notificationSlackConfigListToNotificationSlackConfigEntityList( model.getNotificationSlackConfigs() );
            if ( list != null ) {
                entity.getNotificationSlackConfigs().clear();
                entity.getNotificationSlackConfigs().addAll( list );
            }
        }
        else {
            List<NotificationSlackConfigEntity> list = notificationSlackConfigListToNotificationSlackConfigEntityList( model.getNotificationSlackConfigs() );
            if ( list != null ) {
                entity.setNotificationSlackConfigs( list );
            }
        }
        if ( entity.getNotificationKakaoConfigs() != null ) {
            List<NotificationKakaoConfigEntity> list1 = notificationKakaoConfigListToNotificationKakaoConfigEntityList( model.getNotificationKakaoConfigs() );
            if ( list1 != null ) {
                entity.getNotificationKakaoConfigs().clear();
                entity.getNotificationKakaoConfigs().addAll( list1 );
            }
        }
        else {
            List<NotificationKakaoConfigEntity> list1 = notificationKakaoConfigListToNotificationKakaoConfigEntityList( model.getNotificationKakaoConfigs() );
            if ( list1 != null ) {
                entity.setNotificationKakaoConfigs( list1 );
            }
        }

        setCreatorId( entity );

        return entity;
    }

    @Override
    public List<NotificationConfigEntities> partialUpdatse(List<NotificationConfig> model, List<NotificationConfigEntities> entity) {
        if ( model == null ) {
            return entity;
        }

        entity.clear();
        for ( NotificationConfig notificationConfig : model ) {
            entity.add( toEntity( notificationConfig ) );
        }

        setCreatorId( entity );

        return entity;
    }

    protected NotificationSlackConfigEntity notificationSlackConfigToNotificationSlackConfigEntity(NotificationSlackConfig notificationSlackConfig) {
        if ( notificationSlackConfig == null ) {
            return null;
        }

        NotificationSlackConfigEntity notificationSlackConfigEntity = new NotificationSlackConfigEntity();

        notificationSlackConfigEntity.setCreatorId( notificationSlackConfig.getCreatorId() );
        notificationSlackConfigEntity.setCreatedAt( notificationSlackConfig.getCreatedAt() );
        notificationSlackConfigEntity.setModifierId( notificationSlackConfig.getModifierId() );
        notificationSlackConfigEntity.setModifiedAt( notificationSlackConfig.getModifiedAt() );
        notificationSlackConfigEntity.setNotificationSlackConfigId( notificationSlackConfig.getNotificationSlackConfigId() );
        notificationSlackConfigEntity.setWorkspaceId( notificationSlackConfig.getWorkspaceId() );
        notificationSlackConfigEntity.setNotificationTypeId( notificationSlackConfig.getNotificationTypeId() );
        notificationSlackConfigEntity.setSettingType( notificationSlackConfig.getSettingType() );
        notificationSlackConfigEntity.setDescription( notificationSlackConfig.getDescription() );
        notificationSlackConfigEntity.setOauthAccessToken( notificationSlackConfig.getOauthAccessToken() );
        notificationSlackConfigEntity.setBotUserAccessToken( notificationSlackConfig.getBotUserAccessToken() );
        notificationSlackConfigEntity.setChannelIds( notificationSlackConfig.getChannelIds() );
        notificationSlackConfigEntity.setSortOrder( notificationSlackConfig.getSortOrder() );
        notificationSlackConfigEntity.setUseYn( notificationSlackConfig.getUseYn() );

        return notificationSlackConfigEntity;
    }

    protected List<NotificationSlackConfigEntity> notificationSlackConfigListToNotificationSlackConfigEntityList(List<NotificationSlackConfig> list) {
        if ( list == null ) {
            return null;
        }

        List<NotificationSlackConfigEntity> list1 = new ArrayList<NotificationSlackConfigEntity>( list.size() );
        for ( NotificationSlackConfig notificationSlackConfig : list ) {
            list1.add( notificationSlackConfigToNotificationSlackConfigEntity( notificationSlackConfig ) );
        }

        return list1;
    }

    protected NotificationKakaoConfigEntity notificationKakaoConfigToNotificationKakaoConfigEntity(NotificationKakaoConfig notificationKakaoConfig) {
        if ( notificationKakaoConfig == null ) {
            return null;
        }

        NotificationKakaoConfigEntity notificationKakaoConfigEntity = new NotificationKakaoConfigEntity();

        notificationKakaoConfigEntity.setCreatorId( notificationKakaoConfig.getCreatorId() );
        notificationKakaoConfigEntity.setCreatedAt( notificationKakaoConfig.getCreatedAt() );
        notificationKakaoConfigEntity.setModifierId( notificationKakaoConfig.getModifierId() );
        notificationKakaoConfigEntity.setModifiedAt( notificationKakaoConfig.getModifiedAt() );
        notificationKakaoConfigEntity.setNotificationKakaoConfigId( notificationKakaoConfig.getNotificationKakaoConfigId() );
        notificationKakaoConfigEntity.setWorkspaceId( notificationKakaoConfig.getWorkspaceId() );
        notificationKakaoConfigEntity.setNotificationTypeId( notificationKakaoConfig.getNotificationTypeId() );
        notificationKakaoConfigEntity.setSettingType( notificationKakaoConfig.getSettingType() );
        notificationKakaoConfigEntity.setDescription( notificationKakaoConfig.getDescription() );
        notificationKakaoConfigEntity.setOauthAccessToken( notificationKakaoConfig.getOauthAccessToken() );
        notificationKakaoConfigEntity.setWebHookUrl( notificationKakaoConfig.getWebHookUrl() );
        notificationKakaoConfigEntity.setReceiverUuids( notificationKakaoConfig.getReceiverUuids() );
        notificationKakaoConfigEntity.setSortOrder( notificationKakaoConfig.getSortOrder() );
        notificationKakaoConfigEntity.setUseYn( notificationKakaoConfig.getUseYn() );

        return notificationKakaoConfigEntity;
    }

    protected List<NotificationKakaoConfigEntity> notificationKakaoConfigListToNotificationKakaoConfigEntityList(List<NotificationKakaoConfig> list) {
        if ( list == null ) {
            return null;
        }

        List<NotificationKakaoConfigEntity> list1 = new ArrayList<NotificationKakaoConfigEntity>( list.size() );
        for ( NotificationKakaoConfig notificationKakaoConfig : list ) {
            list1.add( notificationKakaoConfigToNotificationKakaoConfigEntity( notificationKakaoConfig ) );
        }

        return list1;
    }

    protected NotificationSlackConfig notificationSlackConfigEntityToNotificationSlackConfig(NotificationSlackConfigEntity notificationSlackConfigEntity) {
        if ( notificationSlackConfigEntity == null ) {
            return null;
        }

        NotificationSlackConfig notificationSlackConfig = new NotificationSlackConfig();

        notificationSlackConfig.setCreatorId( notificationSlackConfigEntity.getCreatorId() );
        notificationSlackConfig.setCreatedAt( notificationSlackConfigEntity.getCreatedAt() );
        notificationSlackConfig.setModifierId( notificationSlackConfigEntity.getModifierId() );
        notificationSlackConfig.setModifiedAt( notificationSlackConfigEntity.getModifiedAt() );
        notificationSlackConfig.setNotificationSlackConfigId( notificationSlackConfigEntity.getNotificationSlackConfigId() );
        notificationSlackConfig.setWorkspaceId( notificationSlackConfigEntity.getWorkspaceId() );
        notificationSlackConfig.setNotificationTypeId( notificationSlackConfigEntity.getNotificationTypeId() );
        notificationSlackConfig.setSettingType( notificationSlackConfigEntity.getSettingType() );
        notificationSlackConfig.setDescription( notificationSlackConfigEntity.getDescription() );
        notificationSlackConfig.setOauthAccessToken( notificationSlackConfigEntity.getOauthAccessToken() );
        notificationSlackConfig.setBotUserAccessToken( notificationSlackConfigEntity.getBotUserAccessToken() );
        notificationSlackConfig.setChannelIds( notificationSlackConfigEntity.getChannelIds() );
        notificationSlackConfig.setSortOrder( notificationSlackConfigEntity.getSortOrder() );
        notificationSlackConfig.setUseYn( notificationSlackConfigEntity.getUseYn() );

        return notificationSlackConfig;
    }

    protected List<NotificationSlackConfig> notificationSlackConfigEntityListToNotificationSlackConfigList(List<NotificationSlackConfigEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<NotificationSlackConfig> list1 = new ArrayList<NotificationSlackConfig>( list.size() );
        for ( NotificationSlackConfigEntity notificationSlackConfigEntity : list ) {
            list1.add( notificationSlackConfigEntityToNotificationSlackConfig( notificationSlackConfigEntity ) );
        }

        return list1;
    }

    protected NotificationKakaoConfig notificationKakaoConfigEntityToNotificationKakaoConfig(NotificationKakaoConfigEntity notificationKakaoConfigEntity) {
        if ( notificationKakaoConfigEntity == null ) {
            return null;
        }

        NotificationKakaoConfig notificationKakaoConfig = new NotificationKakaoConfig();

        notificationKakaoConfig.setCreatorId( notificationKakaoConfigEntity.getCreatorId() );
        notificationKakaoConfig.setCreatedAt( notificationKakaoConfigEntity.getCreatedAt() );
        notificationKakaoConfig.setModifierId( notificationKakaoConfigEntity.getModifierId() );
        notificationKakaoConfig.setModifiedAt( notificationKakaoConfigEntity.getModifiedAt() );
        notificationKakaoConfig.setNotificationKakaoConfigId( notificationKakaoConfigEntity.getNotificationKakaoConfigId() );
        notificationKakaoConfig.setWorkspaceId( notificationKakaoConfigEntity.getWorkspaceId() );
        notificationKakaoConfig.setNotificationTypeId( notificationKakaoConfigEntity.getNotificationTypeId() );
        notificationKakaoConfig.setSettingType( notificationKakaoConfigEntity.getSettingType() );
        notificationKakaoConfig.setDescription( notificationKakaoConfigEntity.getDescription() );
        notificationKakaoConfig.setOauthAccessToken( notificationKakaoConfigEntity.getOauthAccessToken() );
        notificationKakaoConfig.setWebHookUrl( notificationKakaoConfigEntity.getWebHookUrl() );
        notificationKakaoConfig.setReceiverUuids( notificationKakaoConfigEntity.getReceiverUuids() );
        notificationKakaoConfig.setSortOrder( notificationKakaoConfigEntity.getSortOrder() );
        notificationKakaoConfig.setUseYn( notificationKakaoConfigEntity.getUseYn() );

        return notificationKakaoConfig;
    }

    protected List<NotificationKakaoConfig> notificationKakaoConfigEntityListToNotificationKakaoConfigList(List<NotificationKakaoConfigEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<NotificationKakaoConfig> list1 = new ArrayList<NotificationKakaoConfig>( list.size() );
        for ( NotificationKakaoConfigEntity notificationKakaoConfigEntity : list ) {
            list1.add( notificationKakaoConfigEntityToNotificationKakaoConfig( notificationKakaoConfigEntity ) );
        }

        return list1;
    }
}
