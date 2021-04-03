package WindowSliding.ProblemStatements; 

//Need to discuss
public class MinSizeSubArraySum
{
	public int minSubArrayLen(int target, int[] nums) 
	{
        int startWindow = 0;
        int endWindow = 0;
        int sum = 0;
        int result[] = new int[endWindow - startWindow + 1];
        
        int count = 0;
        
        for(endWindow=0; endWindow<nums.length; endWindow++)
        {
            sum = sum + nums[endWindow];
            
            //sum>target => startWindow++ =>
            while(sum >= target)
            {
                sum = sum - nums[startWindow];
                startWindow++;   
            }
            
        } 
        
        if(sum<=target)
            return 0;
        else
            return count = endWindow - startWindow + 1;
        
        //return count;
    }	
}