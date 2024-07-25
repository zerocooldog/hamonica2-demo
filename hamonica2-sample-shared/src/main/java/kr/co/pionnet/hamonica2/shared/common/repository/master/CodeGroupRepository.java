package kr.co.pionnet.hamonica2.shared.common.repository.master;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.shared.common.models.CodeGroup;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeGroupEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.HamonicaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodeGroupRepository extends HamonicaRepository<CodeGroupEntity, CodeGroup> {

    CodeGroupEntity findOneByCodeGroupId(@Size(max = 6) String codeGroupId);

    CodeGroupEntity findOneByCodeGroupIdAndUseYn(@Size(max = 6) String codeGroupId, @NotNull Character useYn);

    List<CodeGroupEntity> findByCodeGroupIdAndUseYn(String codeGroupId, Character useYn);
}