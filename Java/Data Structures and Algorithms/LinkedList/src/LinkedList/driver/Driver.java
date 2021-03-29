package LinkedList.driver;
import LinkedList.singlyLinkedList.SinglyLinkedList;
import LinkedList.singlyLinkedList.ReverseLinkedList;

class Driver
{
	public static void main(String[] args)
	{
		SinglyLinkedList sLL = new SinglyLinkedList();
		
		sLL.insert(10);
		sLL.insert(20);
		sLL.insert(30);
		sLL.insert(40);
		sLL.insert(50);

		sLL.print();


		ReverseLinkedList reverse = new ReverseLinkedList(); //reverseLinkedList();
		reverse.reverseLinkedList();
		
	}
}