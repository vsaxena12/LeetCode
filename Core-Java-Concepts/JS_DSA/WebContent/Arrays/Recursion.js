/**
 * 
 */
let counter = 0;
function recursion(){
	console.log(counter);
	if(counter>3)
	{
		return 0;
	}
	counter++;
	console.log("Hello?");
	recursion();
	
}

recursion()