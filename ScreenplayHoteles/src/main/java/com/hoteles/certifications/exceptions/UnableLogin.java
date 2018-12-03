package com.hoteles.certifications.exceptions;

public class UnableLogin extends AssertionError{

	/**
	 * Excepci�n para controlar el login en la p�gina
	 */
	private static final long serialVersionUID = 12312L;
	private static final String LOGIN_FAILED = "Login failed";
	
	public static String getUnableLoginMessage() {
		return LOGIN_FAILED;
	}
	
	public UnableLogin(String message, Throwable cause) {
		super(message, cause);
	}
}
