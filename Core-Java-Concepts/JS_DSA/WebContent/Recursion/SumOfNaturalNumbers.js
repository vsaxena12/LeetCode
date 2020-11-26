/**
 * 
 */

let num = 5;
function sumValue(n){
	if(n == 0)
		return n;
	else
		return (n + sumValue(n-1)); // [n*(n+1)/2] -> O(1)
}

let sum = sumValue(num);
console.log(sum);