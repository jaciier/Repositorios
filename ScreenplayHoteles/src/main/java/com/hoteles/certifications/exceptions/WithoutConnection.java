package com.hoteles.certifications.exceptions;

public class WithoutConnection extends AssertionError{

	/**
	 * Excepción para controlar la conexion a internet en la página
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
