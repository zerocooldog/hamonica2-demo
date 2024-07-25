package kr.co.pionnet.hamonica2.shared.system.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.system.models.Configuration;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.ConfigurationEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-25T13:30:55+0900",
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

        configurationEntity.setCreatorId( model.getCreatorId() );
        configurationEntity.setCreatedAt( model.getCreatedAt() );
        configurationEntity.setModifierId( model.getModifierId() );
        configurationEntity.setModifiedAt( model.getModifiedAt() );
        configurationEntity.setConfigurationId( model.getConfigurationId() );
        configurationEntity.setParentConfigurationId( model.getParentConfigurationId() );
        configurationEntity.setConfigurationName( model.getConfigurationName() );
        configurationEntity.setConfigurationNameI18n( model.getConfigurationNameI18n() );
        configurationEntity.setConfigurationValue( model.getConfigurationValue() );
        configurationEntity.setConfigurationCategory( model.getConfigurationCategory() );
        configurationEntity.setConfigurationCategoryName( model.getConfigurationCategoryName() );
        configurationEntity.setConfigurationCategoryNameI18n( model.getConfigurationCategoryNameI18n() );
        configurationEntity.setInputType( model.getInputType() );
        configurationEntity.setConfigurationVisibleId( model.getConfigurationVisibleId() );
        configurationEntity.setConfigurationVisibleValue( model.getConfigurationVisibleValue() );
        configurationEntity.setSortOrder( model.getSortOrder() );
        configurationEntity.setUseYn( model.getUseYn() );

        setCreatorId( configurationEntity );

        return configurationEntity;
    }

    @Override
    public Configuration toDto(ConfigurationEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Configuration.ConfigurationBuilder<?, ?> configuration = Configuration.builder();

        configuration.creatorId( entity.getCreatorId() );
        configuration.createdAt( entity.getCreatedAt() );
        configuration.modifierId( entity.getModifierId() );
        configuration.modifiedAt( entity.getModifiedAt() );
        configuration.configurationId( entity.getConfigurationId() );
        configuration.parentConfigurationId( entity.getParentConfigurationId() );
        configuration.configurationName( entity.getConfigurationName() );
        configuration.configurationNameI18n( entity.getConfigurationNameI18n() );
        configuration.configurationValue( entity.getConfigurationValue() );
        configuration.configurationCategory( entity.getConfigurationCategory() );
        configuration.configurationCategoryName( entity.getConfigurationCategoryName() );
        configuration.configurationCategoryNameI18n( entity.getConfigurationCategoryNameI18n() );
        configuration.inputType( entity.getInputType() );
        configuration.configurationVisibleId( entity.getConfigurationVisibleId() );
        configuration.configurationVisibleValue( entity.getConfigurationVisibleValue() );
        configuration.sortOrder( entity.getSortOrder() );
        configuration.useYn( entity.getUseYn() );

        return configuration.build();
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
        if ( model.getConfigurationId() != null ) {
            entity.setConfigurationId( model.getConfigurationId() );
        }
        if ( model.getParentConfigurationId() != null ) {
            entity.setParentConfigurationId( model.getParentConfigurationId() );
        }
        if ( model.getConfigurationName() != null ) {
            entity.setConfigurationName( model.getConfigurationName() );
        }
        if ( model.getConfigurationNameI18n() != null ) {
            entity.setConfigurationNameI18n( model.getConfigurationNameI18n() );
        }
        if ( model.getConfigurationValue() != null ) {
            entity.setConfigurationValue( model.getConfigurationValue() );
        }
        if ( model.getConfigurationCategory() != null ) {
            entity.setConfigurationCategory( model.getConfigurationCategory() );
        }
        if ( model.getConfigurationCategoryName() != null ) {
            entity.setConfigurationCategoryName( model.getConfigurationCategoryName() );
        }
        if ( model.getConfigurationCategoryNameI18n() != null ) {
            entity.setConfigurationCategoryNameI18n( model.getConfigurationCategoryNameI18n() );
        }
        if ( model.getInputType() != null ) {
            entity.setInputType( model.getInputType() );
        }
        if ( model.getConfigurationVisibleId() != null ) {
            entity.setConfigurationVisibleId( model.getConfigurationVisibleId() );
        }
        if ( model.getConfigurationVisibleValue() != null ) {
            entity.setConfigurationVisibleValue( model.getConfigurationVisibleValue() );
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
