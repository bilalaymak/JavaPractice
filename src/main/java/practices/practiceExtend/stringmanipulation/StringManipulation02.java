package practices.practiceExtend.stringmanipulation;

import java.util.Scanner;

public class StringManipulation02 {
    public static void main(String[] args) {


        System.out.println("yuz" + 40 + 60);//yuz4060
        System.out.println("yuz" + (40 + 60));//yuz100   parantez onceligi vardir
        System.out.println("ikibindortyuz" + 40*60); //ikibindortyuz2400 carpma isleminin onceligi vardir
        System.out.println(60 + 40 + "yuz"); //100yuz

        /*
        kullanicidan ismini soyismini isteyin
        kullanici nasil girerse girsin
        tam isiminin buyuk harfle yazilmasini saglayin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        System.out.println("lutfen soyadinizi giriniz");
        String name = scan.nextLine() , surname = scan.nextLine(); //multiple decleration

        String fullname = name.concat(" " + surname).toUpperCase(); //concat Stringleri birlestiriyor ve uppercase le birlestirme yapiyoruz
        System.out.println("fullname = " + fullname);

        //rakam haricindekleri silin

        String str = "$45.99";
        str = str.replaceAll("\\D",""); //rakam harici karakterleri silme
        System.out.println("str = " + str);//4599




        //verilen cumleyi "*" ile gizleyip 10. karakterden sonrasini yazdirin

        String cumle = "her dert java gibi olsa";

        System.out.println(cumle = cumle.replaceAll("\\w", "*") + cumle.substring(10)); // concat ve substring


        // a harfini @ ile degistir // replace, reoplaceAll

        String ders = "olaganustu";

        System.out.println(ders = ders.replaceAll("a", "@"));


        //Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //tum karakterlerin sayisini bulan kodu yaziniz

        String str3 = "Learn Java earn 9000000 money.,!";

        int sonuc = str3.replaceAll("\\W","").replaceAll("\\d","").length();
        System.out.println("sonuc = " + sonuc);
        int sonuc2 = str3.replaceAll("[0-9]","").
                replaceAll(" ", "").
                replaceAll("\\p{Punct}",""). // noktadan sonra enter a bas, duzgun yazmak icin
                length();

        System.out.println("sonuc2 = " + sonuc2);









    }
}
