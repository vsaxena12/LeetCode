package JavaBasics;
public class Varargs {
	public void varargsOverload(boolean b, int l, int m, int n) //same number of parameters
	{
		System.out.println("Things without varargs");
		
	}
	
	public void varargsOverload(boolean b, int... list)//diff number of parameters
	{
		System.out.println("Things with varargs");
		System.out.println("list.length: "+list.length);
		/*
		 * Variable length arguments - 
		 * compiler converts the variables into an array
		 * Varargs must be the last parameter
		 * only one Varargs parameters
		 */
	}
}
