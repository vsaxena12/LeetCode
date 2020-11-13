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

				newNode = newNode.next; //use for traversing
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

	//Count Number of Nodes
	public void countNodes(Node countTemp)
	{
		countTemp = head;
		int count = 0;
		while(countTemp != null)
		{
			count++;
			countTemp = countTemp.next;
		}
		System.out.println("Count Nodes: "+count);
	}

	//Sum of Nodes
	public void sumOfNodes(Node addNodeTemp)
	{
		System.out.println("AddNodeTemp: "+addNodeTemp);
		
		addNodeTemp = head; //addNodeTemp is no longer null
		System.out.println("AddNodeTemp: "+addNodeTemp.data+" -> "+addNodeTemp.next);

		int sum = 0;
		while(addNodeTemp != null)
		{
			sum = sum + addNodeTemp.data;
			addNodeTemp = addNodeTemp.next;
		}
		System.out.println("Sums Nodes: "+sum);
	}

	//Maximum Element
	public void maxElement(Node maxNode)
	{
		maxNode = head;
		int maxValue = Integer.MIN_VALUE;
		System.out.println("Default Max Value: "+maxValue);

		while(maxNode != null)
		{
			if(maxNode.data >= maxValue)
			{
				maxValue = maxNode.data;
				System.out.println("Max Element Traversal: "+maxValue);
			}
			maxNode = maxNode.next;
		}

		System.out.println("Max Element: "+maxValue);

	}



}
















