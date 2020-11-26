/**
 *	Recursion 
 */
//Armstrong number
//Fibonacci series
//Palindrome Number and Elements
//Factorial numbers

console.log("Recursive Factorial");
var num = 5;
function factorial(num){
	if(num === 0)
		return 1;
	if(num === 1)
		return num;
	return (num * factorial(num - 1));
}
console.log("Recursive function: "+factorial(num));

console.log("Recursive Armstrong");
var numArmstrong = 153;
function armstrong(numArmstrong){
	return numArmstrong;
}
console.log("Recursive Armstrong: "+armstrong(numArmstrong));


var x = 10;
function recur(x){
	if(x > 0){
		
		//return x;
		//console.log("Recursive Call: "+x); //Calling time - Ascending
		recur(x-1);
		console.log("Recursive Call: "+x); //Returning time - Descending
	}
}

recur(x);