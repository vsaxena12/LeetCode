package stack;

class Stack<T> //Use of Generic in Java
{
	private int maxSize;
	private T stackArray[];
	private int top;
	
	@SuppressWarnings("unchecked") //To Suppress the Warnings 
	Stack(int size)
	{
		this.maxSize = size;
		this.stackArray = (T[]) new Object[maxSize];
		this.top = -1;
	}
	
	public T push(T num)
	{
		top++;
		stackArray[top] = num;
		return stackArray[top];
	}
	
	public T pop()
	{
		int old_pop = top;
		top--;
		return stackArray[old_pop];
	}
	
	public T peak()
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
		for(int i = 0; i<stackArray.length; ++i)
		{
			System.out.print(stackArray[i]+" ");
		}
		System.out.println("\n-----------------------------------");
	}
	
}
