package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        for(int i=0;i<6;i++) {
            for(int j=0;j<6-i;j++) {
                System.out.print(" ");
            }
            for(int x=0;x<=i;x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
  }
