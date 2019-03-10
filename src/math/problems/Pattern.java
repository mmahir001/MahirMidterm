package math.problems;
import java.util.ArrayList;

public class Pattern {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(pattern(n));
	}

	public static ArrayList pattern(int n) {
		int val = 1;
		int y = 0;

		ArrayList<Integer> x = new ArrayList<>();

		int[] array1 = new int[40];

		while (n > 0) {
			for (int i = 0; i < 10; i++) {
				x.add(n);
				array1[y] = n;
				n -= val;
				y++;
			}
			val++;
		}
		return x;


	}
}
