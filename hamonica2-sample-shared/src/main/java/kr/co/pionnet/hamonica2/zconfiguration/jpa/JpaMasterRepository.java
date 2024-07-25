package kr.co.pionnet.hamonica2.zconfiguration.jpa;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Slf4j
public abstract class JpaMasterRepository extends HamonicaJpaRepository implements InitializingBean {


    @Autowired
    @Qualifier(JpaMasterConfig.ENTITY_MANAGER)
    protected EntityManager entityManager;

    @Autowired
    @Qualifier(JpaMasterConfig.QUERY_FACTORY)
    protected JPAQueryFactory queryFactory;


    @Override
    public void afterPropertiesSet() throws Exception {
        setEntityManager(entityManager);
        setQueryFactory(queryFactory);
    }
}
