package Strings;

public class StringClass {
	public static void reverseString(char[] s) {
		System.out.println(s);
		int size = s.length;
		char rev = 0;
		for(int i = 0; i<6; i++) 
		{		
			rev = s[i];
			s[i] = s[size-i-1];
			s[size-i-1] = rev;
		}
		System.out.println("");	
		System.out.println(s);
	}
	
	private static int reverseInt(int num)
	{
		long rev = 0;
        int intMin = Integer.MIN_VALUE;
        
        long intMax = Integer.MAX_VALUE;
		System.out.println(intMax);
        long check = num;
            
        
        	
		if(check<0)
			num = num * (-1);
		while(num>0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		if(check<0)
			rev = rev * (-1);

        
		if(rev < intMin || rev > intMax) 
			return 0; 
		else 
			return (int)rev;
	}
	
	public static int firstUniqChar(String s)
	{
		int i = 0;
		int n = 0;
		for(i = 0; i<s.length(); i++)
		{
			n = i;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		char[] s = {'f','o','l','l','o','w'};
		reverseString(s);
		*/
		
		/*
		int num = -123;
		System.out.println(num);
		System.out.println(reverseInt(num));
		*/
		
		String s = "leetcode";
		int num = firstUniqChar(s);
		System.out.println(num);
	}
}
