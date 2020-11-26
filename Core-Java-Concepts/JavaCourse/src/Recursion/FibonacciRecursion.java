package Recursion;

import java.util.Scanner;

public class FibonacciRecursion {
	private static int fibo(int n) {
		if(n == 1 || n == 0)
			return n;
		else
			return (fibo(n-1) + fibo (n-2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scan.nextInt();
		for(int i = 0; i<=num; i++)
		{
			System.out.println(fibo(i));
		}
	}
}