package kr.co.pionnet.hamonica2;

import kr.co.pionnet.hamonica2.shared.common.services.CodeService;
import kr.co.pionnet.hamonica2.shared.common.services.DatetimeService;
import kr.co.pionnet.hamonica2.shared.util.UtilCode;
import kr.co.pionnet.hamonica2.shared.util.UtilDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public abstract class HamonicaApplication implements ApplicationRunner {

    @Autowired
    CodeService codeService;

    @Autowired
    DatetimeService datetimeService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        UtilDate.setDatetimeRepository(datetimeService);

        UtilCode.setCodeService(codeService);

        runByApplicationRunner(args);
    }

    abstract void runByApplicationRunner(ApplicationArguments args) throws Exception;
}
