package kr.co.pionnet.hamonica2.shared.system.mappers;

import kr.co.pionnet.hamonica2.shared.notification.mappers.DefaultMapStructMapper;
import kr.co.pionnet.hamonica2.shared.system.models.ConfigurationInputItem;
import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.ConfigurationInputItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ConfigurationInputItemMapper extends DefaultMapStructMapper<ConfigurationInputItem, ConfigurationInputItemEntity> {
}