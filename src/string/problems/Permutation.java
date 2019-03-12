package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permMethod("","ABC");
    }

    public static void permMethod (String x, String y) {
        int val = y.length();
        if (val == 0) {
            System.out.println(x);
        } else {
            for (int i = 0; i < val; i++) {
                permMethod(x + y.charAt(i), y.substring(0, i) + y.substring(i + 1, val));
            }
        }
    }
}
