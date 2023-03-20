package practices.practiceExtend.stringmanipulation;

public class StringManipulation07 {
    public static void main(String[] args) {
        // soru
        // kisi isimleri icin 3 String degisken olusturunuz. Bosluk karakterleri
        // haric 3 isimdeki karakter sayisinin toplamini yazdiriniz

        String isim1 = "Ali Can";
        String isim2 ="Ahmet Furkan";
        String isim3 = "Omer Faruk";

        int c1 = isim1.replaceAll("\\s","").length();
        int c2 = isim2.replaceAll("\\s","").length();
        int c3 = isim3.replaceAll("\\s","").length();
        System.out.println(c1+c2+c3);

    }
}
