package recursion.driver;

import recursion.letsDoRecursion.Recursion;


public class Driver
{
	//static Node head; //It is a reference pointer
	public static void main(String args[]) //Point of Execution
	{
		recursion();

	}

	public static void recursion()
	{
		Recursion recurr = new Recursion();
		recurr.fun1(4);
		recurr.fun2(4);

		System.out.println(recurr.sumOfNaturalNumbers(5));

	}
}