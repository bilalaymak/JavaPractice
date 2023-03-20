package practices.practiceExtend.stringmanipulation;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("bir string deger giriniz");
        String str = input.next().toLowerCase().replaceAll(" ","");
        String strReverse = "";

        for (int i = str.length()-1;i>=0;i--){
            strReverse += str.charAt(i);
        }
        System.out.println("strReverse = " + strReverse);

        if (str.equals(strReverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("palindrome degil");
        }




    }
}














