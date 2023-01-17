package practices01.inheritance;

public class Inheritance {

      /*
        ***  when we start to read code, we should start at main method!!!

          1) we use "inheritance";
            i) to prevent "repetition"
            ii) to make "maintenance" easy
            iii) to make our classes "atomic"
          2) to make a class child of another class we use "extends" keyword
          3) child classes can use class members from the parent classes
             however, parent classes cannot use anything from the child classes
          4) every class in java has at least one parent class which is "Object class"
          5) inheritance Types in java
             i)"multilevel inheritance"
             ii)"Hierarchical Inheritance"
             iii)"multiple inheritance" (java does not support it)
             iiii)opposite of "multiple inheritance" is "single inheritance"
                  java supports "single inheritance"

         //constructors in inheritance
         what is the mean of super() method, it is go to parent class
         1) super() is used to call constructor from parent class
         2) super() is in the first line of every constructor body
         3) super() is invisible as default, if you want you can type it explicitly

         4) super() can be used with parameters like super(true), super("Hybrid"), super(2023)
         5) when a class has multiple constructors to select the constructor we need, we use super() with parameters

        //if there is a variable to use in child class, the class don't need to go parent class
        //if there is no usable variable in the class, then goes there
        *
        *

        1)when you try to access a "variable" by using an object in inheritance, start to look for the "variable" in the
        class used in the "data type of the object"
        2)when you try to access a "method" by using an object in inheritance, start to look for the "object" in the
        class whose "constructor" was used
        3) in the first line of every constructor
        * there is invisible "super()" to call default constructor from the parent class,
        * if you want you type it explicitly
        4) data type of object can be selected from the class itself or from the parents of the class !!!
        *  Object dog = new Dog(); OR Animal dog = new Dog(); OR Mammal dog = new Dog(); OR Dog dog = new Dog();
        5) "private" class members cannot be inherited
           "default" class members can be inherited if the child class in the same package with the parent class
           "protected" and "public" class members do not have restriction in inheritance
           *


      */
}
