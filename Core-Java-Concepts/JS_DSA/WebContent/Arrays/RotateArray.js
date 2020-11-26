/**
 * 
 */

var nums = [1,2];
var k = 7;
function shiftArray(nums, k){
	let n = -1;
	for(let i = 0; i<k; i++){
		if(n != k){
			let store = nums[nums.length - 1];
			console.log(store);
			nums.pop();
			nums.unshift(store);
			console.log(nums);
			n++;
			
		}
		
	}
	return nums;
}

console.log(shiftArray(nums,k));