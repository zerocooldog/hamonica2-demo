package kr.co.pionnet.hamonica2.zconfiguration.jpa;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;

@Slf4j
public abstract class HamonicaJpaRepository {

    private SessionFactoryImplementor sessionFactory;
    private EntityManager entityManager;
    protected JPAQueryFactory queryFactory;

    protected void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.sessionFactory = ((SessionImplementor) entityManager.getDelegate()).getSessionFactory();
    }

    protected void setQueryFactory(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

}
