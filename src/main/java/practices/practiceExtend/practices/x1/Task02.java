package practices.practiceExtend.practices.x1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /* TASK 2:

        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor
        !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve
        çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.
        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
        80(80dahil)   ile 90 arasında ise  BA,
        70(70 dahil)   ile 80 arasında ise BB,
        60(60dahil) ile 70 arasında ise CB,
        50(50 dahil) ile 60 arasında ise CC,
        40(40 dahil) ile 50 arasında ise DC,
        30(30 dahil) ile 40 arasında ise DD,
        30 'dan düşük ise FF            gelmeli.
         */

        Scanner input =new Scanner(System.in);

        // vize sinav sonucu
        System.out.println("vize sinav sonucunu (0-100) giriniz");
        double vizeSinavSonucu = input.nextDouble();
        while (vizeSinavSonucu <0 || vizeSinavSonucu > 100){
            System.out.println("gecersiz bir not girildi. lutfen vize sinav sonucunu (0-100) girin");
            vizeSinavSonucu = input.nextDouble();
        }
        //final sinav sonucu
        System.out.println("final sinav sonucunu (0-10) giriniz");
        double finalSinavSonucu = input.nextDouble();
        while (finalSinavSonucu <0 || finalSinavSonucu > 100){
            System.out.println("gecersiz bir not girildi. lutfen final sinav sonucunu (0-100) girin");
            finalSinavSonucu = input.nextDouble();
        }

        //vize yuzdesi
        System.out.println("vize sinav yuzdesini (%0-100) giriniz");
        double vizeYuzdesi = input.nextDouble();
        while (vizeYuzdesi < 0 || vizeYuzdesi > 100){
            System.out.println("Geçersiz yuzde girildi. Lütfen vize sinavinin yuzdesini (%0-100) girin: ");
            vizeYuzdesi = input.nextDouble();
        }

        //final yuzdesi
        System.out.println("final sinav yuzdesini (%0-100) giriniz");
        double finalYuzdesi = input.nextDouble();
        while (finalYuzdesi < 0 || finalYuzdesi >100){
            System.out.println("gecersiz bir yuzde girildi. lutfen final sinavinin yuzdesini (%0-100) girin");
            finalYuzdesi = input.nextDouble();
        }
        //yuzdelerin toplami 100 olmali ve 0 ile 100 arasindaki bir sayi olmali
        //dolayisiyla yeni bir while-loop belirledik
        while (vizeYuzdesi + finalYuzdesi != 100){
            System.out.println("Geçersiz yuzde girildi. Lütfen vize ve final yuzdelerinin toplami 100'u gecmesin");
            System.out.println("lutfen tekrardan vize ve final yuzdesini sirasiyla girin");
            vizeYuzdesi = input.nextDouble();
            finalYuzdesi = input.nextDouble();
        }

        //vize ve final notlarinin ortalamasini alacagiz

            double sonucOrtalama = (vizeSinavSonucu * vizeYuzdesi) / 100 + (finalSinavSonucu * finalYuzdesi) / 100;
            System.out.println("dersin not ortalamasi: " + sonucOrtalama);

            // Harf notu belirle
            String harfNotu;
            if (sonucOrtalama >= 90) {
                harfNotu = "AA";
            } else if (sonucOrtalama >= 80) {
                harfNotu = "BA";
            } else if (sonucOrtalama >= 70) {
                harfNotu = "BB";
            } else if (sonucOrtalama >= 60) {
                harfNotu = "CB";
            } else if (sonucOrtalama >= 50) {
                harfNotu = "CC";
            } else if (sonucOrtalama >= 40) {
                harfNotu = "DC";
            } else if (sonucOrtalama >= 30) {
                harfNotu = "DD";
            } else {
                harfNotu = "FF";
            }

            System.out.println("Dersin harf notu: " + harfNotu);










    }
}
