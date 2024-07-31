package kr.co.pionnet.hamonica2.shared.notification.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationEmailConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationMailConfigEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-31T11:13:57+0900",
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

        setCreatorId( notificationMailConfigEntity );

        return notificationMailConfigEntity;
    }

    @Override
    public NotificationEmailConfig toDto(NotificationMailConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationEmailConfig notificationEmailConfig = new NotificationEmailConfig();

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
