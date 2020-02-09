/**
 * This exception class handles what happens when a password contains less than 6 characters.
 * @author Nicolas Candanedo
 *
 */
public class LengthException extends RuntimeException {

		public LengthException() {
			super("Password must be at least 6 characters long.");
		}
		
		public LengthException(String msg) {
			super(msg);
		}
}
