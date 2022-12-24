package practices01.arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //example 1.

        int arr[] = {11, 12, 13, 14};
        System.out.println(Arrays.toString(arr));//[11, 12, 13, 14]
        System.out.println(arr[1]);//12
        System.out.println(arr[arr.length - 2]);//13  // gives the value of the last 2. element

        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");//11 12 13 14
        }

        System.out.println("*****************");
        //example 2.

        //note: if you type the name of the array in method parenthesis of Arrays.sort(),
        // the array elements will be sorted in ascending order

        int arr2[] = {2, 11, 0, 23, 7};
        //question: what is the greatest element of given array

        Arrays.sort(arr2);
        System.out.print(arr2[arr2.length - 1]);//23

        System.out.println();

        //example 3:

        //if you type the name of the array in method parenthesis of Arrays.sort();,
        // the array elements will be sorted in ascending order
        //the question of ASCII values in Arrays

        char arrCh[] = {'a', 'C', 'c', 'A', 'b'};
        Arrays.sort(arrCh);
        System.out.println(Arrays.toString(arrCh));//[A, C, a, b, c]

        System.out.println("*********************");
        //example 4:

        int arr3[] = {2, 11, 0, 23, 7};
        Arrays.sort(arr3);

        for (int i = 4; i >= 0; i--) {
            System.out.print(arr3[i] + " ");//23 11 7 2 0
        }


    }
}

























