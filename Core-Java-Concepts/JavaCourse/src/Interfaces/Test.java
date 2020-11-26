package Interfaces;

public class Test {
	String name;
	int id;
	Test(String name, int id){
		this.name = name;
		this.id = id;
		System.out.println(name+" "+id);
	}
	public void print() {
		System.out.println("Hello");
	}
}