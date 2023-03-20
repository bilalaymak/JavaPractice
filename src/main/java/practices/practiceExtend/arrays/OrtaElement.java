package practices.practiceExtend.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OrtaElement {
    public static void main(String[] args) {

/*
        Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
 */
        Scanner input = new Scanner(System.in);
        System.out.println("array limitini giriniz");
        int limit = input.nextInt();
        int arr[] = new int[limit];

        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]
        for (int i = 0; i < limit; i++){
            System.out.println(i+1 +". elementi giriniz");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));//[6, 2, 0, 9]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 2, 6, 9]

        int ortaIdx = arr.length/2;

        if (arr.length%2 != 0){
            System.out.println("orta element: " + arr[ortaIdx]);
        }else {
            System.out.println("orta element: " + (arr[ortaIdx] + arr[ortaIdx-1])/2.0);//orta element: 4
        }


    }
}
