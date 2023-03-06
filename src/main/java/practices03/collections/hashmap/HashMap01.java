package practices03.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("book", "kitap");
        dictionary.put("table", "masa");
        dictionary.put("computer", "bilgisayar");
        System.out.println(dictionary);//{computer=bilgisayar, book=kitap, table=masa}
        System.out.println(dictionary.containsKey("book"));//true
        System.out.println(dictionary.get("book"));//kitap
        System.out.println(dictionary.containsValue("kitap"));//true
        System.out.println(dictionary.containsValue("bilgisayar"));//true
        dictionary.remove("book");
        System.out.println(dictionary);//{computer=bilgisayar, table=masa}
        System.out.println(dictionary.values());//[bilgisayar, masa]
        System.out.println(dictionary.keySet());//[computer, table]
        System.out.println(dictionary.containsKey("book"));//false
        System.out.println(dictionary.size());//2
        dictionary.put("phone","telefon");
        System.out.println(dictionary);//{computer=bilgisayar, table=masa, phone=telefon}

        for (String w : dictionary.keySet()){
            System.out.println(w);
        }
        System.out.println("********************");


        for (String w : dictionary.keySet()){
            System.out.println("item = " + w + "; translation = " + dictionary.get(w) + ";");
        }
        System.out.println("**********************");


        for (String w : dictionary.values()){
            System.out.println(w);
        }
        for (Map.Entry<String, String> w : dictionary.entrySet()){
            System.out.println(w);
        }



    }
}
