public class UniqueChar {
	public boolean uniChar(String s)
	{
		if(s.length() > 128)
			return false;
			
		return true;
	}
}


/*
public class UniqueChar {
	public boolean uniChar(String s)
	{
		if(s.length() > 128)
			return false;
		boolean[] ch = new boolean[128];
		for(int i = 0; i<s.length(); i++)
		{
			//System.out.println(s.charAt(i));
			int val = s.charAt(i);
			System.out.println(val);
			//System.out.println(ch[val]);
			if(ch[val])
				return false;
				
			ch[val] = true;
		}
		
		return true;
	}
}
*/