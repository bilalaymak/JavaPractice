package practices.practiceExtend.practices.interviewquestions;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        //Write a Java Program to swap(exchange) two numbers

        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 numbers to swap");
        double n1 = input.nextDouble();//5
        double n2 = input.nextDouble();//6

        System.out.println("before swapping: " + n1 + n2);

        //1. way: by using 3rd variable
        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("after swapping: " + n1 + " - " + n2);

        //2. way: by not using 3rd variable

        n1 = n1 + n2;//5+6=11==> n1=11
        n2 = n1 - n2;//11-6=5==> n2=5
        n1 = n1 - n2;//11-5=6==> n1=6
        System.out.println("after swapping: " + n1 + " - " + n2);








    }
}
