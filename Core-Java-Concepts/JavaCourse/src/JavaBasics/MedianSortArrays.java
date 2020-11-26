package JavaBasics;
import java.util.*;
import java.io.*;
public class MedianSortArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
	{
		String s1 = nums1.toString();
		String s2 = nums2.toString();
		String result = s1.concat(s2);
		int res = Integer.parseInt(result);
		System.out.println(result);
		double ans = 0;
		return ans;
	}
		    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Arrays");
		Scanner scan = new Scanner(System.in);
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2,4};

		System.out.println(findMedianSortedArrays(arr1, arr2));
	}

}
