package practices.practiceExtend.practices;

import java.util.Scanner;

public class Odev02 {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String isim;
        String soyIsim;
        int yas;
        double kilo;
        double boy;
        int ay;


        System.out.println("isminizi giriniz");
        isim = scan.next();

        System.out.println("soy isminizi giriniz");
        soyIsim = scan.next();

        System.out.println("yaşınızı giriniz");
        yas = scan.nextInt();

        System.out.println("kilonuzu giriniz");
        kilo = scan.nextDouble();

        System.out.println("kaç ay devam edeceksiniz?");
        ay = scan.nextInt();

        if(ay<=6){
            int baslangicAylikUcret = ay * 20;
            System.out.println("ödeme yapacağınız ücret:" + baslangicAylikUcret + "$'dır");
        }
        else if (ay<= 12){
            int genisAylikUcret = ay * 15;
            System.out.println("ödeme yapacağınız ücret" + genisAylikUcret + "$'dır");
        }



    }
}
