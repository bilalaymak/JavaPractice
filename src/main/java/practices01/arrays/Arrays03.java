package practices01.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {

        //Example 1 : let user enter student names into the application
        // (create an Array together with the user)

        Scanner input = new Scanner(System.in);

        //1. step: create an Array
        System.out.println("enter the number of the students you want to enter");

        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];

        System.out.println(Arrays.toString(names));

        //2. step: insert the element into the Array
        //whenever we need to use indexes, we cannot use for each loops, we must use for loops

        for(int i = 0; i< numOfStd; i++){
            System.out.println("enter the" + (i + 1) +  ". student name. to stop insertion press Q");
            // for the 1. student name "i" must be 0!!!
            String stdName = input.next();
            if(!stdName.equalsIgnoreCase("q")) { //se used the if else condition to stop insertion
                names[i] = stdName;// for loop puts the elements(student names) into the Array
            }else {
                break;
            }
        }
        System.out.println(Arrays.toString(names));//[ahmet, bilal]
        //for example for "Q" option==> [ali, ahmet, null] we insert 2 names in an Array has 3 field for elements





    }
}



















