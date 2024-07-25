package kr.co.pionnet.hamonica2.shared.system.repository.master;

import kr.co.pionnet.hamonica2.shared.system.repository.master.entity.ConfigurationEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.HamonicaRepository;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConfigurationRepository extends HamonicaRepository<ConfigurationEntity, String> {

  /**
   *  설정 정보를 가져온다.
   * native query는 @EntityGraphy 어노테이션을 지원하지 않아 ConfigurationInputIItemjoin문이 실행되지 않고 N+1로 데이터를 조회한다.
   * 최초에만 사용하는 쿼리이기 때문에 이와같은 현상은 무시하고 데이터를 가져온다.
   * @param configurationId 설정 아이디
   * @param useYn 사용 여부
   * @return List<ConfigurationEntity>
   */
  @Query(
          value = """

                  WITH RECURSIVE category_hierarchy AS (

                      SELECT configuration_id, parent_configuration_id, 1 AS level
                      FROM "configuration" cs
                      WHERE configuration_id = :configurationId AND cs.use_yn = :useYn
                  
                      UNION ALL
                  
                      SELECT cs.configuration_id, cs.parent_configuration_id, ch.level + 1
                      FROM "configuration" cs
                      INNER JOIN category_hierarchy ch ON ch.configuration_id = cs.parent_configuration_id  AND cs.use_yn = :useYn
                  )
                  SELECT c.*
                  FROM "configuration" c INNER JOIN category_hierarchy AS ch ON c.configuration_id  = ch.configuration_id
                  ORDER BY ch.level asc, c.sort_order asc

        """,
          nativeQuery = true
  )
  public List<ConfigurationEntity> findHierachyByConfigurationId(@Param("configurationId") String configurationId, @Param("useYn") String useYn);
}