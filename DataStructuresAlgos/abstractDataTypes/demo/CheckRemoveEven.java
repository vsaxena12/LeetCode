package demo;

public class CheckRemoveEven {
	public static int[] removeEven(int[] arr) {
		int j = 0;
		for(int i = 0 ; i<arr.length; i++)
		{
			if(arr[i]%2 != 0)
			{
				arr[j] = arr[i];
				j++;
			}
		}
		return arr; // change this and return the correct result array
	}
}
