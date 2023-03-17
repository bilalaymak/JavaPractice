package step01.loops.forloops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {

        //example 1: type code to print characters except "m" in a String
        // for example, Andromeda ==> Androeda

        String str = "Andromeda";

        //1. way
        for (int i = 0; i < str.length(); i++) {
            // when we use how many character are there
            //in a String, we use str.length(); method
            char ch = str.charAt(i);
            //we use charAt(): method to take pointed character of the String
            if(ch!= 'm'){
                System.out.print(ch);//Androeda
            }
        }

        System.out.println("********************");
        //2. way

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='m'){
                continue;// if you want to skip any value in lopp, use "continue"
            }
            System.out.print(ch);
            }

        System.out.println();
        System.out.println("***************");
        //example 2: type code to print characters before "m" in a String

        str = "Luxembourg";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'm'){
                break;// if you want to break any loop under some conditions
                // you can use "break" keyword
            }
            System.out.print(ch);//Luxe
        }

        System.out.println();
        //example 3: type code to find the sum of the unique digits in an integer
        //  for example, 1232 ==> 1+3 =4 we don't use the second 2, because it is used before

        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer to see the sum of the unique digits in it");
         String num = input.next();

        int sum = 0;
        for (int i = 0; i < num.length() ; i++) {
            String digit = num.substring(i,i+1);//to get wanted character(i,i+1)
            if(num.indexOf(digit) == num.lastIndexOf(digit)){

           //num.indexOf(digit) == num.lastIndexOf(digit) is the rule to be unique
                sum =  sum + Integer.valueOf(digit);// we used Integer.valueOf();
                // method to convert
                // the String to the int value
            }

        }
        System.out.println(sum);
    }
}





















