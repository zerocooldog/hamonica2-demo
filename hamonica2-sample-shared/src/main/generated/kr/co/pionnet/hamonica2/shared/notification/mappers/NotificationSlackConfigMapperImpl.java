package kr.co.pionnet.hamonica2.shared.notification.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationSlackConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationSlackConfigEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-25T13:30:56+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class NotificationSlackConfigMapperImpl implements NotificationSlackConfigMapper {

    @Override
    public NotificationSlackConfigEntity toEntity(NotificationSlackConfig model) {
        if ( model == null ) {
            return null;
        }

        NotificationSlackConfigEntity notificationSlackConfigEntity = new NotificationSlackConfigEntity();

        notificationSlackConfigEntity.setCreatorId( model.getCreatorId() );
        notificationSlackConfigEntity.setCreatedAt( model.getCreatedAt() );
        notificationSlackConfigEntity.setModifierId( model.getModifierId() );
        notificationSlackConfigEntity.setModifiedAt( model.getModifiedAt() );
        notificationSlackConfigEntity.setNotificationSlackConfigId( model.getNotificationSlackConfigId() );
        notificationSlackConfigEntity.setWorkspaceId( model.getWorkspaceId() );
        notificationSlackConfigEntity.setNotificationTypeId( model.getNotificationTypeId() );
        notificationSlackConfigEntity.setSettingType( model.getSettingType() );
        notificationSlackConfigEntity.setDescription( model.getDescription() );
        notificationSlackConfigEntity.setOauthAccessToken( model.getOauthAccessToken() );
        notificationSlackConfigEntity.setBotUserAccessToken( model.getBotUserAccessToken() );
        notificationSlackConfigEntity.setChannelIds( model.getChannelIds() );
        notificationSlackConfigEntity.setSortOrder( model.getSortOrder() );
        notificationSlackConfigEntity.setUseYn( model.getUseYn() );

        setCreatorId( notificationSlackConfigEntity );

        return notificationSlackConfigEntity;
    }

    @Override
    public NotificationSlackConfig toDto(NotificationSlackConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationSlackConfig notificationSlackConfig = new NotificationSlackConfig();

        notificationSlackConfig.setCreatorId( entity.getCreatorId() );
        notificationSlackConfig.setCreatedAt( entity.getCreatedAt() );
        notificationSlackConfig.setModifierId( entity.getModifierId() );
        notificationSlackConfig.setModifiedAt( entity.getModifiedAt() );
        notificationSlackConfig.setNotificationSlackConfigId( entity.getNotificationSlackConfigId() );
        notificationSlackConfig.setWorkspaceId( entity.getWorkspaceId() );
        notificationSlackConfig.setNotificationTypeId( entity.getNotificationTypeId() );
        notificationSlackConfig.setSettingType( entity.getSettingType() );
        notificationSlackConfig.setDescription( entity.getDescription() );
        notificationSlackConfig.setOauthAccessToken( entity.getOauthAccessToken() );
        notificationSlackConfig.setBotUserAccessToken( entity.getBotUserAccessToken() );
        notificationSlackConfig.setChannelIds( entity.getChannelIds() );
        notificationSlackConfig.setSortOrder( entity.getSortOrder() );
        notificationSlackConfig.setUseYn( entity.getUseYn() );

        return notificationSlackConfig;
    }

    @Override
    public List<NotificationSlackConfigEntity> toEntityList(List<NotificationSlackConfig> model) {
        if ( model == null ) {
            return null;
        }

        List<NotificationSlackConfigEntity> list = new ArrayList<NotificationSlackConfigEntity>( model.size() );
        for ( NotificationSlackConfig notificationSlackConfig : model ) {
            list.add( toEntity( notificationSlackConfig ) );
        }

        setCreatorId( list );

        return list;
    }

    @Override
    public List<NotificationSlackConfig> toDtoList(List<NotificationSlackConfigEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<NotificationSlackConfig> list = new ArrayList<NotificationSlackConfig>( entity.size() );
        for ( NotificationSlackConfigEntity notificationSlackConfigEntity : entity ) {
            list.add( toDto( notificationSlackConfigEntity ) );
        }

        return list;
    }

    @Override
    public NotificationSlackConfigEntity partialUpdate(NotificationSlackConfig model, NotificationSlackConfigEntity entity) {
        if ( model == null ) {
            return entity;
        }

        if ( model.getCreatorId() != null ) {
            entity.setCreatorId( model.getCreatorId() );
        }
        if ( model.getCreatedAt() != null ) {
            entity.setCreatedAt( model.getCreatedAt() );
        }
        if ( model.getModifierId() != null ) {
            entity.setModifierId( model.getModifierId() );
        }
        if ( model.getModifiedAt() != null ) {
            entity.setModifiedAt( model.getModifiedAt() );
        }
        if ( model.getNotificationSlackConfigId() != null ) {
            entity.setNotificationSlackConfigId( model.getNotificationSlackConfigId() );
        }
        if ( model.getWorkspaceId() != null ) {
            entity.setWorkspaceId( model.getWorkspaceId() );
        }
        if ( model.getNotificationTypeId() != null ) {
            entity.setNotificationTypeId( model.getNotificationTypeId() );
        }
        if ( model.getSettingType() != null ) {
            entity.setSettingType( model.getSettingType() );
        }
        if ( model.getDescription() != null ) {
            entity.setDescription( model.getDescription() );
        }
        if ( model.getOauthAccessToken() != null ) {
            entity.setOauthAccessToken( model.getOauthAccessToken() );
        }
        if ( model.getBotUserAccessToken() != null ) {
            entity.setBotUserAccessToken( model.getBotUserAccessToken() );
        }
        if ( model.getChannelIds() != null ) {
            entity.setChannelIds( model.getChannelIds() );
        }
        if ( model.getSortOrder() != null ) {
            entity.setSortOrder( model.getSortOrder() );
        }
        if ( model.getUseYn() != null ) {
            entity.setUseYn( model.getUseYn() );
        }

        setCreatorId( entity );

        return entity;
    }

    @Override
    public List<NotificationSlackConfigEntity> partialUpdatse(List<NotificationSlackConfig> model, List<NotificationSlackConfigEntity> entity) {
        if ( model == null ) {
            return entity;
        }

        entity.clear();
        for ( NotificationSlackConfig notificationSlackConfig : model ) {
            entity.add( toEntity( notificationSlackConfig ) );
        }

        setCreatorId( entity );

        return entity;
    }
}
