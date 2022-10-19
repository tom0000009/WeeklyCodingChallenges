package Question1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.
For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8. 
In this example, assume nodes with the same value are the exact same node objects.

Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.

 * @author tomh0
 *
 */
public class Question1 {

	public static int intersect(LinkedList<Integer>A, LinkedList<Integer>B) {
		//<Value,Index>
		Set<Integer>aSet=new HashSet<Integer>();
		for(int i=0;i<A.size();i++)
			aSet.add(A.get(i));
		
		for(int i=0;i<B.size();i++)
			if(aSet.contains(B.get(i)))
				return B.get(i);		
		return -1;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer>A=new LinkedList<Integer>(Arrays.asList(new Integer[]{3,7,8,10}));
		LinkedList<Integer>B=new LinkedList<Integer>(Arrays.asList(new Integer[]{99,1,8,10}));
		System.out.println(intersect(A, B)+" vs "+8);
	}

}
