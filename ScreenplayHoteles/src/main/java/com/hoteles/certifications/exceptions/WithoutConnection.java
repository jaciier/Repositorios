package com.hoteles.certifications.exceptions;

public class WithoutConnection extends AssertionError{

	/**
	 * Excepci�n para controlar la conexion a internet en la p�gina
	 */
	private static final long serialVersionUID = 1L;
	private static final String ERROR_CONNECTION_PAGE = "Without connection yo the hoteles.com";
	
	public static String getErrorHottelesMessage() {
		return ERROR_CONNECTION_PAGE;
	}
	
	public WithoutConnection(String message, Throwable cause) {
		super(message,cause);
	}
	

}
