/**
 * 
 */
//n! = 1*2*3*4*......

var num = 5;
function factRecur(n){
	if(n == 0)
		return 1;
	else if( n == 1)
		return n;
	else if(n > 1)
		return (n*factRecur(n-1));
	else
		return 0;
}

var fact = factRecur(num);
console.log(fact);