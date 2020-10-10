package queue;

public class Queue<T>
{
	private T queueArray[];
	private int rear;
	private int front;
	private int maxSize;
	//private int currentSize;
	
	@SuppressWarnings("unchecked")
	Queue(int maxSize)
	{
		this.maxSize = maxSize;
		this.queueArray = (T[])new Object[maxSize];
		this.rear = -1;
		this.front = -1;
	}
	
	public void enqueue(T data)
	{
		if(isFull())
		{
			System.out.println("Cannot Enter the Data");
		}
		
		else
		{
			rear++;
			queueArray[rear] = data;
		}
	}
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			front++;
			//T del = queueArray[front];
		}
		
	}
	
	public T returnDeletedElement()
	{
		T del = queueArray[front];
		return del;
	}
	
	public boolean isEmpty()
	{
		if(front == rear)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(rear == maxSize-1)
			return true;
		else
			return false;
	}
	
	public void print()
	{
		for(int i = front+1; i<rear; i++)
		{ 
			System.out.print(queueArray[i]+" ");
		}
		System.out.println("\n-----------------------------------");
	}
	
	public void printRecentlyDeletedElement()
	{
		System.out.println(queueArray[front]);
	}
	
	
}