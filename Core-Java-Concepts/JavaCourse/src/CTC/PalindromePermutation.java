package CTC;
import java.util.Scanner;
public class PalindromePermutation {

	private static void palin(String s)
	{
		char[] ch1 = s.toCharArray();
		char[] ch2 = null; 
		int length = ch1.length;
		System.out.println("Length of the Array: "+length);
		int index = length;
		for(int i = length - 1; i>=0; i--)
		{
			if(ch1[i] == ' ')
			{
				index--;
				continue;
				
			}
			else
			{
				ch2[index] = ch1[i];
				index--;
			}
		}
		System.out.println(ch2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		palin(str);
	}

}
