package kr.co.pionnet.hamonica2.zconfiguration.datasource;

import com.zaxxer.hikari.HikariConfig;
import kr.co.pionnet.butterfly2.core.datasource.CryptHikariDatasource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Lazy
@Configuration
@Slf4j
public class DataSourceMaster extends DsConfig{

	@Autowired
	private ApplicationContext applicationContext;

	@Bean
	@ConfigurationProperties(prefix = "datasource.master.connection")
	public HikariConfig hikariConfigMaster() {
		return new HikariConfig();
	}

	@Primary
	@Bean
	public DataSource dataSource() {

		HikariConfig hc = hikariConfigMaster();

		log.debug("JdbcUrl => {}", hc.getJdbcUrl());
		log.debug("DriverClassName => {}", hc.getDriverClassName());
		log.debug("Username => {}", hc.getUsername());
		
		return new LazyConnectionDataSourceProxy(new CryptHikariDatasource(hc));
	}

	@Primary
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {

		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis-config.xml"));

		Resource[] resources = addResource(
				applicationContext.getResources("classpath*:mappers/Paging.xml"),
				applicationContext.getResources("classpath*:mappers/**/master/**/*.xml")
		);

		sessionFactoryBean.setMapperLocations(resources);
		return sessionFactoryBean.getObject();
	}

	@Primary
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionTemplate) throws Exception {
		return new SqlSessionTemplate(sqlSessionTemplate);
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

}
