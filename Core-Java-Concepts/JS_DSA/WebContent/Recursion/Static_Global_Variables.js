/**
 * 
 */

let a = 5;
var x = 0; //global calls
function fun(n){
	//static 
	
	if(n>0){
		//console.log(n);
		x++;
		return (fun(n-1)+x);
	}
	return 0;
}
var r = fun(a);
console.log(r);

r = fun(a);
console.log(r);