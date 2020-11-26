package recursion.letsDoRecursion;

public class Recursion
{
	public void fun1(int n) //Desending Order
	{
		if(n > 0)
		{
			System.out.print(n+" ");
			fun1(n-1);

		}
		System.out.println();		
	}

	public void fun2(int n) //Ascending order
	{
		if(n > 0)
		{
			fun2(n-1);
			System.out.print(n+" ");

		}
		//System.out.print();		
	}

	public int sumOfNaturalNumbers(int n)
	{
		if(n>0)
		{
			return (sumOfNaturalNumbers(n-1)+n);
		}

		return 0;

	}



}