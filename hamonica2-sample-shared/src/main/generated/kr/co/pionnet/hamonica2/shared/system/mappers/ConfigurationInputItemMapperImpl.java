package kr.co.pionnet.hamonica2.shared.system.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.system.models.ConfigurationInputItem;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.ConfigurationInputItemEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T10:59:43+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class ConfigurationInputItemMapperImpl implements ConfigurationInputItemMapper {

    @Override
    public ConfigurationInputItemEntity toEntity(ConfigurationInputItem model) {
        if ( model == null ) {
            return null;
        }

        ConfigurationInputItemEntity configurationInputItemEntity = new ConfigurationInputItemEntity();

        setCreatorId( configurationInputItemEntity );

        return configurationInputItemEntity;
    }

    @Override
    public ConfigurationInputItem toDto(ConfigurationInputItemEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ConfigurationInputItem configurationInputItem = new ConfigurationInputItem();

        return configurationInputItem;
    }

    @Override
    public List<ConfigurationInputItemEntity> toEntityList(List<ConfigurationInputItem> model) {
        if ( model == null ) {
            return null;
        }

        List<ConfigurationInputItemEntity> list = new ArrayList<ConfigurationInputItemEntity>( model.size() );
        for ( ConfigurationInputItem configurationInputItem : model ) {
            list.add( toEntity( configurationInputItem ) );
        }

        setCreatorId( list );

        return list;
    }

    @Override
    public List<ConfigurationInputItem> toDtoList(List<ConfigurationInputItemEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<ConfigurationInputItem> list = new ArrayList<ConfigurationInputItem>( entity.size() );
        for ( ConfigurationInputItemEntity configurationInputItemEntity : entity ) {
            list.add( toDto( configurationInputItemEntity ) );
        }

        return list;
    }

    @Override
    public ConfigurationInputItemEntity partialUpdate(ConfigurationInputItem model, ConfigurationInputItemEntity entity) {
        if ( model == null ) {
            return entity;
        }

        setCreatorId( entity );

        return entity;
    }

    @Override
    public List<ConfigurationInputItemEntity> partialUpdatse(List<ConfigurationInputItem> model, List<ConfigurationInputItemEntity> entity) {
        if ( model == null ) {
            return entity;
        }

        entity.clear();
        for ( ConfigurationInputItem configurationInputItem : model ) {
            entity.add( toEntity( configurationInputItem ) );
        }

        setCreatorId( entity );

        return entity;
    }
}
