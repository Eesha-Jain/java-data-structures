package ds;

/* WHAT IS A BINARY TREE?
 * A tree of elements that have at most 2 children
 * We call left and right child
 * 
 * Each node has data, a left pointer, and a right pointer
 * 
 * Binary Trees are a hierarchical data structure.
 * Nice tree of data
 * 
 * Example of Uses:
 * 		File Structure
 */

public class BinaryTree {
	
	Node root;
	
	BinaryTree(int key) {
		root = new Node(key);
	}
	
	BinaryTree() {
		root = null;
	}
	
	public static void main (String [] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		
		tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        
        /* The tree looks something like this
         *              1
         *            /   \
         *          2       3
         *        /   \
         *       4     5
         * 
         */
        
        //You can iterate through the binary tree using pre-order, in-order, or post-order
        //In-Order: 4, 2, 5, 1, 3
        //Pre-order: 1, 2, 4, 5, 3
        //Post-order: 4, 5, 2, 3, 1
	}
}
