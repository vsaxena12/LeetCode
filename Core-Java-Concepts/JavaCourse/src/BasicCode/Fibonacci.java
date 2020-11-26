package BasicCode;
import java.util.Scanner;
public class Fibonacci {
	protected int fiboSeriesRecursive(int n)
	{
		//System.out.println("Recursive Function");
		if(n == 1 || n == 0)
			return n;
		else
			return fiboSeriesRecursive(n-1) + fiboSeriesRecursive(n-2);
	
	}
	protected void fiboSeriesIterative(int n)
	{
		System.out.println("Iterative Function");
		
		int f1 = 0;
		int f2 = 1;
		int temp = 0;
		System.out.println(0+"\n"+1);
			
		
		for(int i = 2; i<n; i++) {
			temp = f1 + f2;
			f1 = f2;
			f2 = temp;
			System.out.println(temp);
		}
		
	}
	
}
