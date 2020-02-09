import java.util.Scanner;
import java.util.ArrayList;
public class PasswordCheckerDriver extends PasswordCheckerUtility{

	public static void main(String[] args) {
	

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list.add("aaa");
		list.add("Jetupper3");
		list.add("jetup351");
		list.add("1234aaAAA");
		list2 = invalidPasswords(list);
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
	
		System.out.println("Type: ");
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		System.out.println("aaa: " + checker(b));
		System.out.println(isWeakPassword(b));
		
		try {
			System.out.println(isValidPassword(b));
		} catch (LengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoUpperAlphaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoLowerAlphaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoDigitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidSequenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}


