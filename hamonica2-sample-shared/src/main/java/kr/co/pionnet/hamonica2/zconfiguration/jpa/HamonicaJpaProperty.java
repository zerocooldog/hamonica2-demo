package kr.co.pionnet.hamonica2.zconfiguration.jpa;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class HamonicaJpaProperty {

    /**
     *  색상으로 질의 키워드와 컬럴을 구분하여 보여준다.
     */
    private boolean highlightSql;

    /**
     * 실행된 쿼리를 보여줌
     */
    private boolean showSql;

    /**
     * 실행 된 쿼리를 이쁘게 보여줌
     */
    private boolean formatSql;

    /**
     * 어떤 객체로 쿼리가 실행되는지 보여줌
     */
    private boolean useSqlComments;

    private String ddlAuto;

    private String namingPhysicalStrategy;

    private String namingImplicitStrategy;




}