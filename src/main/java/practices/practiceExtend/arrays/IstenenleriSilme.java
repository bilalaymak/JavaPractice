package practices.practiceExtend.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IstenenleriSilme {
    public static void main(String[] args) {

        //Bir  integer Array'de verilen bir deger disindaki elamanlari
        // yeni bir Array olarak yazdiran bir method yaziniz.

        int[] arr = {1,2,2,3,4,5,5};
        System.out.println("istenileniSil(arr) = " + Arrays.toString(istenileniSil(arr)));
    }
    public static int[] istenileniSil(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("silmek isteiginiz elemani giriniz");
        int silinecek = input.nextInt();
        int length = 0;
        for (int w: arr){
            if(w!=silinecek){
            length++;
            }
        }
        System.out.println("length = " + length);
        int[] arrSilinmis = new int[length];
        int idx = 0;
        for (int w:  arr){
            if (w!=silinecek){
                arrSilinmis[idx] = w;
                idx++;
            }
        }
        return arrSilinmis;
    }

}











