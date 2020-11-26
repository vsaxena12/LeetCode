package CTC;

import java.util.Scanner;

public class URLify 
{
	private static void replaceSpaces(char[] ch, int length)
	{
		if(ch == null)
			return;
		int count = 0;
		for(int i = 0; i<length; i++)
		{
			if(ch[i] == ' ')
				count++;	
		}
		int index = length + (count * 2) - 1; //19
		for(int i = length - 1; i>=0; i--)
		{
			if(ch[i] == ' ')
			{
				ch[index - 2] = '%'; //17
				ch[index - 1] = '2'; //18
				ch[index] = '0'; //19
				index = index - 3; //16
			}
			
			else
			{
				ch[index] = ch[i]; //16 -> 
				index--;
			}
		}
		System.out.println(ch);
	}
	
	public static void main(String[] args) {
		URLify u = new URLify();
		String str = "Mr John Smith       ";
		int length = str.length();
		System.out.println(length);
		char[] chars = str.toCharArray();
		u.replaceSpaces(chars, 14);
	}
}