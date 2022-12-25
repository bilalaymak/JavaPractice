package practices01.arrays.arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {


        //example 1: 09/20/2022 is given, print the date like "Month:09   Day:20   Year:2022"
        // split() methods returns Array

        // to reach official documentation of Java, we should press "ctrl" and click the method we want to learn!!

        String date = "09/20/2022";

        String dateArray[] = date.split("/");  //method of split gives us an Array

        System.out.println(Arrays.toString(dateArray));//[09, 20, 2022] that is, date.split() gives us an array

        System.out.println("Month: " + dateArray[0] + " Day: " + dateArray[1] + " Year: " + dateArray[2]);
        //Month: 09 Day: 20 Year: 2022

        System.out.println("***************************");

        //example 2: get string from user and type code to find the number of words in the String
        // "I like to move it, move it" ==> 7

        // we find the number of words in a String by using split method

        String str = "I like to move it, move it";
        String arr[] = str.split(" ");
        System.out.println("the number of the words is " + arr.length );//the number of the words is 7

        System.out.println("********************************");

        Scanner input = new Scanner(System.in);
        System.out.println("type a sentence");
        String s = input.nextLine();
        String brr[] = s.split(" ");
        System.out.println("the number of the words is " + brr.length);//the number of the words is 7


        System.out.println("*************************");

        //Example 3: count the number of words starts with "a" in the String
        //"I am from argentina" there are two words start with "a" // brr = [I,am,from,argentina]
        int counter = 0;// variables to check are called "flag"

        for(String w: brr){
            if(w.startsWith("a") || w.startsWith("A")){// we used this kind of using to make ignoreCase
                counter++;
            }
        }
        System.out.println(counter + " words start with a");//2 words start with a















    }
}


















