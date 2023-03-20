package practices.practiceExtend.objectmethodcreation.objectmethodcreation;

public class MethodCreation01 {
    //string'i yazdiran method olusturalım
    //hosgeldiniz diyen bir method olusturun
    //kapanma mesajı yazan bir method olustur

        //degerli arkadaslar SSG derslerine hosgeldiniz
        //Ali can bey
        //iki sayiyi bolme yapınız
        //bizi tercih ettginiz icin tesekker ederiz


    public static void hosgeldiniz(){
        System.out.println("degerli arkadaslar SSG derslerine hosgeldiniz");
    }

    public static void IsimVeSoyIsim(String isim, String soyIsim){
        System.out.println(isim+ " "+ soyIsim);
    }
    public static void kapanmaMesaji(){
        System.out.println("bizi tercih ettginiz icin tesekker ederiz");
    }
    public static void StringYazdir(){
        System.out.println("iki sayiyi bolme yapınız");
        Calculator.bolme(65,5);
    }

}
