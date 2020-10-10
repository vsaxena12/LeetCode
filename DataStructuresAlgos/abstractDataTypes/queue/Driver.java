package queue;
import java.util.Scanner;

public class Driver {

	private static Scanner scan;
	private static int size;
	
	public static void queue()
	{
		scan = new Scanner(System.in);
		System.out.print("Decide the size of the Queue: ");
		size = scan.nextInt();
		
		Queue<String> queue = new Queue<String>(size);
		queue.enqueue("45");
		queue.enqueue("55");
		queue.enqueue("65");
		queue.enqueue("75");
		queue.enqueue("85");
		queue.print();
		queue.dequeue();
		queue.print();
		System.out.println("Deleted Element: "+ queue.returnDeletedElement());
		//queue.dequeue();
		//queue.print();
		//queue.printRecentlyDeletedElement();
		//queue.dequeue();
		//queue.printRecentlyDeletedElement();
		//queue.print();
		
		scan.close();
	}
	
	public static void circularQueue()
	{
		scan = new Scanner(System.in);
		System.out.print("Decide the size of the Circular Queue: ");
		size = scan.nextInt();
		
		CircularQueue<String> circularQueue = new CircularQueue<String>(size);
		circularQueue.enqueue("45");
		circularQueue.enqueue("55");
		circularQueue.enqueue("65");
		circularQueue.enqueue("75");
		circularQueue.enqueue("85");
		circularQueue.print();
		circularQueue.dequeue();
		circularQueue.print();
		circularQueue.enqueue("85");
		circularQueue.print();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("select the Queues: 1. Queue 2. Circular Queue");
		int select = scanner.nextInt();
		switch(select)
		{
			case 1:
				System.out.println("Run Queue");
				queue();
				break;
				
			case 2:
				System.out.println("Run Circular Queue");
				circularQueue();
				break;
			
			default:
				System.out.println("Error");
		}
		
		scanner.close();
	}

}
