package step01.loops.whileloops;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: type code to print integers from 3 to 6

        //1. Way: use for-loop

        for (int i = 3; i <= 6 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2. way: while-loop

        int i = 3;
        while (i <= 6){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();


        //example 2 : type code to print odd integers(tek sayi) from 12 to 67 in the same line with a space between them

        int k = 12;
        while (k < 68){
            if(k%2!=0){
                System.out.print(k + " ");
            }

            k++;
        }
        System.out.println();

        //example3: type code to find the sum of integers from 12 to 67

        int m = 12;
        int sum = 0;
        while (m < 68){
            sum = sum + m;
          //  System.out.println(sum); we can type this code to see every current view of the sum
            m++;
        }System.out.println("the sum is " + sum);

        //example 4 : type java code by using while loop,
        // write a program that prompts(konut vermek) the user to input an integer
        // it should then find the sum of the digits of that number
        // 123 ==> 1+2+3 = 6

        Scanner input = new Scanner(System.in);
        System.out.println("please enter an Integer number to find the sum of digits ");

        int num = input.nextInt();
        int sumOfDigits = 0;

        while (num>0){
           sumOfDigits = sumOfDigits +  num%10;

            num/=10;
        }
        System.out.println(sumOfDigits);

        //example 5 : type java code using by using while loop,
        // write a program that prompts the user to input a number
        // it should then print the multiplication table of that number
        // 3*1=3 3*2=6 3*3=9 ...... 3*10=30

        System.out.println("type an integer to see multiplication table on the console");
        int n = input.nextInt();
        int p = 1;
        while (p<11){
            System.out.println(n + "x" + p + " = " + n*p);
                    p++;
        }
        System.out.println();








    }
}





















