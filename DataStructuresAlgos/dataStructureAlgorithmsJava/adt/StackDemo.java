package adt;

class Stack
{
	int maxSize;
	long stackArray[];
	int top;
	
	Stack(int size)
	{
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}
	
	public long push(long num)
	{
		top++;
		stackArray[top] = num;
		return stackArray[top];
	}
	
	public long pop()
	{
		int old_pop = top;
		top--;
		return stackArray[old_pop];
	}
	
	public long peak()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (maxSize-1 == top);
	}
	
	void print()
	{
		for(int i = 0; i<stackArray.length; i++)
		{
			System.out.println(stackArray[i]);
		}
	}
	
}

public class StackDemo {
	public static void main(String args[])
	{
		Stack stack = new Stack(5);
		stack.print();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.print();
		stack.pop();
		stack.isFull();
		stack.push(10);
		stack.push(20);
		stack.print();
		stack.isFull();
		stack.pop();
		stack.push(30);
		
	}
}
