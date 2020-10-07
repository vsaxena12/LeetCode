
public class LeetCodeSol7 {
	public int reverse(int x) {
        long n = 0;
        int rem = 0;
        
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println(min+"   "+max);
       
        while(x != 0)//to take positive and negative numbers both
        {
            rem = x % 10;
            x = x/10;
            if(n<Integer.MIN_VALUE/10 || n>Integer.MAX_VALUE/10)// Issue here**
            {
                return 0;
            }
            else
            {
                n = n*10 + rem;
            }
            
        }
        
        return (int)n;
    }
}
