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
		LinkedListInsert<String> linkedList = new LinkedListInsert<String>();
		linkedList.insertAtEnd("Hi");
		linkedList.insertAtEnd("I");
		linkedList.insertAtEnd("am");
		linkedList.insertAtEnd(".");
		//linkedList.printNodeAtEnd();
		linkedList.insertAtEnd("How");
		linkedList.insertAtEnd("About ");
		//linkedList.printNodeAtEnd();
		linkedList.insertAtHead("you");
		//linkedList.printNodeAtEnd();
		linkedList.insertAtGivenIndex("good",3);
		linkedList.printNodeAtEnd();
		linkedList.deleteNodeAtHead();
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