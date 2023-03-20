package practices.practiceExtend.practices.x1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

          /* TASK 1:

        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */


        Scanner input =new Scanner(System.in);

        while (true){
            System.out.println("email adresinizi girin");
            String email = input.next();
            if (!email.contains("@")){
                System.out.println("gecerli bir email adresi girin");
            }
            else if (email.endsWith("gmail.com")) {
                System.out.println("email onaylandi");
                break;
            }
            else  {
                System.out.println("lutfen gmail hesabinizi girin");

            }
        }







    }
}
