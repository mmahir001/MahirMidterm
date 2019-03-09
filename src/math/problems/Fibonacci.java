package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n = 40, num1 = 0, num2 = 1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(num1 + " , ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

    }
}
