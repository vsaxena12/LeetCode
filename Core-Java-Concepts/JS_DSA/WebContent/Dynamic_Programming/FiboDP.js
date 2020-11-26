/**
 * https://www.youtube.com/watch?v=8LusJS5-AGo&list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr
 * 
 */
/*
let num = 5;
let result = 0;
function fibo(num){
	if(num == 1 || num == 2)
		result = num;
		
	else
		result = (fibo(num - 1) + fibo(num - 2));
	return result;

	
}

console.log(fibo(num));
*/

//Bottom Up: Dynamic Programming
let num = 9;
let fibo = []; //Important Step
function fiboDP(n){
	fibo[0] = 0;
	fibo[1] = 1;
	console.log("f[0]: "+fibo[0]+"\n"+"f[1]: "+fibo[1]);
	for(let i = 2; i<=n; i++){
		fibo[i] = fibo[i - 1] + fibo[i - 2];
		console.log("f["+i+"]: "+fibo[i]);
	}
	return fibo[n];
}

console.log("Final Output: "+fiboDP(num));

/*
//Dynamic Programming
var climbStairs = function(n) {
    let fibo = [];
    //fibo[0] = 0;
    if(n === 1)
        return 1;
    fibo[1] = 1;
    fibo[2] = 2;
       
    for(let i = 3; i<=n; i++){
        fibo[i] = fibo[i-1] + fibo[i-2];
        
    }
    return fibo[n];
};





*/