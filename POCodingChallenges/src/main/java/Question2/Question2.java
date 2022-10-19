package Question2;

/**
 * 2) Implement a stack that has the following methods:
• push ( val ) : push val onto the stack
• pop: pop off and return the topmost element of the stack. 
	If there are no elements in the stack, throw an error.
• max: return the maximum value in the stack currently. 
	If there are no elements in the stack, throw an error.

Each method should run in constant time.

 * @author tomh0
 *
 */
public class Question2 {
	
	public static void main(String[]args) {
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(1).push(3).push(2).push(5).push(4).push(6).push(0).push(7).push(9).push(8);

		for(int i=0;i<5;i++) {
			System.out.println(i+": "+stack.toString()+" 	size:"+stack.size()+" max:"+stack.max());			
			stack.pop();
			stack.pop();
			stack.pop();
			stack.push((int)(Math.random()*10)).push((int)(Math.random()*10));
		}
	
	}
	
}
