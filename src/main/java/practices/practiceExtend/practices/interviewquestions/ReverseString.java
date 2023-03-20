package practices.practiceExtend.practices.interviewquestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        //write a java program to reverse a string

        Scanner input = new Scanner(System.in);
        System.out.println("enter a String to reverse");
        String str1 = input.nextLine();


        //1. way: by using StringBuilder()
        StringBuilder strB1 = new StringBuilder(str1);
        strB1.reverse();
        String reversed = strB1.toString();
        //The reverse method is a method of the StringBuilder

        System.out.println(reversed);
        //toString() method returns the contents of the "StringBuilder" object
        //as a regular String


        System.out.println("*****************");

        //2.1. way: by using append() method with StringBuilder and reverse()

        System.out.println("enter second String to reverse");
        String str2 = input.nextLine();
        StringBuilder strB2 = new StringBuilder();
        strB2.append(str2);
        //append() method allows us to add a value
        // to the end of a StringBuilder object
        System.out.println(strB2.reverse());




    }
}
