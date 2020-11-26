/**
 * 
 */

function arrays(){
	var arr = ["juice", "apple", "cheese", "kale", "mango", "grapes", "eggs", "bread"];
	var int = [10,23,53,55,23,67,87,12];
	
	for(var i = 0; i<int.length; i++){
		if(int[i] > 50)
			console.log(arr[i]+" "+int[i]);
	}
	/*
	arr.push("beer");
	console.log(arr);

	arr.pop();
	console.log(arr);
	
	arr.shift();
	console.log(arr);
	
	arr.unshift("oranges");
	console.log(arr);
	*/
	arr.splice(2,0,"chicks");
	int.splice(2,0,"51");
	console.log(arr+" "+int)
}

arrays();