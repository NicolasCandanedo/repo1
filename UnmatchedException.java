/**
 * This exception class handles what happens when a password does not match the other password in the GUI.
 * @author Nicolas Candanedo
 *
 */
public class UnmatchedException extends RuntimeException {
	public UnmatchedException() {
		super("Passwords do not match.");
	}
	
	public UnmatchedException(String msg) {
		super(msg);
	}
}
 