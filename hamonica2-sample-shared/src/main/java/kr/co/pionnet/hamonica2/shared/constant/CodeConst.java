package kr.co.pionnet.hamonica2.shared.constant;

/**
 * 코드 상수
 */
public class CodeConst {

	/**
	 * 서버 연결 유형: 서비스 그룹.
	 */
	public static final String SERVER_LINK_TYPE_CD_SERVICE_GROUP = "SYS003001";

	/**
	 * 서버 연결 유형: 엔진 그룹.
	 */
	public static final String SERVER_LINK_TYPE_CD_ENGINE_GROUP = "SYS003002";


	/**
	 *  알림 위험 유형
	 */
	public static final String NOTIFICATION_THRESHOLD_CD_WARNING = "NTI003001";
	public static final String NOTIFICATION_THRESHOLD_CD_DANGER = "NTI003002";
	public static final String NOTIFICATION_THRESHOLD_CD_NORMAL = "NTI003003";
	/**
	 *  알림  변수값 타입 ( 알림제외 테이블)
	 */
	public static final String NOTIFICATION_EXCEPT_REF_VAL_TYPE_AGENT = "NTI004001";
	public static final String NOTIFICATION_EXCEPT_REF_VAL_TYPE_DATASOURCE = "NTI004002";


	/*
	 * 알림 주기 단위
	 */
	public static final String NOTIFICATION_CYCLE_UNIT_MINUTE = "NTI005001";  //분
	public static final String NOTIFICATION_CYCLE_UNIT_HOUR= "NTI005002";     //시간

	/*
	 * 알림 유형
	 */
	public static final String NOTIFICATION_TYPE_APP = "NTI002001"; //어플리케이션 성능
	public static final String NOTIFICATION_TYPE_AGNENT_STOP = "NTI002002"; //Agent STOP
	public static final String NOTIFICATION_TYPE_COLLECTOR_STOP = "NTI002003"; //COLLECTOR STOP




	/**
	 * 측정지표 데이터 유형 :  숫자
	 */
	public final static String METRICS_DATA_TYPE_NUMBER = "MTR002001";

	/**
	 * 측정지표 데이터 유형 :  문자
	 */
	public final static String METRICS_DATA_TYPE_STRING = "MTR002002";

	/**
	 * 측정지표 데이터 유형 :  참 / 거짓
	 */
	public final static String METRICS_DATA_TYPE_BOOLEAN = "MTR002003";

	/**
	 * 측정지표 데이터 유형 :  객체
	 */
	public final static String METRICS_DATA_TYPE_OBJECT = "MTR002004";








	/**
	 * 캐시 엔진 유형 그룹코드.
	 */
	public static final String CACHE_ENGINE_TYPE_CD_GRP = "CAC002";


	/**
	 * 사이트 ID
	 */
	public static final String SITE_ID = "SITE000001";

	/**
	 * DB ID
	 */
	public static final String DB_ID = "DB000001";

	/**
	 * 메일 ID
	 */
	public static final String MAIL_ID = "SMTP000001";


	/**
	 *
	 * 측정항목에 대한 유형
	 * ( 대분류 : MTR000,  
	 * 유형 : MTR000001	서버 리소스 지표, 
	 * MTR000200	어플리케이션 서비스 지표, 
	 * MTR000004	JVM 성능 지표, 
	 * MTR000005	CACHE 서비스 지표, 
	 * MTR000006	ORACLE 성능지표, 
	 * MTR000008	기타 지표)
	 *
	 */
	public static final String METRIC_TYPE_GROUP = "MTR000";
	public static final String METRIC_TYPE_SERVER_RESOURCE = "MTR000001";
	public static final String METRIC_TYPE_JVM_PERF = "MTR000004";
	public static final String METRIC_TYPE_CACHE_SERVICE = "MTR000005";
	public static final String METRIC_TYPE_ORACLE_PERF = "MTR000006";
	public static final String METRIC_TYPE_ETC = "MTR000008";



	/**
	 * 측정항목 집계 유형: 합계.
	 */
	public static final String AGGREGATE_TYPE_SUM = "MTR004001";

	/**
	 * 측정항목 집계 유형: 평균.
	 */
	public static final String AGGREGATE_TYPE_AVG = "MTR004002";

	/**
	 * 측정항목 집계 유형: 직접연산(병합).
	 */
	public static final String AGGREGATE_TYPE_CACULATION_MANUAL = "MTR004003";

	/**
	 * 측정항목 집계 유형: 최대 값.
	 */
	public static final String AGGREGATE_TYPE_MAX = "MTR004004";

	/**
	 * 측정항목 집계 유형: 최소 값.
	 */
	public static final String AGGREGATE_TYPE_MIN = "MTR004005";

}

