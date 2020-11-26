/**
 * 
 */

//Iterative Number
/*
153 = 	1*1*1 -> 1
5*5*5 -> 125
3*3*3 -> 27
sum = 153
*/

let num = flag = 153;
let check = 0;
let store = 0;
console.log("Iteration Method");
function armstrongNumber(num){
	while(num > 0){
		check = num%10;
		store = store + check*check*check;
		num = parseInt(num/10);
		
	}
	console.log("num fun: "+num);
	console.log("flag: "+flag);
	if(store == flag)
		console.log("IsArmstrong");
	else
		console.log("IsNotArmstrong: "+store);
}
console.log("num: "+num);
armstrongNumber(num);