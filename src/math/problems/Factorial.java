package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    public static void main(String[] args) {

        System.out.println(recursion(5));
        System.out.println(iteration(5));

    }
    //recursion
    public static int recursion(int n){
        if(n==0){
            return 1;
        }
        return n * recursion(n-1);
    }
    //Iteration
    public static int iteration(int n){
        int x = 1;

        for (int i=1; i <= n; i++)
            x *= i;

        return x;


    }
}
