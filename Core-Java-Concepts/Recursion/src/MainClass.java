import java.util.*;
import java.io.*;
public class MainClass {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n; 
		System.out.println("Enter the Values");
		Scanner scan = new Scanner(System.in);
		System.out.print("String1: ");
		String str1 = scan.nextLine();
		System.out.print("String2: ");
		String str2 = scan.nextLine();
		/*******************************************************************/
		UniqueChar ch = new UniqueChar();
		System.out.println(ch.uniChar(str2));
		
		//char chr = 67;
		//System.out.println(chr);
		
		/*******************************************************************/
		Permutation npr = new Permutation();
		System.out.println(npr.sort(str1, str2));
		/*******************************************************************/
		int check = 'a';
		System.out.println(check);
		/*******************************************************************/
		for(int i = 0; i<10; i++)
		{
			if(i%2 == 0)
				continue;
			else
				System.out.println(i);
		}
	}
}