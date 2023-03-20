package practices.practiceExtend.practices.x2.task01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

    /* TASK:
         tas >makas
         makas >kagit
         kagit >tas
    1) Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    2) Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    3) While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
    4) Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    5) Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
    6) Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    7) En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
       dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
     */
        //1) Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
        Scanner input = new Scanner(System.in);

        //2) Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
        int kullaniciPuani = 0;
        int bilgPuani = 0;

        //3) While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.

        while (true) {
            //kullanicidan secim aliyoruz
            System.out.println("lutfen secim yapin (tas,kagit,makas) : ");
            String kullaniciSecimi = input.nextLine();

            //4) Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz
            //5) Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
            int randomNumber = (int) (Math.random() * 3);
            String bilgSecimi = "";

            if (randomNumber == 0){
                bilgSecimi = "tas";
            } else if (randomNumber == 1) {
                bilgSecimi = "makas";
            }else {
                bilgSecimi = "kagit";
            }

            //6) Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.

            System.out.println("kullanicinin secimi : " + kullaniciSecimi);
            System.out.println("bilgisayarin secimi = " + bilgSecimi);

            if (kullaniciSecimi.equals(bilgSecimi)){
                System.out.println("berabere");
                kullaniciPuani++;
                bilgPuani++;
            } else if (//kullanicinin kazandigi rakamlar
                    (kullaniciSecimi.equals("tas") && bilgSecimi.equals("makas")) ||
                            (kullaniciSecimi.equals("makas") && bilgSecimi.equals("kagit")) ||
                            (kullaniciSecimi.equals("kagit") && bilgSecimi.equals("tas") ))
            {

                kullaniciPuani++;
                System.out.println("kullanici kazandi!! puaniniz = " + kullaniciPuani + " bilgisayar puani = " + bilgPuani);
            }else {
                bilgPuani++;
                System.out.println("bilgisayar kazandi!! bilgisayar puani = " + bilgPuani + " kullanici puani = " + kullaniciPuani);

            }

            //7) En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
            //       dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
            System.out.println("oyuna devam etmek istiyor musunuz? (evet/hayir)");
            String devam = input.nextLine();
            if (!devam.equals("evet")){
                break;
            }

        }//while-brace


        System.out.println("oynadiginiz icin tesekkur ederiz!!");




    }
}

