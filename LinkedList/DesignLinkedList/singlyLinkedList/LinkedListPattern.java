package singlyLinkedList;

import node.Node;

public class LinkedListPattern 
{
	Node head;
	
	//Insertion
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = node;
		}
		//System.out.println("Code Breaks");
	}
	
	//Search
	public boolean search(int key)
	{
		Node temp = head;
		//System.out.println("Code Breaks");
		while(temp != null)
		{
			if(temp.data == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//Insertion At Head Node
	public void insertAtHead(int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        
        new_node.next = head;
  
        head = new_node;
    }
	
	//Insert At Any Node
	public void insertAfter(int position, int new_data)
    {	
        Node nodeAt = new Node();
        nodeAt.data = new_data;
        int count = 1;
        if(head == null && position == 1)
        {
    	    System.out.println("head cannot be null");
    	    //count = 1;
        }
        
       
        Node temp = head;
        while(count<position-1)
        {
    	    temp = temp.next;
    	    count++;
        }
       
        Node current = temp.next;
        nodeAt.next = current;
        temp.next = nodeAt;
       
    }
	
	
	
	
	//Print
	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println("Linked List: "+temp.data);
			temp = temp.next;
		}
	}

}
