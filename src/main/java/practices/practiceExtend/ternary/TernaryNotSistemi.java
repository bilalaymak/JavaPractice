package practices.practiceExtend.ternary;

import java.util.Scanner;

public class TernaryNotSistemi {
    public static void main(String[] args) {
        /*
   Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.
   (Ternary kullanınız)
   (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
    */

        //fazla secenekli durumlarda switch kullanilir normalde
        // ama soruda ternary isteniyor

        Scanner input = new Scanner(System.in);
        System.out.println("notunuzu sayi cinsinden giriniz");
        int notSayi = input.nextInt();

        String notHarf =
                notSayi > 100 ?
                "0 ile 100 arasi bir not giriniz" : notSayi > 89 ?
                "A" : notSayi > 79 ?
                "B" : notSayi > 69 ?
                "C" : notSayi > 59 ?
                "D" : notSayi > 49 ?
                "E" : notSayi > -1 ?  "F" : "0 ile 100 arasi bir not giriniz";

        //biz kodumuzda kritik noktalari test etmemiz gerekiyor ==> -1, 49, 101

        System.out.println("notHarf = " + notHarf);



    }
}
