/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	private Node h;
	// Set up the basic elements of your data structure here.
	
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	private int sz;
	private int acc; 
	public Stack(int size) {
		sz = size;
		h = null;
		acc = 0;
	}


	public boolean push(String record) {
		if (acc == sz) {
			return false;
		}
		Node newNode = new Node(record);
		newNode.next = h;
		h = newNode;
		acc++;
		return true;
	}


	public String pop() {
		Node temp = h;
		h = h.next;
		acc--;
		return temp.record;
	}


	public void printStack() {
		Node pointer = h;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		
	}
}
