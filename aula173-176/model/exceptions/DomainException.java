package model.exceptions;

// RuntimeException does not break the application
// Exception does it
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
