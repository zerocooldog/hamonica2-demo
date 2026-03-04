package kr.co.pionnet.hamonica2;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.data.mongodb.autoconfigure.DataMongoAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.mongodb.autoconfigure.MongoAutoConfiguration;
import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
import org.springframework.boot.security.autoconfigure.UserDetailsServiceAutoConfiguration;

@Slf4j
@SpringBootApplication(
		exclude = {
				DataSourceAutoConfiguration.class,
				DataSourceTransactionManagerAutoConfiguration.class,
				SecurityAutoConfiguration.class,
				UserDetailsServiceAutoConfiguration.class,
				MongoAutoConfiguration.class,
				DataMongoAutoConfiguration.class
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
