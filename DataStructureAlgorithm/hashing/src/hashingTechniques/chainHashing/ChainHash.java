package hashingTechniques.chainHashing;


class Node<T> //Why can't I use public keyword here? class Node is public, should be declared in a file named LinkedList.java
{
	T data; //Int, String, Char
	Node next;
	Node(T data)
	{
		this.data = data;
	}	
}

class LinkedList<T> //Why? class LinkedList is public, should be declared in a file named LinkedList.java
{
	Node head = null;

	public void insertNode(T data)
	{
		Node new_Node = new Node(data);
		if(head == null)
		{
			head = new_Node;
		}

		else
		{
			Node temp = head;
			/*for(int i=0; i<key-1; i++) //traversing to reach a given index
			{
				temp = temp.next; //get the address of the node and pass it to the next node
			}*/
			//new_Node.next = temp.next;

			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new_Node;
		}

	}

	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(""+temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}




public class ChainHash
{
	public int hash(int key)
	{
		return key%10;
	}

	public void hashingUsingChain()
	{
		LinkedList<String> hashString = new LinkedList<String>();
		hashString.insertNode("One");
		hashString.insertNode("Two");
		hashString.insertNode("Three");
		hashString.insertNode("Four");
		hashString.print();


		LinkedList<Integer> hashInt = new LinkedList<Integer>();
		hashInt.insertNode(5);
		hashInt.insertNode(6);
		hashInt.insertNode(7);
		hashInt.insertNode(8);
		hashInt.print();
	}
}







