package CTC;
import java.util.Scanner;
import java.util.Arrays;
public class UniqueCharacters {

	protected static boolean check(String s) {
		/*
		 * 1. String is not in an array format
		 * 2. Convert String into an array format like string -> toCharArray()
		 * 3. Arrays.sort(charArray);
		 * 4. for loop (if charArray[i] == charArray[i+1])
		 * 5. return false 
		 * 6. else {return true}
		 */
		char[] chArray = s.toCharArray(); //Convert String into toCharArray();
		Arrays.sort(chArray); //O(n log n)
		System.out.println(chArray);
		for(int i = 0; i<chArray.length - 1; i++)
		{
			System.out.println(chArray[i]);
			if(chArray[i] != chArray[i+1])
			{
				continue;
			}
			else
			{
				//break;
				return false; //code breaks here
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println(check(str));
	}

}
