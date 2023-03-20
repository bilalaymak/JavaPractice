package practices.practiceExtend.stringmanipulation;

import java.util.Scanner;

public class StringManipulation10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = "Can you explain who are we?"; // index 27 karakter

        //input yapıp metod kullanmak için String writeUpper = scan.nextLine().toUpperCase(); gibi nokta ile yanyana yazmak gerekiyor

        // practiceExend.practice 1:

        String aUpper = a.toUpperCase();
        System.out.println(aUpper);

        // practiceExend.practice 2:

        System.out.println("write something please");
        String writeUpper = scan.nextLine().toUpperCase();
        System.out.println(writeUpper);

        //practiceExend.practice 3:
        System.out.println("write something please");
        String writeLower = scan.nextLine().toLowerCase();
        System.out.println(writeLower);

        //practiceExend.practice 4:

        System.out.println("write something please");
        char firstChar = scan.nextLine().charAt(0); // method hangi type'da ise object'in de o return type da olması lazım (char==char)
        System.out.println(firstChar);


        //practiceExend.practice 5: valueOf(); String return type'inin dönüşümünü yapar int ==> String gibi

        int value=30;
        String s1 = String.valueOf(value);
        System.out.println(s1+10);

        //practiceExend.practice 6: valueOf(); boolean to String

        boolean bol = true;
        boolean bol2 = false;
        String a1 = String.valueOf(bol);
        String a2 = String.valueOf(bol2);
        System.out.println(a1);
        System.out.println(a2);

        //practiceExend.practice 7:

        char fourthChar = a.charAt(3);
        char thirdLastChar = a.charAt(24);

        // alt alta
        System.out.println(fourthChar);
        System.out.println(thirdLastChar);

        // yan yana 1. yol
        System.out.print(thirdLastChar);
        System.out.println(fourthChar);

        // yanyana 2. yol

        System.out.println("" + thirdLastChar + thirdLastChar);

        //practiceExend.practice 8: kullanılan karakter sayısı

        int aLength = a.length();
        System.out.println(aLength);

        //practiceExend.practice 9: ilk 4 karakteri alma

        String sub1 = a.substring(0,4);
        System.out.println(sub1);

        //practiceExend.practice 10: belli bir kelimeyi alma
        String b = "Can you explain who are we?";

        String sub2 = b.substring(0,3);
        // [0,4) kelimenin olduğu aralıkta kelimenin ilk hafinin index i yazılır,
        // bittiği harften sonraki index yazılır
        System.out.println(sub2);

        String sub3 = b.substring(4,7);
        System.out.println(sub3);

        //practiceExend.practice 11: bir karakterden başlayıp Stringin sonuna kadar alma

        String sub4 = b.substring(8);
        System.out.println(sub4);

        //practiceExend.practice 12: bir kelimenin olup olmadığını control etme

        boolean isExist = b.contains("explain");
        System.out.println(isExist);

        // boolean'ı Stringe çevirelim

        String isExistValuOf = String.valueOf(isExist);
        System.out.println(isExistValuOf);

        //practiceExend.practice 13: belli bir harfle başlıyor mu?

        boolean isStart = b.startsWith("Can");
        System.out.println(isStart);

        // practiceExend.practice 14: mesela 9. karakterden itibaren belli bir harfle başlıyor mu?

        boolean isBegin = b.startsWith("y",4);
        System.out.println(isBegin);












    }
}
