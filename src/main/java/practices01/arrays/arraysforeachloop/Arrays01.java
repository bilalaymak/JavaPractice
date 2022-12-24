package practices01.arrays.arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        //example 1: [0,2,3,0,12,0] put the zeros to the end
        // convert the array to [2,3,12,0,0,0]

        int arr[] = {0,2,3,0,12,0};

        int brr[] = new int[arr.length]; // arr and brr must have the same number of elements
        //arr.length() make the number of the arrays' elements dynamic

        int idxbrr = 0;
        for(int idxarr = 0; idxarr <arr.length; idxarr++){
            if(arr[idxarr]!=0){
                brr[idxbrr] = arr[idxarr];

                idxbrr++;
            }
        }
        System.out.println(Arrays.toString(brr));//[2, 3, 12, 0, 0, 0]

        //example 2: type code to check if a specific element exists in an array or not
        // int crr[] = {-12,23,5}; check if 23 exists in the array or not

        int crr[] = {-12,23,5};

        int counter = 0;
        int element = 23;

        for (int w:
             crr) {
            if(w == element) {
                counter++;
            }
        }
        if (counter>0){
            System.out.println("There are " + counter + " times 23");//There are 1 times 23

        }else {
            System.out.println("It does not exist" );
        }








    }
}
