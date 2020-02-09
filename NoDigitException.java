/**
 * This exception class handles what happens when a password contains no digits.
 * @author Nicolas Candanedo
 *
 */
public class NoDigitException extends RuntimeException {
	public NoDigitException() {
	super("The password must contain at least one digit.");
}

public NoDigitException(String msg) {
	super(msg);
}
}
