package stack;

public class Driver {
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>(5);
		stack.print();
		stack.push("Hi");
		stack.push("How");
		stack.push("are");
		stack.push("you");
		stack.print();
		stack.pop();
		stack.isFull();
		stack.push("10");
		stack.push("20");
		stack.print();
		stack.isFull();
		stack.pop();
		stack.push("30");
		stack.print();
		
	}
}
