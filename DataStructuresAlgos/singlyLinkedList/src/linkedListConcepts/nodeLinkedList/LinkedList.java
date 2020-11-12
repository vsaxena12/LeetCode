package linkedListConcepts.nodeLinkedList;

import linkedListConcepts.nodeLinkedList.Node;

public class LinkedList
{
	Node head = null;
	public void addLinkedList(int data)
	{	
		Node node = new Node();
		node.data = data;
		node.next = null;
		int count = 0;
		if(head == null)
		{
			head = node;
			
			//System.out.println("Node.data -> "+node.data+" Node.next -> "+node.next);
			//System.out.println("head.data -> "+head.data+" head.next -> "+head.next);
				
		}

		else
		{
			Node newNode = head;
			//System.out.println("Node.data -> "+node.data+" Node.next -> "+node.next);
			//System.out.println("head.data -> "+head.data+" head.next -> "+head.next);
			while(newNode.next != null)
			{
				//System.out.print(newNode.data+" ");

				newNode = newNode.next;
				//System.out.println("Node.data -> "+node.data+" Node.next -> "+node.next);
				//System.out.println("head.data -> "+head.data+" head.next -> "+head.next);
				
			}
			newNode.next = node;
			
				
		}
		//System.out.println(count);
	}

	public void printNode()
	{
		Node newNode = head;
		while(newNode != null)
		{
			System.out.println("Node.data -> "+newNode.data+" Node.next -> "+newNode.next);
			newNode = newNode.next;
			
		}
		System.out.println();
	}
}