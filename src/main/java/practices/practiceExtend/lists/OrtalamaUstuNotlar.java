package practices.practiceExtend.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrtalamaUstuNotlar {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız,
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner input = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();
        String karar;
        int counter = 0;

        //kullanicidan istedigi kadar not girmesini iste
        do {
            counter++;
            System.out.println(counter + ". eklemek istediginiz notu giriniz");
            notlar.add(input.nextDouble());
            System.out.println("cikmak icin H, yeniden not girmek icin herhangi baska bir karakter giriniz");
            karar = input.next();

        }while (!karar.equalsIgnoreCase("H"));
        System.out.println("notlar = " + notlar);

        //ortalamayi hesapla

        double toplam = 0;
        for(double w: notlar){
            toplam += w;
        }
        double ortalama = toplam/ notlar.size();
        System.out.println("ortalama = " + ortalama);

        //ortalama ustu not sayisini bul

        int ortalamaUstuNotSayisi = 0;
        for (double w: notlar ){
            if (w>ortalama){
                ortalamaUstuNotSayisi++;
            }
        }
        System.out.println("ortalamaUstuNotSayisi = " + ortalamaUstuNotSayisi);

    }
    /*
    notlar = [50.0, 90.0, 40.0, 100.0]
    ortalama = 70.0
    ortalamaUstuNotSayisi = 2
     */

}
