
public class Recursion {
	public static int nonRecursive(int n) {
		int factorial = n;
		if(n == 0 || n == 1)
			return 1;
		while(n >= 2) {
			factorial = factorial * (n-1);
			n--;
		}
		return factorial;
	}
	public static int fibo(int n) {
		int fibo = 0;
		if(n == 0 || n == 1)
			return 1;
		else
			fibo = n*fibo(n-1); //Calling the function again and again
		return fibo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.println(fibo(num));
		System.out.println("nonRecursive: "+nonRecursive(num));
	}

}
