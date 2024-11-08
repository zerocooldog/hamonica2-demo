package kr.co.pionnet.hamonica2.shared.notification.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationEmailConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationMailConfigEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-06T14:14:13+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class NotificationMailConfigMapperImpl implements NotificationMailConfigMapper {

    @Override
    public NotificationMailConfigEntity toEntity(NotificationEmailConfig model) {
        if ( model == null ) {
            return null;
        }

        NotificationMailConfigEntity notificationMailConfigEntity = new NotificationMailConfigEntity();

        notificationMailConfigEntity.setCreatorId( model.getCreatorId() );
        notificationMailConfigEntity.setCreatedAt( model.getCreatedAt() );
        notificationMailConfigEntity.setModifierId( model.getModifierId() );
        notificationMailConfigEntity.setModifiedAt( model.getModifiedAt() );
        notificationMailConfigEntity.setNotificationMailConfigId( model.getNotificationMailConfigId() );
        notificationMailConfigEntity.setWorkspaceId( model.getWorkspaceId() );
        notificationMailConfigEntity.setNotificationTypeId( model.getNotificationTypeId() );
        notificationMailConfigEntity.setSettingType( model.getSettingType() );
        notificationMailConfigEntity.setMailServerName( model.getMailServerName() );
        notificationMailConfigEntity.setSenderAddress( model.getSenderAddress() );
        notificationMailConfigEntity.setSenderName( model.getSenderName() );
        notificationMailConfigEntity.setTitlePrefix( model.getTitlePrefix() );
        notificationMailConfigEntity.setMailHost( model.getMailHost() );
        notificationMailConfigEntity.setMailPort( model.getMailPort() );
        notificationMailConfigEntity.setMailAccount( model.getMailAccount() );
        notificationMailConfigEntity.setMailPassword( model.getMailPassword() );
        notificationMailConfigEntity.setTlsUseYn( model.getTlsUseYn() );
        notificationMailConfigEntity.setSortOrder( model.getSortOrder() );

        setCreatorId( notificationMailConfigEntity );

        return notificationMailConfigEntity;
    }

    @Override
    public NotificationEmailConfig toDto(NotificationMailConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationEmailConfig notificationEmailConfig = new NotificationEmailConfig();

        notificationEmailConfig.setCreatorId( entity.getCreatorId() );
        notificationEmailConfig.setCreatedAt( entity.getCreatedAt() );
        notificationEmailConfig.setModifierId( entity.getModifierId() );
        notificationEmailConfig.setModifiedAt( entity.getModifiedAt() );
        notificationEmailConfig.setNotificationMailConfigId( entity.getNotificationMailConfigId() );
        notificationEmailConfig.setWorkspaceId( entity.getWorkspaceId() );
        notificationEmailConfig.setNotificationTypeId( entity.getNotificationTypeId() );
        notificationEmailConfig.setSettingType( entity.getSettingType() );
        notificationEmailConfig.setMailServerName( entity.getMailServerName() );
        notificationEmailConfig.setSenderAddress( entity.getSenderAddress() );
        notificationEmailConfig.setSenderName( entity.getSenderName() );
        notificationEmailConfig.setTitlePrefix( entity.getTitlePrefix() );
        notificationEmailConfig.setMailHost( entity.getMailHost() );
        notificationEmailConfig.setMailPort( entity.getMailPort() );
        notificationEmailConfig.setMailAccount( entity.getMailAccount() );
        notificationEmailConfig.setMailPassword( entity.getMailPassword() );
        notificationEmailConfig.setTlsUseYn( entity.getTlsUseYn() );
        notificationEmailConfig.setSortOrder( entity.getSortOrder() );

        return notificationEmailConfig;
    }

    @Override
    public List<NotificationMailConfigEntity> toEntityList(List<NotificationEmailConfig> model) {
        if ( model == null ) {
            return null;
        }

        List<NotificationMailConfigEntity> list = new ArrayList<NotificationMailConfigEntity>( model.size() );
        for ( NotificationEmailConfig notificationEmailConfig : model ) {
            list.add( toEntity( notificationEmailConfig ) );
        }

        setCreatorId( list );

        return list;
    }

    @Override
    public List<NotificationEmailConfig> toDtoList(List<NotificationMailConfigEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<NotificationEmailConfig> list = new ArrayList<NotificationEmailConfig>( entity.size() );
        for ( NotificationMailConfigEntity notificationMailConfigEntity : entity ) {
            list.add( toDto( notificationMailConfigEntity ) );
        }

        return list;
    }

    @Override
    public NotificationMailConfigEntity partialUpdate(NotificationEmailConfig model, NotificationMailConfigEntity entity) {
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
        if ( model.getNotificationMailConfigId() != null ) {
            entity.setNotificationMailConfigId( model.getNotificationMailConfigId() );
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
        if ( model.getMailServerName() != null ) {
            entity.setMailServerName( model.getMailServerName() );
        }
        if ( model.getSenderAddress() != null ) {
            entity.setSenderAddress( model.getSenderAddress() );
        }
        if ( model.getSenderName() != null ) {
            entity.setSenderName( model.getSenderName() );
        }
        if ( model.getTitlePrefix() != null ) {
            entity.setTitlePrefix( model.getTitlePrefix() );
        }
        if ( model.getMailHost() != null ) {
            entity.setMailHost( model.getMailHost() );
        }
        if ( model.getMailPort() != null ) {
            entity.setMailPort( model.getMailPort() );
        }
        if ( model.getMailAccount() != null ) {
            entity.setMailAccount( model.getMailAccount() );
        }
        if ( model.getMailPassword() != null ) {
            entity.setMailPassword( model.getMailPassword() );
        }
        if ( model.getTlsUseYn() != null ) {
            entity.setTlsUseYn( model.getTlsUseYn() );
        }
        if ( model.getSortOrder() != null ) {
            entity.setSortOrder( model.getSortOrder() );
        }

        setCreatorId( entity );

        return entity;
    }

    @Override
    public List<NotificationMailConfigEntity> partialUpdatse(List<NotificationEmailConfig> model, List<NotificationMailConfigEntity> entity) {
        if ( model == null ) {
            return entity;
        }

        entity.clear();
        for ( NotificationEmailConfig notificationEmailConfig : model ) {
            entity.add( toEntity( notificationEmailConfig ) );
        }

        setCreatorId( entity );

        return entity;
    }
}
