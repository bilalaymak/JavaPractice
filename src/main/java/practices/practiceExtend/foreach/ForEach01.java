package practices.practiceExtend.foreach;

import java.util.Arrays;

public class ForEach01 {
    public static void main(String[] args) {
        /*
         Tek bir String içerisinde verilen euro ve
         dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.

         Örnek:
         String str ="$1 $12 €34 €56 $45 €78";
         dolarToplami: 58
         euroToplami: 168
        */
        String str ="$1 $12 €34 €56 $45 €78";
        str.split(" "); // her biri ($34) stringe cevirdik

        String[]  arr = str.split(" ");
        System.out.println(Arrays.toString(arr));//[$1, $12, €34, €56, $45, €78]

        //foreach yapacagiz

        int dolarTop = 0;
        int euroTop = 0;

        for (String w : arr) {
            if (w.contains("$")){
                dolarTop += Integer.parseInt(w.replaceAll("\\$", ""));//parseInt primitive oldugu icin
                //valueOf yerine parseInt i kullandik
                // $ isareti meta karakter oldugu icin hata verebiliyor dolayisiyle
                //\\$ yapiyoruz
                // \\D digit disindakileri sil demek
            }else {
                euroTop += Integer.parseInt(w.replaceAll("€", ""));
            }
        }
        System.out.println("dolarTop = " + dolarTop);
        System.out.println("euroTop = " + euroTop);


    }
}
