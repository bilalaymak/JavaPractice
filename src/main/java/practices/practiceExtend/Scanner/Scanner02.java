package practices.practiceExtend.Scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        // EX 1) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen toplanacak olan ilk sayıyı giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("Lütfen toplanacak olan ikinci sayıyı giriniz");
        double sayi2 = input.nextDouble();

        System.out.println("Toplam = " + (sayi1 + sayi2));

    }

}
