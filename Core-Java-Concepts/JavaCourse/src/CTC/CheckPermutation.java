package CTC;
import java.util.Scanner;
import java.util.Arrays;
public class CheckPermutation {

	private static boolean permutationCheck(String str1, String str2)
	{
		if(str1.length() == str2.length())
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i = 0; i<ch1.length; i++)
			{
				if(ch1[i] == ch2[i])
					return true;
				else
					return false;
			}
		}
		else
		{
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string1: ");
		String s1 = scan.nextLine();
		System.out.print("Enter the string1: ");
		String s2 = scan.nextLine();
		System.out.println(permutationCheck(s1,s2));
	}

}
