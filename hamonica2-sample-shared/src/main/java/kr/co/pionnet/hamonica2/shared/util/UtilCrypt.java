package kr.co.pionnet.hamonica2.shared.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 본 클래스는 암복호화 데이터를 조작 하는데 도움을 주는 유틸 클래스이다. 모든 프로젝트에서 사용할 유틸성 메소드를 구현할 경우에는 이곳에서
 * 추가한다.
 * 
 * 단. 프로젝트 특성을 타는 유틸은 각 프로젝트 kr.co.pionnet.hamonica.util 패키지에서 별도 정의 한다.
 *
 * @since 2019.07.01 10:29
 * @author 장진철(zerocooldog@zen9.co.kr)
 *
 *         <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력		
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2019.07.01 10:29 - 장진철 : 최초 작성
 *         </PRE>
 */
@Slf4j
public class UtilCrypt extends kr.co.pionnet.butterfly2.core.util.UtilCrypt {

	private static final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(6);

	public static byte[] sha(String data) throws NoSuchAlgorithmException {
		return sha(data.getBytes());
	}

	public static byte[] sha(byte[] data) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(data);
		byte[] encData = md.digest();
		return encData;
	}

	public static byte[] md5(String data) throws NoSuchAlgorithmException {
		return md5(data.getBytes());
	}

	public static byte[] md5(byte[] data) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(data);
		byte[] encData = md.digest();
		return encData;
	}

	public static byte[] md5(byte[] data, int offset, int len) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(data, offset, len);
		byte[] encData = md.digest();
		return encData;
	}

	public static String encryptPassword(String data) throws Exception {
		return new String(sha(md5(data)), StandardCharsets.UTF_8);
	}
	
	public static String encodeBase64(String data) throws Exception {
		return new String(Base64.getEncoder().encode(data.getBytes()), StandardCharsets.UTF_8);
	}
	
	public static String decodeBase64(String data) throws Exception {
		return new String(Base64.getDecoder().decode(data.getBytes()), StandardCharsets.UTF_8);
	}

	public static BCryptPasswordEncoder getBCrypt() {
		return bCryptPasswordEncoder;
	}
}
