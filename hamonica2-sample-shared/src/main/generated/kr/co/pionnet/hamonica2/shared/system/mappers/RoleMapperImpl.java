package kr.co.pionnet.hamonica2.shared.system.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.system.models.Role;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.RoleEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-31T11:13:57+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleEntity toEntity(Role model) {
        if ( model == null ) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        setCreatorId( roleEntity );

        return roleEntity;
    }

    @Override
    public Role toDto(RoleEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Role role = new Role();

        return role;
    }

    @Override
    public List<RoleEntity> toEntityList(List<Role> model) {
        if ( model == null ) {
            return null;
        }

        List<RoleEntity> list = new ArrayList<RoleEntity>( model.size() );
        for ( Role role : model ) {
            list.add( toEntity( role ) );
        }

        setCreatorId( list );

        return list;
    }

    @Override
    public List<Role> toDtoList(List<RoleEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( entity.size() );
        for ( RoleEntity roleEntity : entity ) {
            list.add( toDto( roleEntity ) );
        }

        return list;
    }

    @Override
    public RoleEntity partialUpdate(Role model, RoleEntity entity) {
        if ( model == null ) {
            return entity;
        }

        setCreatorId( entity );

        return entity;
    }

    @Override
    public List<RoleEntity> partialUpdatse(List<Role> model, List<RoleEntity> entity) {
        if ( model == null ) {
            return entity;
        }

        entity.clear();
        for ( Role role : model ) {
            entity.add( toEntity( role ) );
        }

        setCreatorId( entity );

        return entity;
    }
}
