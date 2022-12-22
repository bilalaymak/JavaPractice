package practices01.loops.whileloops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {


        // while loop
        // when you use while-loop zero execution is possible

        int i=1;        //broken loop
        while (i< 1){
            System.out.println("While Loop");
            i++;
        }

        //do-while-loop

        int k = 1;
        /*broken loop but not zero execution is impossible, becouse the do body execuses at least once but
        in the while loop, the loop can be zero execution
         when we use do-while loop, if it is mandatory to execute the code inside the loop at least once,
        we use do while loop
        for example, at ATM we should show the message of "enter your password " or any message
        at games
        */

        do{
            System.out.println("do while loop");
           k++;
        }while (k<1);


        /*Example 1:

        ask user to enter an integer
        if the integer is less than 100, tell user "Won!"
        otherwise, tell user "Lost!"
         */

        Scanner input =new Scanner(System.in);

        int num;// we used this variable to the num out the curly braces, because a variable in a curly brace,
        // we cannot use outside
        do {
            System.out.println("enter an integer number to play");// we type this code to get numbers in every loop
            num = input.nextInt();
            if (num<100) {
                System.out.println("Won!");
                //there is not any increment or decrement, the variant is the user
            }
        }while (num<100);// we type this condition to re-play again and again
        System.out.println("Lost!");





    }
}


























