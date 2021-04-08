package WindowSliding.ProblemStatements;

class MaxSumSubArrayOfSizeK 
{
	public static int findMaxSumSubArray(int k, int[] arr) 
	{
	    // TODO: Write your code here
	    int windowEnd = 0;
	    int sum = 0;
	    int windowStart = 0;
	    int newSum = 0;
	    for(windowEnd=0; windowEnd<arr.length; windowEnd++)
	    {
	      	sum = sum + arr[windowEnd];
	      
	      	if(sum > newSum)
	      	{
	        	newSum = sum;
	      	}

	      	if(windowEnd >= k-1)
	      	{
	       	 	sum = sum - arr[windowStart];
	        	windowStart++;
	      	}
	    }

	    return newSum;
	}
}