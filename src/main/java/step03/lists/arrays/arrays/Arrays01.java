package step03.lists.arrays.arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
         // note : Arrays are is to store multiple data in single data type
         // we cannot store different data types in an array

        //how to create an Array

        String names[] = new String[5];
        System.out.println(Arrays.toString(names));//[null, null, null, null, null]
        //toString() is a method it prints the array

        //how to put elements into an Array
        names[0] = "Tom";
        names[1] = "Mark";
        names[2] = "Lim";
        names[3] = "Mary";
        names[4] = "Susan";
        System.out.println(Arrays.toString(names));//[Tom, Mark, Lim, Mary, Susan]

        //how to print a specific element in an Array
        System.out.println(names[3]);//Marry

        System.out.println();

        //example 1 : create an Integer array and print the sum of the first and the last elements on the console



       int ages[] = new int[7];

        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0, 0, 0]

        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 25;
        ages[3] = 14;
        ages[4] = 17;
        ages[5] = 12;
        ages[6] = 14;
        System.out.println(Arrays.toString(ages));//[12, 23, 25, 14, 17, 12, 14]

        System.out.println(ages[0] + ages[ages.length-1]);//26

        //example 2: create a double array and find the sum of all elements in the array


        double arr[] = new double[5];

        //1. way

        arr[0] = 12.4;
        arr[1] = 13.5;
        arr[2] = 14.6;
        arr[3] = 15.1;
        arr[4] = 16.34;

        System.out.println(arr[0] +arr[1] +arr[2] +arr[3] +arr[4]);//71.94

        //2. way

        double sum = 0;
        for (int i = 0; i <arr.length ; i++) {//in arrays length doesn't contain "()"
              sum = sum + arr[i];
        }
        System.out.println(sum);//71.94

        //3. way: we will solve the task by using for-each-loop
        // for-each-loop can be used with Arrays and Collection

        double summy = 0;
        for(double w : arr){// in for each loop==> we write return type + w + : + Array's name

             summy = summy + w;
        }
        System.out.println(summy);//71.94

        System.out.println();



    }
}














