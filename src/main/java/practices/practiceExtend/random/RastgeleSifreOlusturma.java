package practices.practiceExtend.random;

import java.util.Scanner;

public class RastgeleSifreOlusturma {
    public static void main(String[] args) {

        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("karakter sayisini giriniz");
        int karakterSayisi = input.nextInt();
        int counter = 0;
        String sifre = "";

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex = karakterler.length()-1;
        while (counter< karakterSayisi){
            int randomIndex = (int) (Math.random()* maxIndex);
            sifre += karakterler.charAt(randomIndex);
            counter++;
        }

        System.out.println("sifre = " + sifre);


    }
}












