package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> Cost = new LinkedList<Integer>();
		Cost.add(1);
		Cost.add(2);
		Cost.add(3);
		Cost.add(4);

		Cost.size();
		Cost.remove();
		Cost.peek();
		Cost.poll();



		Iterator it=Cost.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		for(Integer st1: Cost)
		{
			System.out.println("Remove: "+Cost.remove());
			System.out.println("Peek: "+Cost.peek());
			System.out.println ("Poll: "+Cost.poll());

		}
	}

}
