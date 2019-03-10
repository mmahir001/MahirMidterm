package datastructure;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import databases.ConnectToSqlDB;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> student = new ArrayList<>();

		student.add("Sam");
		student.add("Kevin");
		student.add("Dave");
		student.add("Josy");
		student.add("Rob");
		student.add("Matt");
		student.add("Ivan");
		student.add("Kathi");

		System.out.println("Elements in ArrayList: " + student + "\n");
		System.out.println("Peek element in index 5: " + student.get(5)+"\n");
		System.out.println("Remove element from index 2: " + student.remove(2)+"\n");
		System.out.println("Elements after update: " + student+"\n");

		System.out.print("Loop: \n");
		for (String data : student) {
			System.out.print(" "+data);
		}
		System.out.println();

		System.out.print("Loop with Iterator: \n");
		Iterator it = student.iterator();
		while (it.hasNext()) {
			String data2 = (String) it.next();
			System.out.print(" "+data2);
		}
		System.out.println();

		Collections.sort(student);
		System.out.println("Sorted ArrayList: \n "+student);



	}

}
