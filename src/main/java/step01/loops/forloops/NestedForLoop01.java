package step01.loops.forloops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        /*
    Example 1: type code to get the output like

                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
*/

        for (int i = 1; i < 5; i++) {
            System.out.println("week: " + i);
            for (int j = 1; j < 8; j++) {
                System.out.println("day: " + j);

            }

        }

        System.out.println();
        /*example 2: write a Java program to print rectangle Star Pattern using for loop
                    ****
                    ****
                    ****
           note: get the number of rows and columns from user
         */

              Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of the rows ");
        int row = input.nextInt();
        System.out.println("please enter the number of the columns ");
        int column = input.nextInt();

        for (int i = 1; i <= row ; i++) {
            System.out.print("*");

            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("**************************");
        /*
        Example3: Type code to get the output like

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */
        System.out.println("please enter the number of the rows ");
        int numOfRows = input.nextInt();


        for (int i = 1; i <= numOfRows ; i++) {
            for (int k =1; k <=i ; k++) {//we changed the condition to get the number of repetition of rows
                //if we don't we get 12345 that is all the numbers in the column
                System.out.print(k);
            }
            System.out.println();
        }
















    }
}



















































