package practices.practiceExtend.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        /*
       İki kelimenin "Anagram" olup olmadığını kontrol eden bir method oluşturunuz.
       - Anagram, başka bir kelimenin karakterlerinden yeni bir kelime oluşturmaktır. -
       Örn:
       * bahriyeli <> harbiyeli.
       * sızlanma <> anlamsız.
       * asya <> yasa.
       * Bursa Dağı <> su bardağı
       * kan ara <> Ankara.
       */

        Scanner input = new Scanner(System.in);
        System.out.println("String1 i giriniz");
        String str1 = input.nextLine();
        System.out.println("String2 i giriniz");
        String str2 = input.nextLine();

        anagram("kan ara", "ankara");//anagram
        anagram("sızlanma","anlamsız");
        anagram(str1,str2);//anagram

    }
    public static void anagram(String str1, String str2){
       String arr1[] = str1.toLowerCase().replaceAll(" ", "").split("");
       String arr2[] = str1.toLowerCase().replaceAll(" ", "").split("");

        Arrays.sort(arr1);//attama yapmadan orjinal degeri degistiriyorsak bu mutable oluyor
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("anagram");
        }else {
            System.out.println("anagram degil");
        }
    }


}


















