package kr.co.pionnet.hamonica2.shared.system.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.system.models.ConfigurationInputItem;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.ConfigurationInputItemEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-06T14:14:13+0900",
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

        configurationInputItemEntity.setCreatorId( model.getCreatorId() );
        configurationInputItemEntity.setCreatedAt( model.getCreatedAt() );
        configurationInputItemEntity.setModifierId( model.getModifierId() );
        configurationInputItemEntity.setModifiedAt( model.getModifiedAt() );
        configurationInputItemEntity.setConfigurationItemNo( model.getConfigurationItemNo() );
        configurationInputItemEntity.setConfigurationId( model.getConfigurationId() );
        configurationInputItemEntity.setItemKey( model.getItemKey() );
        configurationInputItemEntity.setItemName( model.getItemName() );
        configurationInputItemEntity.setItemNameI18n( model.getItemNameI18n() );
        configurationInputItemEntity.setDescription( model.getDescription() );
        configurationInputItemEntity.setSortOrder( model.getSortOrder() );

        setCreatorId( configurationInputItemEntity );

        return configurationInputItemEntity;
    }

    @Override
    public ConfigurationInputItem toDto(ConfigurationInputItemEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ConfigurationInputItem.ConfigurationInputItemBuilder<?, ?> configurationInputItem = ConfigurationInputItem.builder();

        configurationInputItem.creatorId( entity.getCreatorId() );
        configurationInputItem.createdAt( entity.getCreatedAt() );
        configurationInputItem.modifierId( entity.getModifierId() );
        configurationInputItem.modifiedAt( entity.getModifiedAt() );
        configurationInputItem.configurationItemNo( entity.getConfigurationItemNo() );
        configurationInputItem.configurationId( entity.getConfigurationId() );
        configurationInputItem.itemKey( entity.getItemKey() );
        configurationInputItem.itemName( entity.getItemName() );
        configurationInputItem.itemNameI18n( entity.getItemNameI18n() );
        configurationInputItem.description( entity.getDescription() );
        configurationInputItem.sortOrder( entity.getSortOrder() );

        return configurationInputItem.build();
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
        if ( model.getConfigurationItemNo() != null ) {
            entity.setConfigurationItemNo( model.getConfigurationItemNo() );
        }
        if ( model.getConfigurationId() != null ) {
            entity.setConfigurationId( model.getConfigurationId() );
        }
        if ( model.getItemKey() != null ) {
            entity.setItemKey( model.getItemKey() );
        }
        if ( model.getItemName() != null ) {
            entity.setItemName( model.getItemName() );
        }
        if ( model.getItemNameI18n() != null ) {
            entity.setItemNameI18n( model.getItemNameI18n() );
        }
        if ( model.getDescription() != null ) {
            entity.setDescription( model.getDescription() );
        }
        if ( model.getSortOrder() != null ) {
            entity.setSortOrder( model.getSortOrder() );
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
