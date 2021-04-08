package WindowSliding.driver;
import WindowSliding.ProblemStatements.AverageOfSubarrayOfSize;


public class Driver
{
	public static void main(String[] args) 
	{
    	System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
    	System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
    	System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));
  	}

  	
	public static void main(String args[])
	{
		System.out.println("Test");

		AverageOfSubarrayOfSize result = new AverageOfSubarrayOfSize();
		result.result();
	}
}