package WrapperClasses;

public abstract class Display extends WrapClasses{
	public void integer() {
		Integer integer1 = new Integer(100);
		System.out.println(integer1);
		Integer integer2 = new Integer("100");
		System.out.println(integer2);
		//Integer integer3 = new Integer("A");
		//System.out.println(integer3);
	}
	
	public void floatInt() {
		
	}
	
	public void charChar() {
		
	}
	
	public abstract void display();
}
