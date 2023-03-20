package practices.practiceExtend.switchs;

import java.util.Scanner;

public class AyGunleri {
    public static void main(String[] args) {

        /*
       Girilen yıl ve ay numarasına göre ayın kaç gün olduğunu yazdıran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
      */

        Scanner input = new Scanner(System.in);
        System.out.println("yili giriniz");
        int yil = input.nextInt();
        System.out.println("ay numarasini giriniz");
        int ay = input.nextInt();

        switch (ay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("girdiginiz ayin gun sayisi: 31");
            break;
            case 4: case 6: case 9: case  11:
                System.out.println("girdiginiz ayin gun sayisi: 30");
                break;
            case 2:
                if(yil%4==0 && yil%100!=0 || yil%400==0){
                    System.out.println("girdiginiz ayin gun sayisi: 29");
                }else {
                    System.out.println("girdiginiz ayin gun sayisi: 28");
                }
                break;
            default:
                System.out.println("gecerli bir ay numarasi giriniz");
        }




    }
}
