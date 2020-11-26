/**
 * 
 */

var nums = [1,3,5,6];
var target = 4;
function searchInsertPosition(nums, target){
	 let i=0;
	 while(i<nums.length&&nums[i]<=target){
		 if(nums[i]==target)
			 return i;
	     	i++;
	  	}
	  	return i;
}

console.log(searchInsertPosition(nums, target));