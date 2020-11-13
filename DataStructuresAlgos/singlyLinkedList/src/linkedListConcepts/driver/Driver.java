package linkedListConcepts.driver;

import linkedListConcepts.nodeLinkedList.Node;
import linkedListConcepts.nodeLinkedList.LinkedList;

public class Driver
{
	public static void main(String args[]) //Point of Execution
	{
		Node head = null;
		System.out.println("Head: "+head);
		
		System.out.println("Starting LinkedList");
		LinkedList linkedList = new LinkedList();
		linkedList.addLinkedList(10);
		linkedList.addLinkedList(40);
		linkedList.addLinkedList(30);
		linkedList.addLinkedList(60);
		linkedList.addLinkedList(40);
		linkedList.addLinkedList(80);
		linkedList.addLinkedList(50);
		linkedList.addLinkedList(20);
		linkedList.printNode();

		linkedList.countNodes(head);
		linkedList.sumOfNodes(head);
		linkedList.maxElement(head);
	}
}