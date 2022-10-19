package Question2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Question2Test {
	
	@Before
	public void init() {
		
	}
	
	@Test
	public void pop() {
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(1).push(3).push(2).push(5).push(4).push(6).push(0).push(7).push(9).push(8);
		assert(stack.pop()==8);
	}
	@Test
	public void max() {
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(1).push(3).push(2).push(5).push(4).push(6).push(0).push(7).push(9).push(8);
		assert(stack.max()==9);		
	}

	public int getRandomNumber(int max) {
		return(int)(Math.random()*max);
	}
	@Test
	public void RandomNumbers() {
		Stack<Integer>stack=new Stack<Integer>();
		int max=-1;
		for(int i=0;i<100;i++) {
			int n=getRandomNumber(100);
			max=max>n?max:n;
			stack.push(n);	
		}
		assertEquals(stack.max(),(Integer)max);
	}
	
	
	
}
