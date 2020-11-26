package BasicCode;
import java.util.Scanner;
public class TestCases {
	/*
	protected int test(int n)
	{
		if(n < 1) //n<=1 -> 0 1 1 2 3 5
			return n;
		else
			//How the condition stops at 0 and does not go negative here
			return test(n-1) + test(n-2); 
	
	}
	*/
	
	private static void palin()
	{
		//Madam
		/*
		 * 1. counts the number of letters: 5
		 * 2. length: 4 (0 to 4 = 5)
		 * 3. str.chartAt(4) = m
		 * 4. ... 
		 * 5. str.chartAt(0) = M
		 */
		System.out.println("Enter the String: ");
		Scanner scan = new Scanner(System.in);
		String str = new String();
		str = scan.nextLine();
		String reverse = "";
		int lengthStr = str.length() - 1;
		
		for(int i = lengthStr; i>=0; i-- )
		{
			reverse += str.charAt(i);	
		}
		if(str.equals(reverse)) //equals vs ==
		{
			System.out.println("IsPalindrome");
		}
		else
		{
			System.out.println("IsNotPalindrome");
		}
		
	}
	
	public static void main(String[] args)
	{
		palin();
	}
}
