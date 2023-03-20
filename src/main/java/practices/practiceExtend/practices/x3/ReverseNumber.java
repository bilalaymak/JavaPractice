package practices.practiceExtend.practices.x3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        //write a program to reverse the number which user entered
        //input: 1238
        //output: reverse of the number : 8321
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int sayi = input.nextInt();

        System.out.println("Girilen sayinin tersten yazilisi");


        while (sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;

        }
    }
}
