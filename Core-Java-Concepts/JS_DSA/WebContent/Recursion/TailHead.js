/**
 * 
 */

var x = 3;
console.log("Tail");
function fun1(n){
	
	if(n>0){
		console.log(n); //Tail Recursion - Calling time
		fun1(n-1);
		/*
		 * while(n>0){
		 * 		console.log(n);
		 * 		n--;
		 * }
		 * Time Complexity is same
		 * Space Complexity: O(n) - recursion
		 * Space Complexity: O(1) - Loop
		 */
	}
}
fun1(x);

console.log("Head");
function fun2(n){
	
	if(n>0){
		fun2(n-1);
		console.log(n); //Head Recursion - returning time
		/* i = 1;
		 * while(i<=n){
		 * 		console.log(i);
		 * 		i++;
		 * }
		 * Time Complexity is same
		 * Space Complexity: O(n) - recursion
		 * Space Complexity: O(1) - Loop
		 */
	}
}
fun2(x);