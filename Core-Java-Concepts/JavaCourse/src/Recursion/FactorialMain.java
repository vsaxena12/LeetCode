package Recursion;
import java.util.Scanner;
public class FactorialMain {
	private static int factorial(int n)
	{
		if(n == 1)
			return n;
		else
			return (n*factorial(n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scan.nextInt();
		System.out.println(factorial(num));
		
	}
}