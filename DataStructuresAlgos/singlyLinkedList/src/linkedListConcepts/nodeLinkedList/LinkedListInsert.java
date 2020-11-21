package linkedListConcepts.nodeLinkedList;

public class LinkedListInsert
{
	public Node head = null;

	//Insert the Node at the End - 
	public void insertAtEnd(int num)
	{
		Node node = new Node(num);

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
	public void insertAtHead(int num) //takes constant time 
	{
		Node nodeToHead = new Node(num);
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
	public void insertAtGivenIndex(int num, int index)
	{
		Node nodeAtIndex = new Node(num);
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
