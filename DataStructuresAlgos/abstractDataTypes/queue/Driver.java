package queue;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Decide the size of the Queue: ");
		int size = scan.nextInt();
		
		Queue<String> queue = new Queue<String>(size);
		queue.enqueue("45");
		queue.enqueue("55");
		queue.enqueue("65");
		queue.enqueue("75");
		queue.enqueue("85");
		queue.print();
		
		//queue.dequeue();
		//queue.print();
		//queue.printRecentlyDeletedElement();
		//queue.dequeue();
		//queue.printRecentlyDeletedElement();
		//queue.print();
		
		scan.close();
		
	}

}
