package com.hoteles.certifications.exceptions;

public class CopException extends AssertionError{

	/**
	 * excepcion para verificar pago
	 */
	private static final long serialVersionUID = 11231L;
	private static final String COST_FAILED = "non-visible cost";
	
	public static String getUnableLoginMessage() {
		return COST_FAILED;
	}
	
	public CopException(String message, Throwable cause) {
		super(message, cause);
	}

}
