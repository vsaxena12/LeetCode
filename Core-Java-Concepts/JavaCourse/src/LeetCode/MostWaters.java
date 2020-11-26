package LeetCode;
import java.util.Scanner;
public class MostWaters {

	//brute force
	/*
	public static int maxArea(int[] height) 
	{
		int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
        return maxarea;
    
	}
	*/
	//No-brute force
	public static int maxArea(int[] height) 
	{
		int maxarea = 0;
		int check = 0;
		int length = height.length;
		System.out.println("Length of the Array: "+length);
		//Assuming: distance between two poles in 1 unit distance
		int breadth = length - 1;
		System.out.println("Breadth of the Array: "+breadth);
		for(int j = 0; j<length; j++)
		{
			System.out.println("Breadth: "+height[j]);
			//breadth--;
		
			for(int i = j+1; i<length; i++)
			{
				if(height[i] < height[j])
				{
					check = height[i] * breadth;
					System.out.println("Height: "+height[i]);
					System.out.println("breadth: "+breadth);
					System.out.println("area: "+check);
				
				}
				
				else
				{
					height[i] = height[j];
					//System.out.println("Update: "+height[i]);
					check = height[i] * breadth;
					System.out.println("Updated Height: "+height[i]);
					System.out.println("breadth: "+breadth);
					System.out.println("area: "+check);
				}
			
				if(maxarea < check)
				{
				maxarea = check;
				}
				breadth--;
				System.out.println("New Maxarea: "+maxarea);
			}
		}
		return maxarea;
    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Integer Array");
		Scanner scan = new Scanner(System.in);
		int[] nums = {2,3,4,5,18,17,6};
		System.out.println(maxArea(nums));
	}

}
