import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This program has several methods which will determine whether or not a password or list of passwords are valid depending on certain criteria. 
 * @author Nicolas Candanedo
 *
 */
public class PasswordCheckerUtility {
	
	
	/**
	 * Checks to see if the password has two consecutive letters in a row.
	 * @param Password to check
	 * @return false if the password does have 2 consecutive letters, true if it does not.
	 */
	public static boolean checker(String pass) {
		for (int i = 0; i < pass.length() - 2; i++) {
			if (pass.charAt(i) == pass.charAt(i + 1) && pass.charAt(i) == pass.charAt(i + 2)) {
				return false;
			}
		}
		return true;
	}

	
	/**
	 * Checks whether or not a password is valid using a number of criteria. If one of the criteria is not met this method will throw various exceptions.
	 * @param Password to check
	 * @throw LengthException if the password is less than 6 characters.
	 * @throw NoUpperalphaException if the password has no uppercase letters.
	 * @throw NoLoweralphaException if the password has no lowercase letters.
	 * @throw NoDigitException if the password has no digits.
	 * @throw InvalidSequenceException if the password has more than two consecutive letters in a row.
	 * @return true if no exceptions are thrown
	 */
	public static boolean isValidPassword(java.lang.String passwordString) throws LengthException,
			NoUpperAlphaException, NoLowerAlphaException, NoDigitException, InvalidSequenceException {
		if (passwordString.length() < 6) {
			throw new LengthException();
		} else if (passwordString.equals(passwordString.toLowerCase())) {
			throw new NoUpperAlphaException();
		} else if (passwordString.equals(passwordString.toUpperCase())) {
			throw new NoLowerAlphaException();
		} else if (!passwordString.matches(".*\\d.*")) {
			throw new NoDigitException();
		} else if (checker(passwordString) == false) {
			throw new InvalidSequenceException();
		} else
			return true;
	}

	

	/**
	 * Checks if the password is between 6 and 9 characters.
	 * @param Password to check
	 * @return True if password length is between 6 and 9, false if otherwise
	 */
	public static boolean isWeakPassword(java.lang.String passwordString) {
		if (passwordString.length() > 6 && passwordString.length() <= 9) {
			return true;
		} else
			return false;

	}

	

	/**
	 * Runs through an arraylist of passwords and validates each line as its own password. If the password is not valid then it's added to a new arraylist. 
	 * @param ArrayList of passwords
	 * @return New Arraylist full of invalid passwords
	 */
	public static ArrayList<String> invalidPasswords(ArrayList<String> passwords) {

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < passwords.size(); i++) {
			try {
				if (isValidPassword(passwords.get(i))) {
					// System.out.println(passwords.get(i) + " is not an invalid password.");
				}
			} catch (LengthException e) {
				list.add(passwords.get(i) + "  Password must be at least 6 characters long.");

			} catch (NoUpperAlphaException e) {
				list.add(passwords.get(i) + "  Password must contain at least one uppercase alphabetic character");

			} catch (NoLowerAlphaException e) {
				list.add(passwords.get(i) + "  Password must contain at least one lowercase alphabetic character");

			} catch (NoDigitException e) {
				list.add(passwords.get(i) + "  The password must contain at least one digit.");

			} catch (InvalidSequenceException e) {
				list.add(passwords.get(i)
						+ "  The password cannot contain more than two of the same characters in sequence.");

			}

		}

		return list;

	}

}
