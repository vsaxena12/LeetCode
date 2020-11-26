package BasicCode;
import java.util.*;
public class MainBasicCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome
		//Factorial
		//Armstrong
		//Fibonacci
		System.out.println("Check The Basic Codes");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		do
		{
			switch(ch)
			{
			case 1: Palindrome palin = new Palindrome();
					palin.palindrome();
					palin.strPalindrome();
					palin.strNotReverse();
					break;
			case 2:
				    Fibonacci fibo = new Fibonacci();
				    System.out.println("1. Recursive\n2. Iterative");
				    int num = sc.nextInt();
				    System.out.println("Enter The Value");
				    int n = sc.nextInt();
				    if(num == 1)
				    {
				    	for (int i = 0; i < n; i++)
				            System.out.println(i + ": " + fibo.fiboSeriesRecursive(i));

				    }
				    else if(num == 2){
				    	fibo.fiboSeriesIterative(n);
				    }
				    
					break;
			case 3: 
				/*	
					System.out.println("Enter The Value");
					int ntest = sc.nextInt();
					TestCases t = new TestCases();
					for (int i = 0; i < ntest; i++)
						System.out.println(i + ": " + t.test(i));
				*/
					break;
					
			case 4: 
					System.out.println("Enter The Value");
					int nfact = sc.nextInt();
					Factorial fact = new Factorial();
					System.out.println("Recursive: "+fact.factorialRecursive(nfact));
					System.out.println("Iterative: "+fact.factorialIterative(nfact));
					
					break;
			
			case 5: 
				Armstrong atg = new Armstrong();
				atg.armstrongNumIterative();

				break;	
				
			default: System.out.println("Check Proper Code");
					break;
			}
		}
		while(ch != 0);
		
		
	}

}
