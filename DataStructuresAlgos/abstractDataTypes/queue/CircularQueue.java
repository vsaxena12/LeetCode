package queue;

public class CircularQueue<T> {
	
	private T queueArray[];
	private int rear;
	private int front;
	private int maxSize;
	
	//private int currentSize;
	
	@SuppressWarnings("unchecked")
	CircularQueue(int maxSize)
	{
		this.maxSize = maxSize;
		this.queueArray = (T[])new Object[maxSize];
		this.rear = 0;
		this.front = 0;
	}
	
	public void enqueue(T data)
	{
		if(isFull())
			System.out.println("Cannot Enter the Data");
		else
			//System.out.print("Enter the Value: ");
			rear++;
			queueArray[rear] = data;
	}
	
	public void dequeue()
	{
		if(isEmpty())
			System.out.println("Queue is Empty");
		else
			front++;
			T del = queueArray[front];
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
		for(int i = front+1; i<queueArray.length; ++i)
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
