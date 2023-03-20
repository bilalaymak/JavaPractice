package practices.practiceExtend.random;

import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {

        /*
        Taş-Kağıt-Makas oyunu yazınız.
        -Oyuncudan tahmin alınız.
        -Bilgisayarın tahmini ile karşılaştırınız.
        -3'e ilk ulaşan kazanır
        -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.

         */

        Scanner input = new Scanner(System.in);
        int oyuncununKazanmaSayisi = 0;
        int bilgisayarinKazanmaSayisi = 0;
        int sayac = 0;

        while (true){

            while (oyuncununKazanmaSayisi<3 && bilgisayarinKazanmaSayisi<3){
                sayac++;
                System.out.println(sayac + ". secimi giriniz: \nTas \nKagit \nMakas");
                String oyuncuTahmini = input.next().toLowerCase().trim();
                if (!(oyuncuTahmini.equalsIgnoreCase("tas") ||
                        oyuncuTahmini.equalsIgnoreCase("kagit") ||
                        oyuncuTahmini.equalsIgnoreCase("makas" )
                )){
                    System.out.println("gecerli bir tahmin giriniz");
                    sayac--;
                    continue;
                }

                //bilgisayarin tahmini
                String arr[] = {"Tas","Kagit","Makas"};
                int rastgeleIdx =  (int) (Math.random()*3);//0, 1, 2 verecek bize
                String bilgisayarTahmini = arr[rastgeleIdx];
                System.out.println("bilgisayarTahmini = " + bilgisayarTahmini);


                if (oyuncuTahmini.equalsIgnoreCase(bilgisayarTahmini)){
                    System.out.println("\nberabere! skor: " + oyuncununKazanmaSayisi + "==" + bilgisayarinKazanmaSayisi);
                } else if (oyuncuTahmini.equalsIgnoreCase("tas") &&bilgisayarTahmini.equalsIgnoreCase("makas") ||
                        oyuncuTahmini.equalsIgnoreCase("kagit") &&bilgisayarTahmini.equalsIgnoreCase("tas") ||
                        oyuncuTahmini.equalsIgnoreCase("makas") &&bilgisayarTahmini.equalsIgnoreCase("kagit")) {
                    oyuncununKazanmaSayisi++;
                    System.out.println("\nkazandiniz! skor: " + oyuncununKazanmaSayisi + " == " + bilgisayarinKazanmaSayisi);

                }else {
                    bilgisayarinKazanmaSayisi++;
                    System.out.println("\nbilgisayar kazandi! skor: " + oyuncununKazanmaSayisi + " == " + bilgisayarinKazanmaSayisi);

                }


            }

            System.out.println("===oyun bitti===");

            String skor = "";

            if (oyuncununKazanmaSayisi==3){
                if (oyuncununKazanmaSayisi-bilgisayarinKazanmaSayisi==3){
                    skor = "Altin";
                } else if (oyuncununKazanmaSayisi-bilgisayarinKazanmaSayisi==2) {
                    skor = "Gumus";
                }else {
                    skor = "Bronz";
                }
                System.out.println(skor + " skor ile kazandiniz! tebrikler!");

            }else{
                System.out.println("bilgisayar " + skor + " skor ile kazandi!");
            }

            System.out.println("devam etmek istiyor musunuz? ( evet/hayir");
            String devam = input.next();
            while (true){
                if (devam.equalsIgnoreCase("hayir")){
                    break;
                } else if (!(devam.equalsIgnoreCase("evet") || devam.equalsIgnoreCase("hayir"))) {
                    System.out.println("yanlis girdiniz tekrar giriniz? (evet/hayir)");
                }
            }


        }


    }
}










