package practices.practiceExtend.practices.x2.task02;

public class Main {



    public static void main(String[] args) {
        Bakkal bakkal = new Bakkal();
        bakkal.kazanclariAl();
        System.out.println("Ortalama kazanc: " + bakkal.getOrtalamaKazanc());
        System.out.println("Ortalamanın üstünde kazancı olan günler: " + bakkal.getOrtalamaninUstundeKazancGunleri());
        System.out.println("Ortalamanın altında kazancı olan günler: " + bakkal.getOrtalamaninAltindaKazancGunleri());
    }
}
