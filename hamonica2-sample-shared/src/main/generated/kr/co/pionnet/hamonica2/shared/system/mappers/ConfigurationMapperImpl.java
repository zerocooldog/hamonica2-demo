package kr.co.pionnet.hamonica2.shared.system.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.system.models.Configuration;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.ConfigurationEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-31T11:13:57+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class ConfigurationMapperImpl implements ConfigurationMapper {

    @Override
    public ConfigurationEntity toEntity(Configuration model) {
        if ( model == null ) {
            return null;
        }

        ConfigurationEntity configurationEntity = new ConfigurationEntity();

        setCreatorId( configurationEntity );

        return configurationEntity;
    }

    @Override
    public Configuration toDto(ConfigurationEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Configuration configuration = new Configuration();

        return configuration;
    }

    @Override
    public List<ConfigurationEntity> toEntityList(List<Configuration> model) {
        if ( model == null ) {
            return null;
        }

        List<ConfigurationEntity> list = new ArrayList<ConfigurationEntity>( model.size() );
        for ( Configuration configuration : model ) {
            list.add( toEntity( configuration ) );
        }

        setCreatorId( list );

        return list;
    }

    @Override
    public List<Configuration> toDtoList(List<ConfigurationEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<Configuration> list = new ArrayList<Configuration>( entity.size() );
        for ( ConfigurationEntity configurationEntity : entity ) {
            list.add( toDto( configurationEntity ) );
        }

        return list;
    }

    @Override
    public ConfigurationEntity partialUpdate(Configuration model, ConfigurationEntity entity) {
        if ( model == null ) {
            return entity;
        }

        setCreatorId( entity );

        return entity;
    }

    @Override
    public List<ConfigurationEntity> partialUpdatse(List<Configuration> model, List<ConfigurationEntity> entity) {
        if ( model == null ) {
            return entity;
        }

        entity.clear();
        for ( Configuration configuration : model ) {
            entity.add( toEntity( configuration ) );
        }

        setCreatorId( entity );

        return entity;
    }
}
