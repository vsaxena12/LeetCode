/**
 * Iteration Method
 */
var num = 6;
function fibo(num){
	let f1 = 0;
	let f2 = 1;
	let count = 0;
	console.log("Iteration Method");
	console.log(0+"\n"+1);
	
	for(let i = 0; i<num - 2; i++){
		count = f1 + f2;
		f1 = f2;
		f2 = count;
		console.log(count);
	}
}

fibo(num);

let num2 = 6;
console.log("Recursion Method");
function fiboRecursion(num2){
	console.log("Check the number: "+num2);
	if(num2 == 0 || num2 == 1){
		return num2;
	}
	
	return (fiboRecursion(num2 - 1) + fiboRecursion(num2 - 2));
}
for(i = 0; i<num2; i++){
	console.log(fiboRecursion(i));

}

/*
let i = 0;
for(i = 0; i < num2; i++){
	console.log(fiboRecursion(num2));
}
*/