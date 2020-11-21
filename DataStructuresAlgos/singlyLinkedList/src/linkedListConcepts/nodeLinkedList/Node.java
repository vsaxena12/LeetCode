package linkedListConcepts.nodeLinkedList;

public class Node 
{
	private int data;
	private Node next;
	
	public Node(int data){
		this.data = data;
		next = null;

	}

	public void setData(int data)
	{
		this.data = data;
	}

	public int getData()
	{
		return data;
	}

	public void setNode(Node next)
	{
		this.next = next;
	}

	public Node getNode()
	{
		return next;
	}

}

