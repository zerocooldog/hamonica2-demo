package kr.co.pionnet.hamonica2.shared.system.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.pionnet.hamonica2.shared.system.models.Role;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.RoleEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-16T16:50:06+0900",
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

        roleEntity.setRoleId( model.getRoleId() );
        roleEntity.setRoleName( model.getRoleName() );
        roleEntity.setRoleNameI18n( model.getRoleNameI18n() );
        roleEntity.setRoleType( model.getRoleType() );
        roleEntity.setWriteYn( model.getWriteYn() );
        roleEntity.setReadYn( model.getReadYn() );
        roleEntity.setUseYn( model.getUseYn() );
        roleEntity.setDescription( model.getDescription() );

        setCreatorId( roleEntity );

        return roleEntity;
    }

    @Override
    public Role toDto(RoleEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Role.RoleBuilder role = Role.builder();

        role.roleId( entity.getRoleId() );
        role.roleName( entity.getRoleName() );
        role.roleNameI18n( entity.getRoleNameI18n() );
        role.roleType( entity.getRoleType() );
        role.writeYn( entity.getWriteYn() );
        role.readYn( entity.getReadYn() );
        role.useYn( entity.getUseYn() );
        role.description( entity.getDescription() );

        return role.build();
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

        if ( model.getRoleId() != null ) {
            entity.setRoleId( model.getRoleId() );
        }
        if ( model.getRoleName() != null ) {
            entity.setRoleName( model.getRoleName() );
        }
        if ( model.getRoleNameI18n() != null ) {
            entity.setRoleNameI18n( model.getRoleNameI18n() );
        }
        if ( model.getRoleType() != null ) {
            entity.setRoleType( model.getRoleType() );
        }
        if ( model.getWriteYn() != null ) {
            entity.setWriteYn( model.getWriteYn() );
        }
        if ( model.getReadYn() != null ) {
            entity.setReadYn( model.getReadYn() );
        }
        if ( model.getUseYn() != null ) {
            entity.setUseYn( model.getUseYn() );
        }
        if ( model.getDescription() != null ) {
            entity.setDescription( model.getDescription() );
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
