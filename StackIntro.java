package ds;

/* WHAT IS A STACK?
 * A stack is one of the advanced data structures.
 * It is similar to a stack of books
 * You can "stack" data on top of each other
 * If you "peek", you can look at the top element
 * If you "pop", you look at top element in stack and remove it too
 * If you "push", you add a element to top of stack
 * 
 * [1, 2, 3, 4, 5]
 * In this Stack, the bottom of the stack would be 1
 * And the top of the stack would be 5
 * So left-right in array = bottom-top in stack
 * 
 * LIFO(Last In First Out) or FILO(First In Last Out)
 */

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> testingStack = new Stack <Integer>();
		for (int i = 1; i <= 5; i++) {
			testingStack.push(i);
		}
		System.out.println(sum(testingStack));
		System.out.println(testingStack);
		System.out.println(testingStack.peek());
		
	}
	
	public static int sum(Stack <Integer> stack) {
		Stack <Integer> stack2 = new Stack <Integer> ();
		int sum = 0;
		while (!stack.isEmpty()) {
			stack2.push(stack.pop());
		}
		
		while (!stack2.isEmpty()) {
			int val = stack2.pop();
			sum += val;
			stack.push(val);
		}
		
		return sum;
	}

}
