/**
 * Dynamic Programming 
 */

var rob = function(nums) {
    if (nums.length == 0) 
        return 0;
    let memo = [];
    memo[0] = 0;
    memo[1] = nums[0];
    for (let i = 1; i < nums.length; i++) {
        let val = nums[i];
        memo[i+1] = Math.max(memo[i], memo[i-1] + val);
    }
    return memo[nums.length];
};

console.log(rob);
//121. Best Time to Buy and Sell Stock
//198. House Robber