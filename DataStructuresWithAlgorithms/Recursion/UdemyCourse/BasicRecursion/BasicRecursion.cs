using System;

namespace DataStructuresWithAlgorithms.Recursion.UdemyCourse.BasicRecursion //Ir
{
	/*
		Recursion uses Stack
		Check the activation records in the stack
	*/

	class BasicRecursion
	{
		//BreakPoint breakpoint = new BreakPoint();
		public int fact(int num)
		{
			if(num <= 1)
					return 1;
			else
				return num*fact(num-1);
		}

		public int fibo(int num)
		{
			if(num == 0)
				return 0;
			if (num == 1 || num == 2)
        		return 1;
			else
				return fibo(num-1) + fibo(num-2);
		}

		public int fun1(int x, int y)
		{
			if(x == 0)
				return y;
			else
				return (fun1(x-1, x+y));
		}

		public void fun2(int n)
		{
			if(n>0)
			{
				Console.WriteLine("Pre: "+n); //Calling time - Ascending
				fun2(n-1); //Calculations are performed at returning time - Calling n times hence O(n) time complexity
				Console.WriteLine("Post: "+n); //Returning time - Descending
				
			}
		}

		//Global and Static Variables
		////With out Global and Static variables
		public int funTest1(int num)
		{
			if(num > 0)
			{
				return (funTest1(num-1)+num);

			}
			return 0;
		}
		////Global Variable and Static Variables in C# (difference)
		int x = 0;
		public int funTest2(int num)
		{
			//public static int x = 0;
			if(num > 0)
			{
				x++;
				return (funTest2(num-1)+x);

			}
			return 0;
		}

		//Sum of first 'n' natural numbers - n(n-1)/2
		public int sum(int num)
		{
			if(num > 0)
			{
				return (num+sum(num-1));
			}
			return 0;
		}

		//Power function
		public int pow(int m, int n)
		{
			if(n==0)
				return 1;
			if(n%2 == 0)
			{
				return pow(m*m, n/2);
			}
			else
				return pow(m*m, (n-1)/2)*m;
		}


	}
}






























