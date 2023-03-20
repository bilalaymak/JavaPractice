package practices.practiceExtend.stringmanipulation;

import java.util.Scanner;

public class StringManipulations05 {
    public static void main(String[] args) {

      /*Soru 1) Kullanicidan email adresini girmesini isteyin,
                gmail@gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
                @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir email giriniz");
        String email=scan.nextLine();


        if (!email.contains("@gmail")){
            System.out.println("lutfen gmail adresi giriniz");

        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("Email adresi kaydedildi");

        }else {
            System.out.println("lutfen yazimi kontrol edin");
        }




    }
}
