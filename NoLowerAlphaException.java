/**
 * This exception class handles what happens when a password contains no lowercase alphabetic letters.
 * @author Nicolas Candanedo
 *
 */
public class NoLowerAlphaException extends RuntimeException {
	public NoLowerAlphaException() {
		super("Password must contain at least one lowercase alphabetic character");
	}
	
	public NoLowerAlphaException(String msg) {
		super(msg);
	}
}
