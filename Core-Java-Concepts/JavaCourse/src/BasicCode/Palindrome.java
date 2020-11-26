package BasicCode;
import java.io.*;
import java.util.*;
public class Palindrome {
	public void palindrome()
	{
		//16461
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		int checkNumber = number;
		int n = 0;
		while(number != 0) {
			
			int temp = number % 10;
			number = number/10;
			n = n * 10 + temp;
			
		}
		if(n == checkNumber)
		{
			System.out.println(checkNumber+" is a palindrome.\nPalindrome is "+n);
		}
		else
		{
			System.out.println(checkNumber+" is not a palindrome");
		}
		
		return;
		
	}
	
	protected void strPalindrome() //String and StringBuilder
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
		StringBuilder sb = new StringBuilder(str);
		
		//System.out.println(sb.toString());
		sb.reverse();
		String rev = sb.toString();
		//System.out.println(rev);
		
		if(str.equals(rev))
			System.out.println("IsPalindrome");
		else
			System.out.println("IsNotPalindrome");
	}
	
	protected void strReverse()
	{
		String original, reverse = ""; // Objects of String class
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + original.charAt(i);
	         
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	}
	
	protected void strNotReverse()
	{
		String inputString;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input a string");
	    inputString = in.nextLine();
	 
	    int length  = inputString.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	      if (inputString.charAt(begin) == inputString.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    if (i == middle + 1) {
	      System.out.println(i);
	      System.out.println(middle);
	      System.out.println("Palindrome");
	    }
	    else {
	      System.out.println("Not a palindrome");
	    }  
	}
}