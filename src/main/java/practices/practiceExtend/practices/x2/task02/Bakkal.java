package practices.practiceExtend.practices.x2.task02;

import java.util.ArrayList;
import java.util.Scanner;

/* TASK :
 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
 *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *           ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
 *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *           ortalama kazançtan aşağıysa o günleri return yap.
 *
 *
 */


public class Bakkal {

    //1. adim günleri tutacağımız ArrayList
    public static ArrayList<String> gunler;
    //2. adim günlük kazançları tutacağımız ArrayList
    public static ArrayList<Double> gunlukKazanclar;


    Scanner input = new Scanner(System.in);

    public Bakkal() {
        // 7 günün günlerini gunler ArrayList'ine ekleyelim
        gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
    }

    // Günlük kazançları alacağımız method
    public void kazanclariAl() {
        // gunlukKazanclar ArrayList'ini oluşturalım
        gunlukKazanclar = new ArrayList<>();
        int i = 0;
        while ( i < gunler.size()) {
            // Kullanıcıdan gün için günlük kazanç alalım
            System.out.print(gunler.get(i) + " günü için günlük kazancı girin: ");
            double gunlukKazanc = input.nextDouble();
            gunlukKazanclar.add(gunlukKazanc);
            i++;
        }
    }

    // Ortalama kazancı hesaplayacağımız method
    public double getOrtalamaKazanc() {
        double toplam = 0;
        for (double w : gunlukKazanclar) {
            toplam += w;
        }
        return toplam / gunler.size();
    }

    // Ortalamanın üstünde kazancı olan günleri bulacağımız method
    public ArrayList<String> getOrtalamaninUstundeKazancGunleri() {
        ArrayList<String> ustundeKazancGunleri = new ArrayList<>();
        double ortalamaKazanc = getOrtalamaKazanc();
        for (int i = 0; i < gunler.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalamaKazanc) {
                ustundeKazancGunleri.add(gunler.get(i));
            }
        }
        return ustundeKazancGunleri;
    }

    // Ortalamanın altında kazancı olan günleri bulacağımız method
    public ArrayList<String> getOrtalamaninAltindaKazancGunleri() {
        ArrayList<String> altindaKazancGunleri = new ArrayList<>();
        double ortalamaKazanc = getOrtalamaKazanc();
        for (int i = 0; i < gunler.size(); i++) {
            if (gunlukKazanclar.get(i) < ortalamaKazanc) {
                altindaKazancGunleri.add(gunler.get(i));
            }
        }
        return altindaKazancGunleri;
    }
}


