package Question1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class Question1Test {

	@Test
	public void test() {
		LinkedList<Integer>A=new LinkedList<Integer>(Arrays.asList(new Integer[]{3,7,8,10}));
		LinkedList<Integer>B=new LinkedList<Integer>(Arrays.asList(new Integer[]{99,1,8,10}));
		assertEquals(Question1.intersect(A, B), 8);
	}

}
