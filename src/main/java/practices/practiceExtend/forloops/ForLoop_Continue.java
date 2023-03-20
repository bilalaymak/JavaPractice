package practices.practiceExtend.forloops;

import java.util.Scanner;

public class ForLoop_Continue {
    public static void main(String[] args) {

/*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.
      */


        Scanner input = new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i < 6; i++) {
            System.out.println(i + ". sayiyi giriniz");
            int sayi = input.nextInt();
            if(i>5 && i<10){
                System.out.println("5 ile 10 arasindaki sayilar toplama dahil edilemez");
                continue;// yani continuedan sonrasindaki kodlar calismayacak
            }
            toplam += sayi;
        }
        System.out.println("toplam: " + toplam);


    }
}










