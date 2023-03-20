package practices.practiceExtend.Scanner;

import java.util.Scanner;

public class ScanAndMethod {/*gömlek ve ayakkabı fiyatları için iki tane variable oluşturup toplam fiyatı ekrana
    yazdırın
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int gomlekAdedi;
        double gomlekFiyati = 350 ;
        int ayakkabiAdedi;
        double ayakkabiFiyati =1000 ;

        System.out.println("almak istedğiniz gömlek adedini giriniz");
        gomlekAdedi = scan.nextInt();

        System.out.println("almak istediğiniz ayakkabı adedini giriniz");
        ayakkabiAdedi =  scan.nextInt();

        double toplamUcret = alisverisIslemi(gomlekAdedi,gomlekFiyati,ayakkabiAdedi,ayakkabiFiyati);
        System.out.println("toplamUcret = " + toplamUcret);


    }




    private static double alisverisIslemi(int gomlekAdedi, double gomlekFiyati,int ayakkabiAdedi,double ayakkabiFiyati) {
        return gomlekAdedi * gomlekFiyati + ayakkabiAdedi * ayakkabiFiyati;
    }

}
