using System;

namespace DataStructuresWithAlgorithms.educative.arrays
{
    class RemoveInteger {
	    public static int[] removeEven(int[] arr) 
        {
		    // Write - Your - Code- Here
		    int oddNumber = 0;
		    for(int i=0; i<arr.Length; i++)
		    {
			    if(arr[i]%2 != 0)
			    {
				    arr[oddNumber++] = arr[i];
			    }
		    }
		    return arr; // change this and return the correct result array
	    }

        public static void Main(string[] args)
        {   
            int size = 10;
    		int[] arr = new int[size]; //declaration and instantiation 
  
    		Console.WriteLine("Before removing Even Numbers: "); 
    		for (int i = 0; i < arr.Length; i++) {
      			arr[i] = i; // assigning values
      			Console.WriteLine(arr[i] +  " ");
   			}
    		Console.WriteLine();
  
    		int[] newArr =  removeEven(arr); // calling removeEven
  
    		Console.WriteLine("After removing Even Numbers: "); 
			for (int i = 0; i < newArr.Length; i++) {
				Console.WriteLine(newArr[i] +  " "); // prinitng array
			}
        }

		
    }
}