package practices.practiceExtend.whileloop;

import java.util.Scanner;

public class WlileLoop10KatinaKadar {
    public static void main(String[] args) {


        //Kullanıcıdan alınan bir sayıdan başlayarak ardışık sayıları
        // 10'un katına gelene kadar yazdıran bir kod yazınız.
        //Örn: Sayı: 46 Çıktı: 46, 47, 48, 49

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = input.nextInt();

        while (sayi%10!=0){//eger kosul dogru ise loop u calistir(while'in mantigi)
            System.out.print(sayi+ " ");//46 47 48 49
            sayi++;
        }














    }
}


















