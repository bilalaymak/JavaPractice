package practices.practiceExtend.Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //  Scanner input = new Scanner(System.in); input da yazılabilir
        // next(); method kullanıcıdan "tek kelimelik " string almak için kullanılır


        /* Kullaniciya ad , memleket , yas, boy ,
        yasadigi yeri sevip sevmedigini soran bir program yaziniz
        */
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lütfen memleketinizi giriniz");
        String memleket = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("Lütfen boyunuzu giriniz");
        double boy = scan.nextDouble();

        System.out.println("Lütfen yaşadıoğınız şehri sevip sevmediğinizi yazınız");
        boolean seviyorMu = scan.nextBoolean();

        System.out.println("********************");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

    }
}
