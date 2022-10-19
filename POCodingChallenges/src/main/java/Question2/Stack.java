package Question2;

/**
 * node class for stack
 * @author tomh0
 *
 * @param <T> a comparable object
 */
class Node<T extends Comparable<T>> implements Comparable<Node<T>>{
	public T value;
	public Node<T> next;
	public Node<T> prev;
	public Node(T value){
		this.value=value;
		next=null;
		prev=null;
	}
	public int compareTo(Node<T> o) {
		return this.value.compareTo(o.value);
	}
}
/**
 * custom stack implementation
 * @author tomh0
 *
 * @param <T> comparable object
 */
public class Stack<T extends Comparable<T>>{
	private Node<T>head;
	private Node<T>tail;
	private Node<T>max;
	private int size;
	
	public Stack() {
		this.head=null;
		this.tail=null;
		this.max=null;
		this.size=0;
	}
	/**
	 * push ( val ) : push val onto the stack
	 * @param val
	 * @return
	 */
	public Stack<T> push(T val) {	
		//there is no head
		if(head==null) {
			head=new Node<T>(val);
			tail=head;
			max=head;
			size=1;
			return this;
		}
		//update tail
		Node<T>next=new Node<T>(val);		
		next.prev=tail;
		tail.next=next;
		tail=tail.next;
		
		//update max
		if(0>max.compareTo(next)) 
			max=next;
		
		//update size
		size++;
		return this;
	}
	/**
	 * pop off and return the topmost element of the stack.
	 * If there are no elements in the stack, throw an error.
	 * @return
	 * @throws NullPointerException
	 */
	public T pop() throws NullPointerException {
		//the user is trying to pop an empty stack
		if(head==null)
			throw new NullPointerException("No elements in the stack");
		
		//stack only has 1 node
		if(head==tail) {
			T val=tail.value;
			head=null;
			tail=null;
			max=null;
			size=0;
			return val;
		}
		
		//remove current tail
		Node<T>popped=tail;
		tail=tail.prev;
		tail.next=null;			
		size--;

		//if the node we are popping contains the max value
		if(popped==max) {
			Node<T>pointer=head.next;
			max=head;
			while(pointer!=null) {
				if(0>max.compareTo(pointer)) 
					max=pointer;
				pointer=pointer.next;
			}
		}
		return popped.value;
	}
	/**
	 * return the maximum value in the stack currently. 
	 * If there are no elements in the stack, throw an error.
	 * @return
	 */
	public T max() {
		if(max==null)
			throw new NullPointerException("No elements in the stack.");
		return max.value;
	}
	/**
	 * returns number of elements in the stack
	 * @return
	 */
	public int size() {
		return size;
	}
	/**
	 * {1, 2, 3, 4, ...}
	 */
	@Override
	public String toString() {
		if(head==null)
			return "{}";
		StringBuilder sb=new StringBuilder("{");
		Node<T>pointer=head;
		while(pointer!=null) {
			sb.append(pointer.value).append(", ");
			pointer=pointer.next;
		}
		sb.delete(sb.length()-2, sb.length()).append("}");
		return sb.toString();
	}
}
