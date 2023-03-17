package step01.stringbuilder;

public class Stringbuilder01 {
    public static void main(String[] args) {

        //what is "StringBuilder Class"?
        //"StringBuilder Class" is for creating "mutable Strings"

        //we use "String Class" to create a String, why or when we will need "String Builder Class"?
        //String class is "immutable", "StringBuilder class" is "mutable"

        //String class is "immutable" because of that it does not change existing value
        //if you want to assign a new value to variable, java will create a new container inside the "String Pool"
        //then will put new value in it, then changes the address pointer to the new container
        String name = "Tom";
        name = "Mark";

        //if any container does not have any address pointer, "Garbage Collecter" removes the container from the memory
        //before removing things from memory, java "finalize" them,
        // without finalizing java does not remove anything memory

        String s = "John";
        String r = "John";//java does not create another container in the "Heap Memory",instead, creates a new address
                          //in the Stack memory by using the same container with String s in the "String Pool"
        r = "Sam";//when we assign r as "Sam", Java creates a new container, and changes the connection of address of r
                  //to the new container

        //advantage of "immutability" is to save memory to not overload the memory
        //when we do not use immutability java updates all of them
        //another benefit of immutability is security, when we change the value, relatedly another method,
        // which attached to it, will also change==> it is security issue , so we use immutability


        //I want a separate container whose value is John
        //it is how to create a new container with the same value
        String u = new String("John");


        //if we want to change the value directly,
        // without creating new container in memory, we can use "StringBuilder" Class
        StringBuilder sb = new StringBuilder("Clara");
        sb = new StringBuilder("Jim");

        //how to create a StringBuilder Object
        //1. Way
        StringBuilder sb1 = new StringBuilder("Mary");
        System.out.println(sb1);//Mary

        //2. way
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2);//empty

        //append
        sb2.append("Clara");
        System.out.println(sb2);//Clara

        sb2.append("Ocean");
        System.out.println(sb2);//Clara

        //reverse
        sb2.reverse();
        System.out.println(sb2);//naecOaralC
        sb2.reverse();
        System.out.println(sb2);//ClaraOcean

        //delete
        sb2.delete(0,1);
        System.out.println(sb2);//laraOcean

        //insert
        sb2.insert(4,"Clara");
        System.out.println(sb2);//laraClaraOcean


        //how to learn the capacity in a StringBuilder

        StringBuilder sb3 = new StringBuilder();
        int numOfChars = sb3.length();
        System.out.println(numOfChars);//0

        int cap = sb3.capacity();//capacity gives us how many boxes are in the StringBuilder
        System.out.println(cap);//16

        sb3.append("Jackson");
        sb3.append("Mexico");
        sb3.append("The USA");

        numOfChars = sb3.length();
        cap = sb3.capacity();
        System.out.println(sb3);//Jackson
        System.out.println(numOfChars);//20
        System.out.println(cap);//34

        //when we exceed the existing capacity(that is 16),java will increase capacity as
        // 2*existing capacity+2=34












    }
}













