package kr.co.pionnet.hamonica2.zconfiguration.datasource;

import com.zaxxer.hikari.HikariConfig;
import kr.co.pionnet.butterfly2.core.datasource.CryptHikariDatasource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;

import javax.sql.DataSource;

@Lazy
@Configuration
@Slf4j
public class DataSourceMaster {

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

}
