/**
 * This exception class handles what happens when a password containsno uppercase alphabetic characters.
 * @author Nicolas Candanedo
 *
 */
public class NoUpperAlphaException extends RuntimeException {
	public NoUpperAlphaException() {
		super("Password must contain at least one uppercase alphabetic character");
	}
	
	public NoUpperAlphaException(String msg) {
		super(msg);
	}
}
