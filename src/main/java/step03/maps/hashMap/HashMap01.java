package step03.maps.hashMap;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {

        /*
        Maps use key value pairs structure
        key should be unique but values can be duplicate
        In Maps Keys can not be Null except HashMap
        In HashMaps, you can use Null only once for keys
        but you can have  multiple Nulls for values
        HasMap does not create elements in natural order that's why it is superfast
        HashMap is not thread safe
        HashMap is not synchronized
        When we use maps, if we give key, it will return always the value
         */
        //key    value
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(100, "Ali");
        hm1.put(101, "Veli");
        hm1.put(102, "Kemal");
        hm1.put(103, "Mary");
        hm1.put(null, "Can");
        hm1.put(null, "Fatma");
    //  hm1.put(104, null);
    //  hm1.put(105, null);
        hm1.put(106, "");

        System.out.println("hm1 = " +hm1);//hm1 = {null=Fatma, 100=Ali, 101=Veli, 102=Kemal, 103=Mary, 106=}
        System.out.println(hm1.get(100));//Ali
        System.out.println(hm1.get(null));//Fatma
        //we get values  as array here
       System.out.println("hashmap values to array = " + Arrays.toString(hm1.values().toArray()));
       //hashmap values to array = [Fatma, Ali, Veli, Kemal, Mary, ]

       //we get values from HashMap and converted to array, then took their length and then summed them
        int sum = 0;
        for (String w: hm1.values()){
            sum = sum + w.length();
        }
        System.out.println(sum);//21

        System.out.println("*********************************************");
        System.out.println(hm1);//{null=Fatma, 100=Ali, 101=Veli, 102=Kemal, 103=Mary, 106=}

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(87, "X");
        hm2.put(88, "K");
        hm2.put(89, "L");

        hm1.putAll(hm2); // this will ignore the order of elements when getting new map elements

        /*
        When we merge elements of a Map to another, we have to use the same data types
         */
        System.out.println(hm1);//{null=Fatma, 100=Ali, 101=Veli, 102=Kemal, 103=Mary, 87=X, 88=K, 89=L, 106=}

        hm1.putIfAbsent(102, "Z"); // this means if this key does not exist, then create this with new value

        System.out.println(hm1);//{null=Fatma, 100=Ali, 101=Veli, 102=Kemal, 103=Mary, 87=X, 88=K, 89=L, 106=}
        hm1.putIfAbsent(999, "Z");

        System.out.println(hm1);// if the key does not exist, then it will create new key value pair

        String value = hm1.get(101);// if the key exist, then it will give the value
        String value2 = hm1.get(463);// if the key does not exist, then it will give null the value

        System.out.println(value);
        System.out.println(value2);//this is null

        String value3 = hm1.getOrDefault(999, "There is no key like that..");
        // If you use getOrDefault and you have a valid key, it will return value for the key
        System.out.println(value3);

        String value4 = hm1.getOrDefault(1000, "There is no key like that..");

        //If you do not have valid key, this will return you custom message"There is no key like that.."
        System.out.println(value4);

        Set<Integer> myKeys = hm1.keySet();// this keySet method returns a Set for all keys

        System.out.println("Keys : " + myKeys);

        Collection<String> myValues = hm1.values();// this will return collection for all values
        System.out.println("My Keys : " + myKeys);
        System.out.println("My values : " + myValues);

        Set<Map.Entry<Integer, String>> setForm = hm1.entrySet();
        System.out.println("setForm = " + setForm);


        for (Map.Entry<Integer, String> each : setForm) {

            //System.out.println(each);
            System.out.println("Key : " + each.getKey());
            System.out.println("Value: " + each.getValue());
        }


    }
}
