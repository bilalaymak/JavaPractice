package step03.lists.arraylists;

import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String[] args) {


        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(20);
        numbers.add("Istanbul");//if you don't use "<>" we can add every value in different return types
                                //but it is not threat-safe
        System.out.println(numbers.size());//3
        System.out.println(numbers.get(2));//Istanbul
        numbers.set(0,10);
        System.out.println(numbers);//[10, 20, Istanbul]
        System.out.println(numbers.get(0));//10
        numbers.remove(0);
        System.out.println(numbers);//[20, Istanbul]
      //  numbers.clear();//removes all elements from arraylist

        System.out.println("**********");
        for (Object w:numbers){
            System.out.println(w);
        }

    }
}
