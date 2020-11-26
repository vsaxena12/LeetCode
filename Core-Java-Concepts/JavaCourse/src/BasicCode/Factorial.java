package BasicCode;

public class Factorial {
	protected int factorialRecursive(int n) {
		if(n == 1)
		{
			return n;
		}
		else
		{
			return n * factorialRecursive(n-1);
		}
		
	}
	
	protected int factorialIterative(int n) {
		int res = 1, i; 
        for (i=2; i<=n; i++) 
            res = res * i; 
        return res;
		
	}
}
