package practices.practiceExtend.practices;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutRepetition {
    public static void main(String[] args) {

        //example 1 : type elements of given the List without repetition
        //  [2, 3, 2, 2, 3, 5] ==> [2, 3, 5]

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        System.out.println(myList);//[2, 3, 2, 2, 3, 5]

        List<Integer> newList = new ArrayList<>();
        for(Integer w: myList){
            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);//[2, 3, 5]

    }
}














