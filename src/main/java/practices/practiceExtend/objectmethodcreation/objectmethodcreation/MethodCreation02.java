package practices.practiceExtend.objectmethodcreation.objectmethodcreation;

import java.util.Scanner;

public class MethodCreation02 {
    public static void kutuhaneIsmi() {
        System.out.println("Halk Kutuphanesi");
    }

    public static void kitapIsmi() {
        System.out.println("Kırmızı Baslıklı kız");
    }


    // 10 kere java yazan metod
    public static void javaYazma(int a) {
        int i;
        for (i = 0; i < a; i++) {
            System.out.println("Java");


        }

    }

    public static String tersCevir(String kelime) {
        String sonuc = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {

            sonuc = sonuc + kelime.charAt(i);

        }

        return sonuc;

    }public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String kelime=scan.nextLine();
        System.out.println(tersCevir(kelime));
    }
}


