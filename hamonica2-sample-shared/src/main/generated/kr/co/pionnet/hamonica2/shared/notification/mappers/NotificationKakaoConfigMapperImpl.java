package kr.co.pionnet.hamonica2.shared.notification.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.notification.models.NotificationKakaoConfig;
import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationKakaoConfigEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-31T11:13:57+0900",
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

        setCreatorId( notificationKakaoConfigEntity );

        return notificationKakaoConfigEntity;
    }

    @Override
    public NotificationKakaoConfig toDto(NotificationKakaoConfigEntity entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationKakaoConfig notificationKakaoConfig = new NotificationKakaoConfig();

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
