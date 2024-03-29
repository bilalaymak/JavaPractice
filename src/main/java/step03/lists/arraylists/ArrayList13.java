package step03.lists.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList13 {

    public static void main(String[] args) {

        //Example 1: Create a salary list and increase the salary %10 if the salary is less than 5000 dollars.
        //           [4500, 6400, 2300, 5000, 7150] ==> 4500-->4950 - 2300-->2530
        //           [4950, 6400, 2530, 5000, 7150]

        List<Double> salaries = new ArrayList<>();
        salaries.add(4500.00);
        salaries.add(6400.0);
        salaries.add(2300.0);
        salaries.add(5000.0);
        salaries.add(7150.0);
        System.out.println("salaries = " + salaries);//salaries = [4500.0, 6400.0, 2300.0, 5000.0, 7150.0]

        //1. way:

        for(Double w: salaries){
            if (w < 5000){
                salaries.set(salaries.indexOf(w),w * 1.1);
            }
        }
        System.out.println("salaries = " + salaries);//salaries = [4950.0, 6400.0, 2530.0, 5000.0, 7150.0]


        //2. way:

        for (Double w: salaries){

            if (w >= 5000){
                continue;
            }else {
                salaries.set(salaries.indexOf(w),w * 1.1 );
            }
        }
        System.out.println("salaries = " + salaries);//salaries = [5445.0, 6400.0, 2783.0, 5000.0, 7150.0]

    }
}
