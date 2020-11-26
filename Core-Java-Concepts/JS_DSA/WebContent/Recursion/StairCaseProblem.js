/**
 * 
 */

/*let n = 2;
function funFibo(n){
	if( n === 1)
		return n;
	else{
		return (funFibo(n-1)+funFibo(n-2));
	}
	
}

var ans = funFibo(n);
console.log(ans);
*/

let n = 5;
function findThreeStep(n) 
{ 
     if (n == 1 || n == 2)  
          return n; 
     else if (n == 3)  
          return 4; 
      
     else
          return (findThreeStep(n - 3) +  findThreeStep(n - 2) + findThreeStep(n - 1));     
}  
console.log(findThreeStep(n)); 


/*let num2 = 5;
console.log("Recursion Method");
function fiboRecursion(num2){
	//console.log("Check the number: "+num2);
	if(num2 == 1 || num2 == 2){
		return num2;
	}
	
	return (fiboRecursion(num2 - 1) + fiboRecursion(num2 - 2));
}

console.log(fiboRecursion(num2));
*/

/*
//Iteration Problem
var climbStairs = function(n) {
    if(n == 1 || n == 2)
        return n;
    let f1 = 1;
    let f2 = 2;
    
    for(let i = 3; i <= n; i++){
        let f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
    }
    return f2;
};

*/