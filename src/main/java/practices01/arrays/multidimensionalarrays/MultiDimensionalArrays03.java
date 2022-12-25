package practices01.arrays.multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays03 {
    public static void main(String[] args) {

        //convert multidimensional array to ane dimensional array
        //{ {"learn","java","it"},{"is","easy"} } ==> {"learn","java","it","is","easy"}

        String arr[][] = { {"learn","java","it"},{"is","easy"} };
        //1. step: find the total nubmer of elements in the multidimensional array

        int sum = 0;
        for (String[] w : arr) {
            // that code gives us total number of the elements in the multidimensional array(inner arrays)
            sum = sum + w.length;
        }

        //2. step: create one dimensional array by using total number of elements in multidimensional array
         String brr[] = new String[sum];
        System.out.println(Arrays.toString(brr));//[null, null, null, null, null]

        //3. step transfer the elements from multidimensional array to one dimensional array
        int idx = 0;
        for (String[] w: arr){
             for(String u : w){
                 brr[idx] = u;
                 idx++;
             }
        }
        System.out.println(Arrays.toString(brr));//[learn, java, it, is, easy]
















    }
}












