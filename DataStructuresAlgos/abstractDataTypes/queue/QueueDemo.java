package queue;

class QueueDemo {
	 
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(5);
        System.out.print("You have successfully created a Queue!");
        queue.enqueue(34);
        queue.enqueue(44);
        queue.enqueue(34);
        
        
        
	}
}