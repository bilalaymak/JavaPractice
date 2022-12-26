package practices01.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

        //example 1: type code to remove the first occurrence of a specific element from a String list
        // ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]

        //to remove first occurrence java created a method which is "remove()"
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);//[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        a.remove("Shoes");//remove() method can be used with the element
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

        System.out.println("******************************");
        //example 2: type code to remove all occurrence of a specific element from a String list
        //["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]
        List<String> b = new ArrayList<>();
        b.add("Shoes");
        b.add("TV");
        b.add("Radio");
        b.add("Laptop");
        b.add("Shoes");
        b.add("Book");
        b.add("Shoes");
        System.out.println(b);//[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        List<String> c = new ArrayList<>();
        c.add("Shoes");
        c.add("Laptop");
        b.removeAll(c);
        System.out.println(b);//[TV, Radio, Book]

        System.out.println("******************************");

        //example 3: type code to remove an element at a specific element at a specific index
        //["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"] remove the 5th element

        List<String> d = new ArrayList<>();
        d.add("Shoes");
        d.add("TV");
        d.add("Radio");
        d.add("Laptop");
        d.add("Shoes");
        d.add("Book");
        d.add("Shoes");
        System.out.println(d);//[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        d.remove(4);//remove() method can be used with the index
        System.out.println(d);//[Shoes, TV, Radio, Laptop, Book, Shoes]

        System.out.println("******************************");

        //example 4: create an Integer list, then remove the 4th element








    }
}














