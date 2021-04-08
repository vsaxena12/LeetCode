package Hashmap.LeetCodePro

class TwoSum 
{
    //Improved Version - O(n)
    public int[] twoSum(int[] nums, int target) 
    {
        int twoSums[] = new int[2];
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int result[] = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int compliment = target - nums[i];
            
            if(hmap.containsKey(compliment))
            {
                result[0] = hmap.get(compliment);
                result[1] = i;
            }
            hmap.put(nums[i], i);
            
        }
        
        return result;
        
    }


    //Brute Force Algo - O(n^2)
    public int[] twoSum(int[] nums, int target) 
    {
        int sums[] = new int[2];
        
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    sums[0] = i;
                    sums[1] = j;
                }
            }
        }
        
        return sums;
    }
}