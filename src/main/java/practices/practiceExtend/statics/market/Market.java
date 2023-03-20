package practices.practiceExtend.statics.market;

import java.time.LocalDate;

public class Market {
    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.
    //Birim fiyatı 99 lira üzeri olan ürünlere %10 vergi indirimi uygulayınız.

// Degisken isimleri ayni ise this keyword'unu kullaniriz.
// Karisiklik olmasin diye this diyerek bu classtaki degisken  oldugunu belirtiyoruz.
// Degisken isimleri farkli ise this keyword'unu kullnamaya gerek yok
String urunAdi;
    Double urunfiyati;
    String sonKullanmaTarihi;

    Market(String urunAdi, double fiyat, int aySonra){
        this.urunAdi = urunAdi;
        if(fiyat>99){
            fiyat=fiyat*0.9;
        }
        urunfiyati = fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }

    Market(String urunAdi, double fiyat){
        this.urunAdi = urunAdi;
        if(fiyat>99){
            fiyat=fiyat*0.9;
        }
        urunfiyati = fiyat;
        sonKullanmaTarihi = "Bu ürünün son kullanma tarihi yoktur";
    }

    public Market() {

    }


    @Override
    public String toString() {
        return "Market{" +
                "ürünAdi='" + urunAdi + '\'' +
                ", ürünfiyati=" + urunfiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }

}
