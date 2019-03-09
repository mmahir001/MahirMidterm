package math.problems;

public class Factorial {

    public static void main(String[] args) {

        int fact1 = recursion(5);
        System.out.println("Recursion: Factorial of 5 is: " + fact1);

        int fact2 = iteration (5);
        System.out.println("Iteration: Factorial of 5 is : "+ iteration(5));
    }


    public static int recursion(int n) {
        int val;
        if (n == 1) {
            return 1;
        }
        val = recursion(n - 1) * n;
        return val;
    }


    public static int iteration(int n){
        int val=1;
        for(int i=1; i<=n;i++){
            val=val*i;
        }
        return val;
    }


}
