package kr.co.pionnet.hamonica2.shared.notification.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationSlackConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationSlackConfigEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-31T11:13:57+0900",
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

        setCreatorId( notificationSlackConfigEntity );

        return notificationSlackConfigEntity;
    }

    @Override
    public NotificationSlackConfig toDto(NotificationSlackConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationSlackConfig notificationSlackConfig = new NotificationSlackConfig();

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
