package firstDemoProgramJava;

import java.util.*;

//javap java.util.Scanner

class Demo
{
	public void test()
	{
		Scanner sc = new Scanner(System.in); //
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		System.out.println("Hi: "+s);
		
		sc.close();
		//nextInt(), nextFloat(), nextDouble(), next(), nextLine(),
		//nextByte(), nextShort(), nextLong(), nextBoolean(), 
		//hasNextInt(), hasNextFloat()
		//sc.useRadix(2) - read in binary but return in decimal 
	}
}

public class InputFromKeyboard {
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.test();
	}
}
