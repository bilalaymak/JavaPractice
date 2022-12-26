package practices01.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        //when you create an Array, you have to declare the length of the array
        //but when you use "Lists" no need to declare the number of elements at the beginning
        //"lists" are flexible for length but arrays are not

        //lists are for storing multiple data in the samne data type
        //lists store non-primitive data types, arrays cannot
        //lists cannot store primitive data types
        //lists have many useful methods, arrays do not

        //arrays are so fast
        //arrays uses memory so less


         //how to create array lists

        //1. way:
        ArrayList<Integer> myList1 = new ArrayList<Integer>();

        //2. way:
        ArrayList<Integer> myList2 = new ArrayList<>();

        //3. way:
        List<Integer> myList3 = new ArrayList<>();

        //how to print a list on the console
        System.out.println(myList3);//[]

        //how to add elements into a list
        //note: add() method puts the elements in insertion order
        myList3.add(12);
        System.out.println(myList3);//[12]
        myList3.add(7);
        System.out.println(myList3);//[12, 7]
        myList3.add(23);
        System.out.println(myList3);//[12, 7, 23]

        //how to add an element into a specific endex
        myList3.add(1,50);//added it to 1. index
        System.out.println(myList3);//[12, 50, 7, 23]

        myList3.add(3,99);// we added 99 to 3. index
        System.out.println(myList3);//[12, 50, 7, 99, 23]

        //how to join two lists

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);//[A, B, X, Y, Z]
        System.out.println(b);//[X, Y, Z]

        a.addAll(1,b);// we added List b ==>[X, Y, Z] to 1. index of List a
        System.out.println(a);//[A, X, Y, Z, B, X, Y, Z]

        //how to get the number of elements in a list
        int sizeOfA = a.size();
        System.out.println(sizeOfA);//8

        int sizeOfB = b.size();
        System.out.println(sizeOfB);//3

        //note: when you talk about the number of the elements in an array use "length of the array",
        //for the lists use "size of the list"

        //example 1: type code to check if the given list is empty or not?

        List<Character> c = new ArrayList<>();
        c.add('x');
        c.add('y');

        //1. way
        int sizeOfC = c.size();

        if(sizeOfC==0){
            System.out.println("the list is empty");
        }else {
            System.out.println("the list is not empty");
        }

        //way 2: java created a method to check if a list is empty or not
        // isEmpty() method returns "true" if the list does not have any element
        // isEmpty() method returns "false" if the list has at least one element

        boolean isEmpty = c.isEmpty();

        if(isEmpty){
            System.out.println("the list is empty");
        }else {
            System.out.println("the list is not empty");
        }

        //if java has a method for specific functionality using the method is preferable

        //example 2: type code to check if the list does not have any element different from space
        // or the list does not have any element
        // [] ==> acceptable  [ , , ] ==> acceptable as well   [a] ==> not acceptable  ==> logic of question

        //java created a method to check if a list is empty or the list has space in it

        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        d.add("a");
        System.out.println(d);//[ ,  ,  , a]

        //to be able to use removeAll() method we need list, therefore we created a list contains space character
        List<String> e = new ArrayList<>();
        e.add(" ");
        e.add("b");

        //removeAll() method is used to remove multiple elements from a list
        //when you use removeAll() method, you will need a list stores the elements you want to remove
        d.removeAll(e);// means remove all elements which list e also has elements( common elements)
        System.out.println(d);//[a]
        // " " removed but "b" was not removed because it is not common element

        if (d.isEmpty()){//the list has character/s different from space // returned true
            System.out.println("the list is empty or has just space character");
        }else {
            System.out.println("the list has character/s different from space");
        }



    }
}
















