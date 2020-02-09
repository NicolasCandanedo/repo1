
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * STUDENT tests for the methods of PasswordChecker
 * @author 
 *
 */
public class PasswordCheckerSTUDENT_Test {
	ArrayList<String> passwords;
	String password1, password2;
	@Before
	public void setUp() throws Exception {
		String[] p = {"aaaa","Password1","AMOMOMOMO2","password1","AAAbbb3","ThisDigitException"};
		passwords = new ArrayList<String>();
		passwords.addAll(Arrays.asList(p)); // puts strings into the ArrayList
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	/**
	 * Test if the password is less than 8 characters long.
	 * This test should throw a LengthException for second case.
	 */
	@Test
	public void testIsValidPasswordTooShort()
	{
		try{
				PasswordCheckerUtility.isValidPassword("aaaa");
		}
		catch(LengthException e)
		{
			assertTrue("Successfully threw a lengthExcepetion",true);
		}
		catch(Exception e)
		{
			assertTrue("Threw some other exception besides lengthException",false);
		}
	}
	
	/**
	 * Test if the password has at least one uppercase alpha character
	 * This test should throw a NoUpperAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoUpperAlpha()
	{
		try{
			PasswordCheckerUtility.isValidPassword("apassword3");
	}
	catch(NoUpperAlphaException e)
	{
		assertTrue("Successfully threw a lengthExcepetion",true);
	}
	catch(Exception e)
	{
		assertTrue("Threw some other exception besides lengthException",false);
	}
	}
	
	/**
	 * Test if the password has at least one lowercase alpha character
	 * This test should throw a NoLowerAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoLowerAlpha()
	{
		try{
			PasswordCheckerUtility.isValidPassword("AAAHAHAIFAFA2");
	}
	catch(NoLowerAlphaException e)
	{
		assertTrue("Successfully threw a lengthExcepetion",true);
	}
	catch(Exception e)
	{
		assertTrue("Threw some other exception besides lengthException",false);
	}
	}
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsWeakPassword()
	{
		assertTrue(PasswordCheckerUtility.isWeakPassword("aaabbb2"));
	}
	
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsValidPasswordInvalidSequence()
	{
		try{
			PasswordCheckerUtility.isValidPassword("AAAmmm2");
	}
	catch(InvalidSequenceException e)
	{
		assertTrue("Successfully threw a lengthExcepetion",true);
	}
	catch(Exception e)
	{
		assertTrue("Threw some other exception besides lengthException",false);
	}
	}
	
	/**
	 * Test if the password has at least one digit
	 * One test should throw a NoDigitException
	 */
	@Test
	public void testIsValidPasswordNoDigit()
	{
		try{
			PasswordCheckerUtility.isValidPassword("Password");
	}
	catch(NoDigitException e)
	{
		assertTrue("Successfully threw a lengthExcepetion",true);
	}
	catch(Exception e)
	{
		assertTrue("Threw some other exception besides lengthException",false);
	}
	}
	
	/**
	 * Test correct passwords
	 * This test should not throw an exception
	 */
	@Test
	public void testIsValidPasswordSuccessful()
	{
		try{
			PasswordCheckerUtility.isValidPassword("Password11");
	}
	catch(Exception e)
	{
		assertTrue("Threw some other exception besides lengthException",false);
	}
	}
	
	/**
	 * Test the validPasswords method
	 * Check the results of the ArrayList of Strings returned by the validPasswords method
	 */
	@Test
	public void testValidPasswords() {
		ArrayList<String> results;
		results = PasswordCheckerUtility.invalidPasswords(passwords);
		Scanner scan = new Scanner(results.get(0)); 
		assertEquals(scan.next(), "aaaa");
		scan = new Scanner(results.get(1)); 
		assertEquals(scan.next(), "AMOMOMOMO2");
		scan = new Scanner(results.get(2)); 
		assertEquals(scan.next(), "password1");
		scan = new Scanner(results.get(3)); 
		assertEquals(scan.next(), "AAAbbb3");
		scan = new Scanner(results.get(4)); 
		assertEquals(scan.next(), "ThisDigitException");
		
	}
	
}
