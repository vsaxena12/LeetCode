/**
 * Datatypes, global and local variables 
 */
/*
let globalLet = "Hello To Global";
function local(){
	const localLet = "Hello To Local";
	localLet = "Hello To Local Update";
	//console.log("Global Variables");
	console.log(localLet);
}

local();
console.log(globalLet);
*/

/*
let globalLet = "This is a global variable"; 

function fun() { 
  let globalLet = "This is a local variable"; 
} 
fun(); 
console.log(globalLet); // This is a global variable 
*/

/*
//Global variables are attached to window object and thus we can access the global variable
let globalLet = "This is a global variable"; 

function fun() { 
  let globalLet = "This is a local variable"; 
  console.log(window.globalLet); // This is a global variable 
} 
fun();
*/

//var is function scoped and let is block scoped.
function fun(){ 
    if(true){ 
        var i = 100; 
    } 
    console.log(i); // i is not defined 
} 
fun(); 

var i = 2;
switch(i){
case 0:
		console.log("Value is 0");
		break;
case 9:
		console.log("Value is 9");
		break;
default: 
		console.log("Value is none");
		break;
}

var sum = 2;
var i = 0;
console.log("For Loop");
for(i = 0; i < 5; i++)
{
	//console.log(sum);
	sum = sum + i;
	console.log(sum);
}

var multiply = 2;
var j = 1;
console.log("While Loop");
while(j<5){
	multiply *= j;
	console.log(multiply);
	j++;
}

var multiplyDo = 2;
var k = 1;
console.log("Do-While Loop");
do{
	multiplyDo *= k;
	console.log(multiplyDo);
	k++;
}
while(k<5);

//creating an Object 
console.log("Looping Objects");
var languages = { first : "C", second : "Java",  
                  third : "Python", fourth : "PHP",  
                  fifth : "JavaScript" }; 

// iterate through every property of the 
// object languages and print all of them 
// using for..in loops 
for (itr in languages)  
{ 
	console.log(languages[itr]); 
}

console.log("Functions");
function sumFun(x1, y1)
{
	return (x1+y1);
}
var x = 10;
var y = 8;
console.log(sumFun(x,y));


function welcomeMsg(name) { 
	   console.log("Hello " + name + " welcome to GeeksforGeeks"); 
} 
	  
// creating a variable 
var nameVal = "Admin"; 
	  
// calling the function 
welcomeMsg(nameVal); 













