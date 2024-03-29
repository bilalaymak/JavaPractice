package step03.collections;

import java.util.LinkedList;



public class LinkedList02 {
    public static void main(String[] args) {

        LinkedList<Integer> ll3 = new LinkedList<>();
        ll3.add(0, 12); // When I want to use order for the elements, I can place at specific indexes my list elements
        ll3.add(1, 13);
        ll3.add(2, 10);
        ll3.add(3, 11);

        System.out.println(ll3);//[12, 13, 10, 11]

        Integer first1 = ll3.remove(); // retrieve the first element and will remove it from the list
        System.out.println(first1);//12
        System.out.println(ll3);//[13, 10, 11]

        Integer first2 = ll3.remove(2);//11
        System.out.println(first2); // retrieve 2 index element and remove it from the list
        System.out.println(ll3);//[13, 10]

        ll3.add(13);
        ll3.add(10);
        ll3.add(13);

        System.out.println(ll3); //[13, 10, 13, 10, 13]
        ll3.removeFirstOccurrence(13);

        System.out.println(ll3); //[10, 13, 10, 13]

        ll3.removeLastOccurrence(13);
        System.out.println(ll3); //[10, 13, 10]


        LinkedList<Integer> ll4 = new LinkedList<>();

        ll4.add(3);
        ll4.add(12);
        ll4.add(13);

        System.out.println(ll4); // [3, 12, 13]

        ll3.removeAll(ll4);// removes all common elements of ll4 from ll3
        //[10, 13, 10]  [3, 12, 13]
        System.out.println("removeAll() gives = " + ll3); //[10, 10]

        System.out.println(ll4); //[3, 12, 13]
        ll4.addAll(ll4);
        System.out.println(ll4); //[3, 12, 13, 3, 12, 13]

        ll4.addAll(1, ll3); // adding all elements of a list at a specific index
        System.out.println(ll4); // [3, 10, 10, 12, 13, 3, 12, 13]

        ll4.addFirst(100);
        ll4.addLast(900);
        System.out.println(ll4); //[100, 3, 10, 10, 12, 13, 3, 12, 13, 900]

        ll4.set(4, 200);
        System.out.println(ll4);


    }
}
