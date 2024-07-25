package kr.co.pionnet.hamonica2.zconfiguration.jpa;

import io.hypersistence.utils.spring.repository.HibernateRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface HamonicaRepository<T, ID> extends HibernateRepository<T>, JpaRepository<T, ID>{
}
