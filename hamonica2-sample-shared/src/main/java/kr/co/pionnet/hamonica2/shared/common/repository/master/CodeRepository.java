package kr.co.pionnet.hamonica2.shared.common.repository.master;

import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeEntity;
import kr.co.pionnet.hamonica2.shared.common.repository.master.entity.CodeId;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.HamonicaRepository;
import org.springframework.data.jpa.repository.EntityGraph;

import java.util.List;
import java.util.Optional;

public interface CodeRepository extends HamonicaRepository<CodeEntity, CodeId> {

    @EntityGraph(attributePaths = {"codeGroup"})
    List<CodeEntity> findAllByOrderBySortOrderAsc();

    @EntityGraph(attributePaths = {"codeGroup"})
    Optional<CodeEntity> findOneByCodeGroupIdAndCodeId(String codeGroupId, String codeId);

    @EntityGraph(attributePaths = {"codeGroup"})
    Optional<CodeEntity> findOneByCodeGroupIdAndCodeIdAndUseYn(String codeGroupId, String codeId, Character codeUseYn);

    Optional<List<CodeEntity>> findByCodeGroupIdOrderBySortOrderAsc(String codeGroupId);

    Optional<List<CodeEntity>> findByCodeGroupIdAndUseYnOrderBySortOrderAsc(String codeGroupId, Character codeUseYn);

}