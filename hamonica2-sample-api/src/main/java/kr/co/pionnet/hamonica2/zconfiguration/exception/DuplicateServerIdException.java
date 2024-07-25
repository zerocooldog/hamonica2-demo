package kr.co.pionnet.hamonica2.zconfiguration.exception;

public class DuplicateServerIdException extends RuntimeException {
	
	public DuplicateServerIdException() {
		super();
	}
	
	public DuplicateServerIdException(String message) {
		super(message);
	}
}
