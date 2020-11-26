package SingleLinkedList;

public class Node {
	int data;
	Node next;

	
	/*
	Node(int num){
		data = num;
	}
	*/

	public void displayNode() {
		// TODO Auto-generated method stub
		System.out.println(data);
	}
}


/*
 * Node here is a self referential class as it has a private data member
 * that is a pointer to an object of the same class. 
 * [https://www.cs.cmu.edu/~pattis/15-1XX/15-200/lectures/linkedlists/index.html]
 * 
 * 
 */
