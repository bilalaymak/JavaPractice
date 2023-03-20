package practices.practiceExtend.whileloop;

import java.util.Scanner;

public class IlkVeSonRakamToplami {
    public static void main(String[] args) {

            //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();


        //1. yol

        int sonRakam = sayi%10;
        System.out.println("sonRakam = " + sonRakam);
        int ilkRakam = sayi;

        while (ilkRakam> 9){
            ilkRakam /= 10;

        }
        System.out.println("ilkRakam = " + ilkRakam);
        System.out.println("toplam = " + (ilkRakam + sonRakam));


        //2. Yol:
        System.out.println("==String Ile==");
        String sayiString = String.valueOf(sayi);
        int strIlkRakam1 = Integer.parseInt(sayiString.substring(0,1));
        int strSonRakam1 = Integer.parseInt(sayiString.substring(sayiString.length()-1));
        System.out.println("Toplam2: "+(strSonRakam1 +strIlkRakam1));

    }
}
