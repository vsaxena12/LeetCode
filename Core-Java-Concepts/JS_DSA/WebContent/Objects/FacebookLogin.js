/**
 * 
 */

var userLogin = [
	{
		username: "vsaxena1",
		password: "password@123"
	}
];
var newsFeed = [
	{
		username: "Bobby",
		timeline: "So tired from all that learning!"
	},
	{
		username: "Sally",
		timeline: "Javascript is sooooo cool!"
	},
	{
		username: "Mitch",
		timeline: "Javascript is preeetyy cool!"
	}
];

var username = prompt("What is your name");
var password = prompt("What is your password");

function checkLogin(user, pwd){
	if(user === userLogin[0].username && pwd === userLogin[1].password)
	{
		console.log(newsFeed);
	}	
	else{
		console.log("Try Again");
	}
};

checkLogin(username, password);