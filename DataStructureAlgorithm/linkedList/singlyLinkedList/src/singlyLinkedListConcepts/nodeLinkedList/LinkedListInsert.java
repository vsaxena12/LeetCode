package linkedListConcepts.nodeLinkedList;

public class LinkedListInsert<T>
{
	public Node head = null;

	//Insert the Node at the End - 
	public void insertAtEnd(T data)
	{
		Node node = new Node(data);

		if(head == null)
		{
			head = node;
		}
		else
		{
			Node temp = head;

			while(temp.getNode() != null)
			{
				temp = temp.getNode();
			}
			temp.setNode(node); //Insert a new Node 

		}
	}

	//Insert Node at Head
	public void insertAtHead(T data) //takes constant time 
	{
		Node nodeToHead = new Node(data);
		if(head == null)
		{
			head = nodeToHead;
		}
		else
		{
			nodeToHead.setNode(head); //Insert or adding a new node - pointing to the head
			head = nodeToHead;
		}

	}

	//Insert at given Node/ Index
	public void insertAtGivenIndex(T data, int index)
	{
		Node nodeAtIndex = new Node(data);
		if(head == null)
		{
			head = nodeAtIndex;
		}
		else
		{
			Node temp = head;
			for(int i=0; i<index-1; i++) //traversing to reach a given index
			{
				temp = temp.getNode(); //get the address of the node and pass it to the next node
			}

			nodeAtIndex.setNode(temp.getNode());
			temp.setNode(nodeAtIndex);

		}
	}

	//Delete a Node 
	public void deleteNodeAtHead()
	{
		Node returnDeletedHead = null;
		if(head == null)
		{
			System.out.println("Linked List is Empty");
			return;
		}

		else
		{
			Node temp = head;
			returnDeletedHead = head;
			head = temp.getNode();
		}
		System.out.println("Deleted Head: "+returnDeletedHead.getData());
		System.out.println("Current Head: "+head.getData());
		System.out.println("--------------------------------*END*--------------------------------");

	}


	public void printNodeAtEnd()
	{
		Node temp = head;

		while(temp != null)
		{
			System.out.println(temp.getData()+" -> "+temp.getNode());
			temp = temp.getNode();
		}
		System.out.println("--------------------------------*END*--------------------------------");
	}

}
