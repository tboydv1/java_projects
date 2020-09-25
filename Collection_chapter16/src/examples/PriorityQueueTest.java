package examples;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Double> queue = new PriorityQueue<>();
		
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		
		System.out.print("Polling from queue: ");
		
		//display elements in queue
		while(queue.size() > 0) {
			System.out.printf("%n%.1f", queue.peek());
			queue.poll();
		}
	}

}
