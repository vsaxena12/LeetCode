package LinkedList;

/*
 * Define a node
 */
/*
class Node
{
	int data;
	Node next;
}

Node dummy = new Node();
dummy.data = -1;

void add(Node dummy, int value)
{
	while(dummy.next != null)
	{
		dummy = dummy.next;
	}

	Node newNode = new Node(value);
	dummy.next = newNode;
}
*/
/*
class Node//String function in java
{
	int data;
	Node next = null;
}

public class SinglyLinkedList {
	static Node head = null; //Defining the head
	
	public static void insert(int num)
	{
		//Head is pointing to null
		System.out.println("Before everything: "+head);
		Node node = new Node(); //Declaring a node
		System.out.println("Before Initializing Node: "+node.data);
		System.out.println("Before Initializing Node: "+node.next);
		node.data=num; //this node will store numbers
		System.out.println("After Initializing Node1: "+node.data);
		System.out.println("After Initializing Node1: "+node.next);

		//System.out.println("Head Count: "+head.data);
		if(head == null)
		{
			head = node;
			System.out.println("Head: "+head.data);
		}
		else
		{
			System.out.println("Previous Head: "+head.data);
			Node n = head;
			System.out.println("Later Head: "+head.data);
			while(n.next!=null)
			{
				n = n.next;
			}
			
			n.next = node;	
		}
	}
	
	static void display()
	{
		Node node = head;
		
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	public static void main(String[] args)
	{
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(45); //Enter the first element in the node
		list.insert(12);
		list.insert(22);
		list.insert(55);
		list.insert(14);
		list.insert(55);
		list.insert(90);
		list.insert(83);

		list.display();
	}
}
*/