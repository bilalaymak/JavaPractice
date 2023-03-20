package practices.practiceExtend.practices.ifelseif;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {


        //question 1:

        int y = 12;
        int x = y%2==0 ? 3*y : 5+y;
        System.out.println(x);//36

        //question 2:

        Scanner scan = new Scanner(System.in);
        System.out.println("Ürün miktarını sayı olarak giriniz");
        int miktar = scan.nextInt();
        System.out.println("Ürün birim fiyatını giriniz");
        double fiyat = scan.nextDouble();
        double result = miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar;
        System.out.println(result);


        //question 3:

        /*
        1) Kullanıcı herhangi bir gün sayısı girdiğinde o gunun
        ve sonraki günlerin isimlerini ekranda
        görmek istiyor.
        2) default mesajını geçerli gün sayısı girdiğinde görmek istemiyor.
        Buna göre yukarıdaki kod'dan kac tane "break;" kodunu silmelidir?
         */

        System.out.println("gun sayisini giriniz");
        int dayNum = scan.nextInt();
        switch(dayNum) {
            case 1:
                System.out.println("Sunday");

            case 2:
                System.out.println("Monday");

            case 3:
                System.out.println("Tuesday");

            case 4:
                System.out.println("Wednesday");

            case 5:
                System.out.println("Thursday");

            case 6:
                System.out.println("Friday");

            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid day number");
        }

        System.out.println("*******************");
        //question 4:

        char ch = 'a';
        switch (ch){
            case 'a' :
            case 'A' :
                System.out.print(ch);
                break;
            case 'b' :
            case 'B' :
                System.out.print(ch);
                break;
            case 'c' :
            case 'C' :
                System.out.print(ch);
                break;
            case 'd' :
            case 'D' :
                System.out.print(ch);
        }




    }
}









