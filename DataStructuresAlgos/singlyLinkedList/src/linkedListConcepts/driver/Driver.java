package linkedListConcepts.driver;

import linkedListConcepts.nodeLinkedList.Node;
import linkedListConcepts.nodeLinkedList.LinkedListInsert;

public class Driver
{
	//static Node head; //It is a reference pointer
	public static void main(String args[]) //Point of Execution
	{
		insertLinkedListCode();

	}

	public static void insertLinkedListCode()
	{
		Node head = null;
		System.out.println("Head: "+head);
		
		System.out.println("Starting LinkedList");
		LinkedListInsert linkedList = new LinkedListInsert();
		linkedList.insertAtEnd(10);
		linkedList.insertAtEnd(40);
		linkedList.insertAtEnd(30);
		linkedList.insertAtEnd(60);
		linkedList.printNodeAtEnd();
		linkedList.insertAtEnd(40);
		linkedList.insertAtEnd(80);
		linkedList.printNodeAtEnd();
		linkedList.insertAtHead(50);
		linkedList.printNodeAtEnd();
		linkedList.insertAtGivenIndex(20,3);
		linkedList.printNodeAtEnd();


		/*
		Node head = null;
		System.out.println("Head: "+head);
		
		System.out.println("Starting LinkedList");
		LinkedList linkedList = new LinkedList();
		linkedList.insertNode(10);
		linkedList.insertNode(40);
		linkedList.insertNode(30);
		linkedList.insertNode(60);
		linkedList.insertNode(40);
		linkedList.insertNode(80);
		linkedList.insertNode(50);
		linkedList.insertNode(20);
		linkedList.printNode();

		//linkedList.countNodes(xyz);
		//linkedList.sumOfNodes(head);
		//linkedList.maxElement(head);
		Node temp = null;
		temp = linkedList.linearSearch(head,40);
		System.out.println(temp.data);

		temp = linkedList.moveNodeToFront(head,30);
		linkedList.printNode();
		System.out.println(temp.data);

		temp = linkedList.moveNodeToFront(head,20);
		linkedList.printNode();
		*/
	}
}