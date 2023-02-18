package practices01.arrays.multidimensionalarrays;

public class MultiDimensionalArrays04 {
    public static void main(String[] args) {

        //example 1: find the max element in a two-dimensional array

        int arr[][] = { {5,0},{-2,4},{65,-12,23} };

        int max = arr[0][0];
        for (int[] w: arr){
            for (int u: w){
                //1. way
                max = Math.max(max,u);
                //2. way
                // if(max<u){max = u;} it gives the same return to us
                //max() method from Math class selects the max value between two numbers
            }
        }
        System.out.println("max = " + max);//max = 65







    }
}












