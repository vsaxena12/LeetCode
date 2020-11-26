package SingleLinkedList;

public class LinkedList {

	private Node head;
	public LinkedList(){
		
	}
	public boolean isEmpty() {
		
		return (head == null);
	}
	
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	public void display() {
		System.out.println("LinkedList");
		Node current = head;
		while(current != null)
		{
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	

}
