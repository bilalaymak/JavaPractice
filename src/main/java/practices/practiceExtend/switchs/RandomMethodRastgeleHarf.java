package practices.practiceExtend.switchs;

public class RandomMethodRastgeleHarf {



          /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.
        */

      //  Math.random(); "0 ile 1 arasinda ondalik bir sayi verir"


    public static void main(String[] args) {

        String rastgeleHarf = rastgeleHarf().toLowerCase();

        switch (rastgeleHarf) {
            case "a":
                System.out.println("İlk karakter");
                break;
            case "b":
                System.out.println("İkinci karakter");
                break;
            case "c":
                System.out.println("Üçüncü karakter");
                break;
            case "d":
                System.out.println("Dördüncü karakter");
                break;
            default:
                System.out.println("Diğer karakterler");

        }

        System.out.println("****************************");


        System.out.println(rastgeleHarf());
        String x;
        do {
            x = rastgeleHarf();
            System.out.println(x);
        }while (!x.equals("z"));


    }

    public static String rastgeleHarf() {
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alfabe.length();
        int rastgeleIndex = (int) (Math.random() * maxIndex);

        return alfabe.substring(rastgeleIndex, rastgeleIndex + 1);
    }


}





















