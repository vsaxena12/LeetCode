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

        

		
    }
}