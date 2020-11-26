/**
 * Creation of Objects
 */

var user ={
		name: "Varun",
		age: 26,
		email: "vsaxena1@binghamton.edu",
		car: "Mercedes-Benz",
		isMarried: false
};

console.log("Original: "+user.car);
user.car = "Lamborghini";
console.log("Update: "+user.car);

console.log("Original: "+user.isMarried);
user.isMarried = true;
console.log("Update: "+user.isMarried);

//pop, push, concat

user.favFood = "Pav-Bhaji"; //Push
user.spells = ["abrakadabra", "shazam", "khuljasimsim"];
console.log(user);
console.log("Spells are: "+user.spells);

var i = 0;
for(i = 0; i<user.spells.length; i++)
{
	if(i === 1){
		console.log(user.spells[i]);
	}
	else{
		console.log("Add the spell ");
		
		
	}
}

//Order matters: 
//user.spells[0]; --> Arrays within objects
//list[0].passwords; --> Objects within arrays
var list = [
	{
		username: "user1",
		password: "password1"
	},
	{
		username: "user2",
		passwords: "password2"
	},
	{
		username: "user3",
		password: "password3"
	},
	{
		username: "user4",
		passwords: "password4"
	}
];

console.log(list);

//function within the objects

user.shout = function(){
		console.log("I Love You");
};

console.log(user);
console.log(user.shout());