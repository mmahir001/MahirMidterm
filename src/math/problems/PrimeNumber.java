package math.problems;
import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;
public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

//		int[] array = ;
		ArrayList<Integer> primes = new ArrayList<Integer>();

		int i;
		int num = 0;
		int max = 100;
		boolean isPrime = true;


		String result = "";

		for (i = 2; i <= max; i++) {
			isPrime = check(i);
			if (isPrime) {
				result = result + i + " ";
			}
		}
		System.out.println("Prime numbers from 2 to " + max + " are:");
		System.out.println(result);
		if (isPrime) {
			primes.add(i);

		}

//
//		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//		List<String> lowestValue = new ArrayList<String>();
//		try {
//			connectToSqlDB.insertDataFromArrayToSqlTable(primes, "tbl_primeNumber", "column_primeNumber");
//			lowestValue = connectToSqlDB.readDataBase("tbl_primenumber", "column_primeNumber");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
//		for(String st:lowestValue){
//			System.out.println(st);
//		}

	}
	public static boolean check(int numCheck) {
		int remainder;
		for (int i = 2; i <= numCheck / 2; i++) {
			remainder = numCheck % i;

			if (remainder == 0) {
				return false;
			}
		}
		return true;

	}


}
