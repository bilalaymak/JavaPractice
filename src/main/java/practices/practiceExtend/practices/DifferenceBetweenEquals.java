package practices.practiceExtend.practices;

public class DifferenceBetweenEquals {
    /*
        Stack Memory'de
        1)Primitive Data'lar depolanir
        2)Non-primitive'lerin adresleri depolanir.(Reference)
         Heap Memory'de Non-primitive'ler depolanir.

          String s = "Tom";
    String t ="Terry";
    String r = "Tom";
    1) s==t ==> i) Adres ===> farkli
                ii)Deger ===>farkli

    2) s.equals(t) ==> i) Value ==>farkli
       s.equals(r) ==>  i) Value ==> Ayni
       Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
      Niye ?
      Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
      ikisi de ayni ise siz String'ler esittir dersiniz ama biz code yazarken genellikle String'lerin
      adres'leri ile degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.

      "equals()" method'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
      bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
      ihtiyac duydugumuz seydir.

        */

}