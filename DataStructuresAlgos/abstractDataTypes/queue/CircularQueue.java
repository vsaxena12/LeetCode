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
		{
			System.out.println("Cannot Enter the Data");
		}
		
		else
		{
			rear = (rear+1)%maxSize;
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
			front = (front+1)%maxSize;
			//T del = queueArray[front];
		}
		
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
		if((rear+1)%maxSize == front)
			return true;
		else
			return false;
	}
	
	public void print()
	{
		int i = front+1;
		
		do {
			System.out.print(queueArray[i]+" ");
			i = (i+1)%maxSize;
		}
		while(i != (rear+1)%maxSize);
		
		System.out.println("\n-----------------------------------");
	}
	
	public void printRecentlyDeletedElement()
	{
		System.out.println(queueArray[front]);
	}

}
