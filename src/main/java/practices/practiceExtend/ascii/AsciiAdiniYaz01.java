package practices.practiceExtend.ascii;

public class AsciiAdiniYaz01 {
    public static void main(String[] args) {
        //Adınızın içerdiği harfleri ve ascii table kullanmadan, adınızı yazdıran bir kod yazınız.

        char ch1 = 'B'-1;//A
        char ch2 = 'm'-1;//l
        char ch3 = 'h'+1;//i
        System.out.println('Z'-1);//89
        System.out.println(ch1+ch2+ch3);//278
        System.out.println(""+ ch1+ch2+ch3);//Ali

//Not: Char'lari matematik islemine tabii tutarsak ascii degerlerinden matematik islemi yapmis olur
//Not: Char'lari eger string (concatation) islemine tabii tutarsak sonuc asagidaki gibi olur
//Not: Char bir degiskene deger atarsak bize ascii karsiligini verir


    }
}
