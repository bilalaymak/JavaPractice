package practices01.arrays.multidimensionalarrays;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {

        //Example 2: print the elements which have  "a" from a 2 dimensional array


        String arr[][] = { {"learn","java","it"},{"is","easy"} };

        for(String[] w : arr){

            for(String u : w){
                if(u.contains("a")){
                    System.out.print(u + " ");//learn java easy
                }
            }
        }

        System.out.println("*******************");
        //Example 3: create an integer multidimensional array then find the sum of the elements


        int brr[][] = { {12,54},{3,2,7},{21} };
        int sum = 0;
        for(int[] w: brr){
            for(int u: w){
                sum = sum + u;
            }
        }
        System.out.println(sum);//99







    }
}














