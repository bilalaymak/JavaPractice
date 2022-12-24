package practices01.arrays.arraysforeachloop;

import java.util.Arrays;

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


    }
}


















