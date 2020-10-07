public class LeetCodeSol1 {
	public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2]; 
        //since there are only one solution
        //there will be only two numbers
        int k = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(target == nums[i]+nums[j])
                {
                  arr[k] = i;
                  k++;
                  arr[k] = j;
                }
            }
        }
        return arr;
    }
}
