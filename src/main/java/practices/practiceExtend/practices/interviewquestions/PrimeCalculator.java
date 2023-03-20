package practices.practiceExtend.practices.interviewquestions;

import java.util.Scanner;

public class PrimeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive integer to check if it is prime or not");

        int number = input.nextInt();
        primeCalculator(number);
        input.close();// to close the Scanner objects works
        // it is important because of speed
    }

    public static void primeCalculator(int number) {
        int counter = 0;
        if (number > 0) {
            if (number == 1) {
                System.out.println(number + " is prime number");
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    System.out.println(number + " is prime number");
                } else {
                    System.out.println(number + " is not prime number");
                }
            }
        } else {
            System.out.println("enter a positive integer");
        }


    }
}
