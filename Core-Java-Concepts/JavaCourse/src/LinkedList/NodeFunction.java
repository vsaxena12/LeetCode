package LinkedList;

class NodeF {
	public int data;
	/*
	 * next is the pointer calling or referencing to itself.
	 * Self referential Node
	 * Referencing of type itself
	 * Node is created inside a heap -> Node a = new Node();
	 * 
	 */
	public NodeF next = null; //referencing itself
	
	public void displayNode()
	{
		System.out.println(data);
	}
}

public class NodeFunction {
	
	public static int lengthNode(Node oNode) {
		int length = 0;
		Node currentNode = oNode;
		System.out.println(oNode.data);
		
		while(currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		
		return length;
	}
	
	public static void main(String[] args)
	{
		Node node1 = new Node();
		node1.data = 22;
		
		Node node2 = new Node();
		node2.data = 45;
		
		Node node3 = new Node();
		node3.data = 17;
		
		Node node4 = new Node();
		node4.data = 33;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		
		lengthNode(node1);
		lengthNode(node2);
		lengthNode(node3);
		lengthNode(node4);
		
		
	}
}