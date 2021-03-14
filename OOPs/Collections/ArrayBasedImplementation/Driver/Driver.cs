using System;



namespace OOPs.Collections.ArrayBaseImplementation
{
	public class Driver
	{
		public static void Main(string[] args)
		{
			CustomArrayList<string> customArrayList = new CustomArrayList<string>();
		
			customArrayList.Add("Milk");
			customArrayList.Add("Bread");
			customArrayList.Add("Honey");
			customArrayList.Add("Coffee");
			customArrayList.Add("Pen");
			customArrayList.Insert(2,"Beer");
			
			customArrayList.print();
			customArrayList.Clear();
			customArrayList.print();
			

		}
	}
}
