package exceptions;

public class NonRefillableWithInkException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NonRefillableWithInkException(String message) {
		super(message);
	}

}
