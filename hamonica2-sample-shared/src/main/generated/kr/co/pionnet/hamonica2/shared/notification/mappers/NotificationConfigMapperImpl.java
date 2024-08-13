package kr.co.pionnet.hamonica2.shared.notification.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationConfigEntities;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T10:59:42+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class NotificationConfigMapperImpl implements NotificationConfigMapper {

    @Override
    public NotificationConfigEntities toEntity(NotificationConfig model) {
        if ( model == null ) {
            return null;
        }

        NotificationConfigEntities notificationConfigEntities = new NotificationConfigEntities();

        setCreatorId( notificationConfigEntities );

        return notificationConfigEntities;
    }

    @Override
    public NotificationConfig toDto(NotificationConfigEntities entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationConfig notificationConfig = new NotificationConfig();

        return notificationConfig;
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
}
