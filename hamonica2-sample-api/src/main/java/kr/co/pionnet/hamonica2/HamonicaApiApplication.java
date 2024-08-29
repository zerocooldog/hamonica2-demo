package kr.co.pionnet.hamonica2;

import com.hazelcast.cache.HazelcastCacheManager;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@Slf4j
@SpringBootApplication(
		exclude = {
				DataSourceAutoConfiguration.class,
				DataSourceTransactionManagerAutoConfiguration.class,
				SecurityAutoConfiguration.class,
				MongoAutoConfiguration.class,
				MongoDataAutoConfiguration.class
		}
)
public class HamonicaApiApplication {

	/**
	 * 프로젝트 설정파일을 지정한다.
	 */
	private static final String PROPERTIES = """
			spring.config.location=
				classpath:/application.yml,
				classpath:/config.yml,
				classpath:/datasource.yml
		""";



	public static void main(String[] args) {
		new SpringApplicationBuilder(HamonicaApiApplication.class).properties(PROPERTIES).run(args);
	}


}
