package practices.practiceExtend.practices.interviewquestions;

import java.util.Scanner;

public class Questions {
    //1) Write a Java Program to reverse a string
    //2) Write a Java Program to swap two numbers
    //3) How many fibonacci number do you want to see?
    //4) Enter a positive integer to check if it is prime or not

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int number = scan.nextInt();
        primeCalculator(number);
        scan.close();

    }

    public static void primeCalculator(int number) {
        int count = 0;
        if(number>0) {
            if (number == 1) {
                System.out.println(number + " is prime number");
            }else {
                for(int i=2; i<number; i++) {
                    if(number%i==0) {
                        count++;
                    }
                }
                if(count==0) {
                    System.out.println(number + " is prime");
                }else {
                    System.out.println(number + " is not prime");
                }
            }
        }else {
            System.out.println("Enter a positive integer");
        }


    }


}
