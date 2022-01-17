package ds;

/* WHAT IS A QUEUE?
 * A queue is similar to a stack but instead it is "First in, first out" (FIFO)
 * It is kind of like a line. The first person who stood in the line is the first person out
 * 
 * You remove elements from the front and insert elements to the rear (aka, the back)
 */

public class Queue {
	public static void main (String [] args) {
		java.util.Queue<Integer> q = new java.util.LinkedList<>(); 
		
		for (int i = 0; i < 4; i++) {
			q.add(i);
		}
		
		System.out.println(q);
		q.remove(3);
		System.out.println(q);
		System.out.println("Peek: " + q.peek());
		System.out.println("Size: " + q.size());
		
		System.out.println(q.poll());
		System.out.println(q);
	}
}
