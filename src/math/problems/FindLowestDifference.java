package math.problems;
import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int x = array1.length;
        int y = array2.length;
        System.out.println(" Lowest Difference between the cells is : "+ difference( array1, array2, x, y));

    }

    static int difference(int Array1[], int Array2[], int x, int y) {
        Arrays.sort(Array1);
        Arrays.sort(Array2);
        int val1 = 0, val2 = 0;

        int result = Integer.MAX_VALUE;

        while (val1 < x && val2 < y)
        {
            if (Math.abs(Array1[val1] - Array2[val2]) < result)
                result = Math.abs(Array1[val1] - Array2[val2]);
            if (Array1[val1] < Array2[val2])
                val1++;
            else
                val2++;
        }
        return result;



    }

}
