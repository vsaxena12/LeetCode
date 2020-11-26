package JavaBasics;
public class Constructors {
	int id;
	String name;
	String sal;
	//cannot use instance variables directly
	
	Constructors(int id, String name)//Number of parameters decides the constructor or method to be called 
	{
		this.id = id;//current object reference
		this.name = name;
	}
	
	Constructors(int id, String name, String sal){
		this(id,name);
		this.sal = sal;
		//recursive call constructor is not possible else it will lead to infinite loops
	}
	
}
