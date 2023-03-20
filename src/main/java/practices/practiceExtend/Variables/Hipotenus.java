package practices.practiceExtend.Variables;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        //Hipotenüs hesaplayan bir kod yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("1. dik kenar uzunlugunu giriniz");
        double a = input.nextDouble();
        System.out.println("2. dik kenar uzunlugunu giriniz");
        double b = input.nextDouble();

        double c =  Math.sqrt(a*a+b*b);//Math.sqrt karekok alma methodu
        System.out.println("hipotemus: " + c);
        System.out.println((int) c);// direct integer a cevirdik
        System.out.printf("%.2f" ,c);// virgulden sonrasini 2 basamakli yapti

    }




}
