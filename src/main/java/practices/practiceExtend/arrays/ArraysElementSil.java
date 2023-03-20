package practices.practiceExtend.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysElementSil {
    public static void main(String[] args) {
        /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */
        //note : ayni arrayde ekleme cikarma yapilamaz

        //Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int limit = input.nextInt();
        int arr[] = new int[limit];

        for(int i = 0; i<arr.length; i++){
            System.out.println("index " + i + " degerini giriniz");//[99, 66, 55, 44]
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));//[99, 66, 55, 44]

        //Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
        System.out.println("silmek istediginiz indexi giriniz");
        int dltIdx = input.nextInt();

        int arr2[] = new int[arr.length-1];
        int idx = 0;

        for (int i = 0; i<arr.length; i++){
            if(i!=dltIdx){
               arr2[idx] = arr[i];
               idx++;
            }
        }
        System.out.println(Arrays.toString(arr2));//[99, 66, 44]










    }
}












