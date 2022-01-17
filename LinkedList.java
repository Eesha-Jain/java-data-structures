package ds;

/* WHAT IS A LINKED LIST?
 * Uses pointers from one value to another. The first value is the head and the last value points to "Null"
 * Each data value is a node
 * You can insert and delete values really easily
 * You cannot automatically access a value in the middle, you have to trace it from head to the value
 */

public class LinkedList {
	public static void main (String [] args) {
		java.util.LinkedList<String> list = new java.util.LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.addLast("C");
		list.addFirst("D");
		list.add(2, "E");
		
		System.out.println(list);
		
		list.remove("B");
		list.remove(3);
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
		list.set(0, "B");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {  
		    
            System.out.print(list.get(i) + " ");  
        } 
		
		list.add("A");
		list.add("B");
		list.addLast("C");
		list.addFirst("D");
				
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		
		System.out.println(list);
    
		list.clear();
	}
}
