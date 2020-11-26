import java.util.*;
public class Permutation {
	public boolean sort(String s1, String s2)
	{
		int size = s1.length();
		int count = 0;
		//String str = new String();
		/*  System.out.println("Output: "+sr);
		 	for(int i = 0; i<sr.length(); i++)
			{
			int check = sr.charAt(i);
			char ch = (char)check;
			System.out.println(ch+" - "+check);
			}
		*/
		if(s1.length() != s2.length())
			return false;
		
		char[] ch1 = s1.toCharArray();//IMPORTANT
		char[] ch2 = s2.toCharArray();//IMPORTANT
		
		java.util.Arrays.sort(ch1);//IMPORTANT
		java.util.Arrays.sort(ch2);//IMPORTANT
		
		for(int i = 0; i<size; i++)
			if(ch1[i] != ch2[i])
				return false;
				
			
		return true;
	}
}