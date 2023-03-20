package practices.practiceExtend.Scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //TechproEd spor salonu içi kullanıcıdan kayıt için bilgiler alacağız
        //isim,soyisim,yaş,kilo,boy,salona ne kadar devam edeceği ay süresi bilgilerini alıp aylık $20 dolar olarak toplam ücreti yazdırın

        String isim,soyIsim;
        int yas,sure;
        double kilo,boy;
        int totalUcret;

        Scanner scan = new Scanner(System.in);

        System.out.println("TechProEd spor salonuna hoş geldiniz!");

        System.out.println("isminizi giriniz");
        isim = scan.next();

        System.out.println("soyadinizi giriniz");
        soyIsim = scan.next();

        System.out.println("yaşınızı giriniz");
        yas = scan.nextInt();

        System.out.println("kilonuzu giriniz");
        kilo = scan.nextDouble();

        System.out.println("boyunuzu giriniz");
        boy = scan.nextDouble();

        System.out.println("spor salonuna kaç aylık abonman yapmak istiyorsunuz?");
        sure = scan.nextInt();

        totalUcret = sure*20;
        System.out.println("toplam ücret = " + totalUcret + "$'dır");

        System.out.println("adı = "+ isim
                + "\nsoyadı = " + soyIsim
                + "\nyaş = " + yas
                + "\nboy" + boy
                + "\nkilo = " + kilo
                + "\nsure = " + sure
                + "\ntoplam tutar = " + totalUcret + "$'dır");











    }
}
