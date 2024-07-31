package kr.co.pionnet.hamonica2.zconfiguration.exception;

import org.springframework.security.core.AuthenticationException;

public class ApprovalException extends AuthenticationException {

	/**
	 * Constructs a <code>BadCredentialsException</code> with the specified message.
	 * @param msg the detail message
	 */
	public ApprovalException(String msg) {
		super(msg);
	}

	/**
	 * Constructs a <code>BadCredentialsException</code> with the specified message and
	 * root cause.
	 * @param msg the detail message
	 * @param cause root cause
	 */
	public ApprovalException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
