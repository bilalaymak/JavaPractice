package practices01.arrays;

import java.util.Arrays;

public class ArraysExamples {

    public static void main(String[] args) {

        //example 1:

        int arr[] = new int[3];
        System.out.println(arr[1]);//0

       arr[0] = 11;
       arr[1] = 12;
        System.out.println(Arrays.toString(arr));//[11, 12, 0]

        //arrays cannot store non-primitive data types, can store primitive data types and references

        //in Java, wehen we create an Array, Java does not create its elements in the heap memory,
        // Java creates references(addresses) in the Stack Memory,
        // then, finds elements( like Ali, Tom, Mark) from Heap memory
        // so Arrays does not store Arrays' elements(non-primitive data types)

        System.out.println("******************************");

        //example 2:

        int arr1[] = {3,2,3,4,4,5};
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==3){
                count++;
            }
        }
        System.out.println(count);//2

        System.out.println("*********************************");

        //example 3:

         char arr2[] = new char[4];

         arr2[0] = 'A';
         arr2[2] = 'E';
         arr2[3] = 'M';
        System.out.println(Arrays.toString(arr2));//[A,  , E, M]

        //in Arrays,
        // String ==> null
        // Numeric Data Types ==> 0
        // char ==> ''
        // boolean ==> false

        System.out.println("**************************");

        //example 4:

        // the code to find the sum of elements of the Arrays
        int x[] = {3,5,7};
        int a =0;
        int b = 0;

        while (a<x.length){
            b = b + x[a];
            a++;
        }
        System.out.println(b);//15






    }

}















