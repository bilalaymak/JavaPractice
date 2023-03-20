package step03.lists.arrays.multidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays01 {
    public static void main(String[] args) {

        //if an array has arrays as elements it is called "multidimensional array"

        // [ [2,3],[5,6],[1,4],[5,6],[7,9],[4.2],[6.8],[8.1] ] 8 dimensional array
        //index of the number 9 is (5,1)  ==> arr[5][1]

        //how to create multidimensional array(it has inner arrays and outer arrays)
        int arr[][] = new int[4][2];

        //how to print a multidimensional array
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0], [0, 0]]

        //how to assign values to multidimensional array elements
        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;

        arr[2][1] = 5;
        arr[2][0] = 6;

        arr[3][0] = -7;
        arr[3][1] = 8;

        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4], [6, 5], [-7, 8]]

        //how to create multidimensional array in short way

        String brr[][] = { {"Tom","Jim"}, {"Angie"} , {"Carl", "Chris", "Ali"} };
        System.out.println(Arrays.deepToString(brr));
        //[[Tom, Jim], [Angie], [Carl, Chris, Ali]]

        //how to print a specific element from a multidimensional array
        System.out.println(brr[2][1]);//Chris

        //how to print a specific element from outer array
        System.out.println(Arrays.toString(brr[2]));//[Carl, Chris, Ali]

        //example 1: type code to find the number of elements in a multidimensional array

        String crr[][] = { {"Tom","Jim"}, {"Angie"} , {"Carl", "Chris", "Ali"} };

        int sum = 0;
        for(String[] w: crr){
            sum = sum + w.length;
        }
        System.out.println(sum);// 6 ==> (2+1+3)






    }
}



















