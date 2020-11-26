/**
 * 
 */

var num = 2;
var pow = 4;
function powFun(m,n){
	if(n == 0)
		return 1;
	return powFun(m,n-1) * m;
	//pow(m,n) = pow(m,n-1)*m; 
	
}

/*
 * pow(m,n){
 * 		if(n == 0)
 * 			return 1;
 * 		if(n%2 == 0)
 * 			return pow(m*m,n/2);
 * 		else
 * 			return m*pow(m*m,(n-1)/2);
 * }
 */

var value = powFun(num,pow);
console.log(value);