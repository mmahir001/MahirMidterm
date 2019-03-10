package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(textFile);
			System.out.println("Path to FileReader is: " + textFile + "\n");

		} catch (FileNotFoundException e) {

			System.out.println("Can't find file");
		}
		String value = "";

		String st = "";

		try {
			br = new BufferedReader(fr);
			while ((value = br.readLine()) != null) {
				st += value;
				System.out.println(st);
			}

		} catch (IOException e) {
			System.out.println("Can't find file");

		} finally {
			if (fr != null) {
				fr = null;
			}

			if (br != null) {
				br = null;
			}
		}

		String[] stArray = st.split(" ");
		List<String> stList = new LinkedList<String>();
		Stack<String> stStack = new Stack<String>();

		for (String element : stArray) {
			stList.add(element);
			stStack.push(element);
		}
		System.out.println("\n FIFO for LinkedList: \n");

		Iterator<String> arr = stList.iterator();

		while (arr.hasNext()) {
			System.out.print(arr.next() + " ");
		}

		System.out.println("\n FILO for Stack: \n");

		while (!stStack.isEmpty()) {
			System.out.print(stStack.pop() + " ");
		}

		System.out.println(stStack.push("Worked! \n"));

		System.out.println("Index for BMW: " + stStack.search("BMW"));

		System.out.println(stStack.peek());

		System.out.println(stStack.empty());

	}

}
