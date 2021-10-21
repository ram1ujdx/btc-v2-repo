package customexception;

public class InvalidAgeException extends RuntimeException {
	

	private static final long serialVersionUID = -7525954103642418317L;

	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}

}
