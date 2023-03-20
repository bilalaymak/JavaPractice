package practices.practiceExtend.stringmanipulation;

public class StringManipulation08 {
    public static void main(String[] args) {
        /*Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.

         */

        String isim = "Omer Faruk ";
        int sonKarakterIndex = isim.trim().length()-1;
        String sonKarakter = isim.substring(sonKarakterIndex,sonKarakterIndex +1);
        System.out.println(sonKarakter);

        /*soru
        Bir String değişkeni oluşturunuz ve ilk
        karakteri dışındaki tüm karakterleri konsolda yazdırınız
         */

        String str = "Java ogreniyorum";
        String exceptForFirst = str.substring(1);
        System.out.println("ilk karakter disindaki tum karakterler : "+ exceptForFirst);

        /*
        Bir String’ in belirli bir tek karaktere sahip olup
        olmadığını üç farklı şekilde kontrol etmek için kod yazınız
         */
        //1. yol

        boolean sonuc = str.contains("o");// burada harf secerek kontrol ediyoruz
        System.out.println(sonuc);

        boolean sonuc2 = str.replaceAll("v", "").length()>0;

        boolean sonuc3 = str.indexOf("v")!= -1;
        System.out.println(sonuc2);




    }
}
