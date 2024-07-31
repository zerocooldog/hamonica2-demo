package kr.co.pionnet.hamonica2.zconfiguration.datasource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kr.co.pionnet.hamonica2.zconfiguration.exception.DSConfigResourceException;
import org.springframework.core.io.Resource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DsConfig {

	/**
	 * mybatis mapper xml 파일 하나 씩 등록 할 때 사용한다. <br>
	 * 
	 * ex) <br>
	 *  Resource[] resources  = addResource( <br>
     *		&emsp;applicationContext.getResources("classpath:...........xml"), <br>
     *		&emsp; <b>applicationContext.getResources("classpath*:mappers/master/Common.xml")</b> <br>
	 *	)
	 * 
	 * @param addResources
	 * @return
	 * @throws Exception
	 */
	public Resource[] addResource(Resource[] ...addResources) throws Exception{		
		
		if( addResources == null ) {
 			throw new DSConfigResourceException("The Resource value is null.");
 		}
		
		List<Resource> mappers = new ArrayList<>();
		
		for (Resource[] resources : addResources) {
				mappers.addAll(Arrays.asList(resources));
		}
				
		return mappers.toArray(new Resource[mappers.size()]);
	}
}
