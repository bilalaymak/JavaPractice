package practices.practiceExtend.stringmanipulation;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {


        /*
                         Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane sembol olsun
                        vi)En az bir tane rakam olsun
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");
        String password = scan.nextLine();

        boolean first = password.length()>7; //en az 8 karakter olsun
        boolean second = !password.contains(" "); //Space karakteri olmasın
        boolean third = password.replaceAll("[^A-Z]","").length()>0;// en az bir tane BÜYÜK harf olsun
        boolean fourth = password.replaceAll("[^a-z]","").length()>0; // en az bir tane küçük harf olsun
        boolean fifth = password.replaceAll("[^a-zA-Z0-9]","").length()>0; //e az bir sembol olsun(harf ve rakam harici her şey)
        boolean sixth = password.replaceAll("[^0-9]","").length()>0;

        System.out.println("is password valid? ==>" + (first&&second&&third&&fourth&&fifth&&sixth));





    }
}
