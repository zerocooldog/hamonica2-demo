package kr.co.pionnet.hamonica2.shared.notification.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationKakaoConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationKakaoConfigEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-06T14:14:13+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class NotificationKakaoConfigMapperImpl implements NotificationKakaoConfigMapper {

    @Override
    public NotificationKakaoConfigEntity toEntity(NotificationKakaoConfig model) {
        if ( model == null ) {
            return null;
        }

        NotificationKakaoConfigEntity notificationKakaoConfigEntity = new NotificationKakaoConfigEntity();

        notificationKakaoConfigEntity.setCreatorId( model.getCreatorId() );
        notificationKakaoConfigEntity.setCreatedAt( model.getCreatedAt() );
        notificationKakaoConfigEntity.setModifierId( model.getModifierId() );
        notificationKakaoConfigEntity.setModifiedAt( model.getModifiedAt() );
        notificationKakaoConfigEntity.setNotificationKakaoConfigId( model.getNotificationKakaoConfigId() );
        notificationKakaoConfigEntity.setWorkspaceId( model.getWorkspaceId() );
        notificationKakaoConfigEntity.setNotificationTypeId( model.getNotificationTypeId() );
        notificationKakaoConfigEntity.setSettingType( model.getSettingType() );
        notificationKakaoConfigEntity.setDescription( model.getDescription() );
        notificationKakaoConfigEntity.setOauthAccessToken( model.getOauthAccessToken() );
        notificationKakaoConfigEntity.setWebHookUrl( model.getWebHookUrl() );
        notificationKakaoConfigEntity.setReceiverUuids( model.getReceiverUuids() );
        notificationKakaoConfigEntity.setSortOrder( model.getSortOrder() );
        notificationKakaoConfigEntity.setUseYn( model.getUseYn() );

        setCreatorId( notificationKakaoConfigEntity );

        return notificationKakaoConfigEntity;
    }

    @Override
    public NotificationKakaoConfig toDto(NotificationKakaoConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationKakaoConfig notificationKakaoConfig = new NotificationKakaoConfig();

        notificationKakaoConfig.setCreatorId( entity.getCreatorId() );
        notificationKakaoConfig.setCreatedAt( entity.getCreatedAt() );
        notificationKakaoConfig.setModifierId( entity.getModifierId() );
        notificationKakaoConfig.setModifiedAt( entity.getModifiedAt() );
        notificationKakaoConfig.setNotificationKakaoConfigId( entity.getNotificationKakaoConfigId() );
        notificationKakaoConfig.setWorkspaceId( entity.getWorkspaceId() );
        notificationKakaoConfig.setNotificationTypeId( entity.getNotificationTypeId() );
        notificationKakaoConfig.setSettingType( entity.getSettingType() );
        notificationKakaoConfig.setDescription( entity.getDescription() );
        notificationKakaoConfig.setOauthAccessToken( entity.getOauthAccessToken() );
        notificationKakaoConfig.setWebHookUrl( entity.getWebHookUrl() );
        notificationKakaoConfig.setReceiverUuids( entity.getReceiverUuids() );
        notificationKakaoConfig.setSortOrder( entity.getSortOrder() );
        notificationKakaoConfig.setUseYn( entity.getUseYn() );

        return notificationKakaoConfig;
    }

    @Override
    public List<NotificationKakaoConfigEntity> toEntityList(List<NotificationKakaoConfig> model) {
        if ( model == null ) {
            return null;
        }

        List<NotificationKakaoConfigEntity> list = new ArrayList<NotificationKakaoConfigEntity>( model.size() );
        for ( NotificationKakaoConfig notificationKakaoConfig : model ) {
            list.add( toEntity( notificationKakaoConfig ) );
        }

        setCreatorId( list );

        return list;
    }

    @Override
    public List<NotificationKakaoConfig> toDtoList(List<NotificationKakaoConfigEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<NotificationKakaoConfig> list = new ArrayList<NotificationKakaoConfig>( entity.size() );
        for ( NotificationKakaoConfigEntity notificationKakaoConfigEntity : entity ) {
            list.add( toDto( notificationKakaoConfigEntity ) );
        }

        return list;
    }

    @Override
    public NotificationKakaoConfigEntity partialUpdate(NotificationKakaoConfig model, NotificationKakaoConfigEntity entity) {
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
        if ( model.getNotificationKakaoConfigId() != null ) {
            entity.setNotificationKakaoConfigId( model.getNotificationKakaoConfigId() );
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
        if ( model.getWebHookUrl() != null ) {
            entity.setWebHookUrl( model.getWebHookUrl() );
        }
        if ( model.getReceiverUuids() != null ) {
            entity.setReceiverUuids( model.getReceiverUuids() );
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
    public List<NotificationKakaoConfigEntity> partialUpdatse(List<NotificationKakaoConfig> model, List<NotificationKakaoConfigEntity> entity) {
        if ( model == null ) {
            return entity;
        }

        entity.clear();
        for ( NotificationKakaoConfig notificationKakaoConfig : model ) {
            entity.add( toEntity( notificationKakaoConfig ) );
        }

        setCreatorId( entity );

        return entity;
    }
}
