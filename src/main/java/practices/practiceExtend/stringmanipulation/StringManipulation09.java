package practices.practiceExtend.stringmanipulation;

public class StringManipulation09 {
    public static void main(String[] args) {

        String a = "tell something bro";

        //practiceExend.practice 1: endsWith methodu
        // "bro" ile bitip bitmediğini kontrol edin

        boolean isEnd = a.endsWith("bro");
        System.out.println(isEnd);


        //practiceExend.practice 2: replace methodu
        // bir kelimeyi başka bir kelime ile değiştirme

        String a1 = a.replace("bro","dude");
        System.out.println(a1);

        //practiceExend.practice 3:
        //kelime değiştirme
        String a2 = a.replace("tell","say");
        System.out.println(a2);

        //char olan harf değiştirme
        String a3 = a.replace('e','*');
        System.out.println(a3);

        //harfi harf blokuyla değiştirme

        String a4 = a.replace("e","XXX");
        System.out.println(a4);

        //harf, kelime silme
        String a5 = a.replace("e","");
        System.out.println(a5);

        String t = "5 kişi 90 gün ders çalışacak";

        //practiceExend.practice 4: replaceAll methodu; bir grup datayı değiştirme methodu
        // "regular expressions" (regex) kullanılır

        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        //practiceExend.practice 5: tüm rakam ve harfleri "!" e çevirme

        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);

        //practiceExend.practice 6: tüm sesli harfleri "?" e çevirme

        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);

        //practiceExend.practice 7: kucuk harfler disindaki tum character'leri "<>" cevirme

        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        //practiceExend.practice 8: tüm harfler dışındaki tüm karakterleri "+" ya çevirme

        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //practiceExend.practice 9: space'ler disindaki tum character'leri "+" cevirme

        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);// +++ ++ ++++++++++++++

        //practiceExend.practice 10: sesli harfler'ler disindaki tum character'leri "&" cevirme

        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);// A&i&&&&&a&i&&a&i&&&&&












    }
}
