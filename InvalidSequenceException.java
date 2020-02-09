/**
 * This exception class handles what happens when a password contains more than two of the same characters in sequence.
 * @author Nicolas Candanedo
 *
 */
public class InvalidSequenceException extends RuntimeException {
	public InvalidSequenceException() {
		super("The password cannot contain more than two of the same characters in sequence.");
	}

	public InvalidSequenceException(String msg) {
		super(msg);
}
}
