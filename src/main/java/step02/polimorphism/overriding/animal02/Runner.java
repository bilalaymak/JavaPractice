package step02.polimorphism.overriding.animal02;

public class Runner {
    public static void main(String[] args) {


        Cat c = new Cat();
        System.out.println("1 " + c.name);//Cat
        //c.name goes to Cat class's name variable
        //if we use a method attached to c object, we use Cat(); constructor, so we use a constructor in Cat class

        System.out.println("************");

        Mammal d = new Cat();
        System.out.println("2 " + d.name);//Mammal
        //d.name goes to Mammal class's name variable
        System.out.println("****************");

        Animal e = new Cat();
        System.out.println("3 " + e.name);//Animal

        System.out.println("****************");
        //we look the "name" value, but gives different values, how does it give different values?
        //by changing data types get values from different parents

    /*
        in inheritance, from "parent" to "child" there is "HAS A" relationship
                        from "child" to "parent" there is "IS A" relationship
    */

        System.out.println("*************");

        Cat f = new Cat();
        f.eat();//Cats eat


    /*
        1) "super" keyword is used to get data(variables + methods) from parent classes in inheritance
        2) if there is no data(variables + methods) in parent java looks for the data in grandparents
           if no parent has the data(variables + methods) java gives Compile Time Error(red underline)
        3) "super()" must be the first statement in the constructor body, but "super" can be in any line
        4) "super()" is for calling "constructors", but "super" is for calling variables and methods from parent class
        5) "this" is used to call data(variables + methods) from the class itself
           when you use "this", it means you are telling to java "do not go to the parent, stay in this class"

               METHOD OVERRIDING
        note: method overriding has another name which is "dynamic polymorphism"

      1)when the child classes use the methods from the parent classes, we need to update implementation of the methods
        for example: in animal class eat() method tells "Animals eat", but to tell "Animals eat" in Cat class is not good
        to be able to create specific implementation for the Cat class like "Cats eat", we should update the method body
        this is called "method overriding"

      2) to do "method overriding" we need "inheritance",
         if there is no "inheritance" it means there is no "method overriding"
      3) when we use "method overriding", we do not touch to the "method signature"(method name + parameters)
      4)"@Override" annotation checks the "Overriding Rules" when you do "Overriding"
      5) when you do "method overriding", you cannot use "narrower" access modifier in child class
         you can use same or wider access modifiers
      6) when you do "method overriding", the method in parent class is called "overriden method",
         the method in child class is called "overriding method"
      7) when you do "method overriding", if the return type is "void" in "overridden method",
         return type of the "overriding method" must be "void"
      8) when you do "method overriding", return type of the "overriding method" can be same or the child of
         the return type of the "overridden method"
         from child return type to parent return type you must have "IS-A" relationship
      9) between the wrapper classes, java did not create "parent-child relationship", therefore
         between the wrapper classes there is no "IS-A" relationship. if there is no "IS-A" relationship
         you cannot change the return types in "method overriding"
      10)when you do "method overriding", if the return type of the "overridden method" is "primitive"
         you cannot change it in "method overriding" because primitive data types are not classes,
         if they are not classes you cannot have "IS-A" relationship

      Note: if a method is final, it means its body cannot be updated.
      11)body of a "final method" cannot be updated, because in overriding we change the method body
         but final methods do not allow us to change the body
      12)"private" methods cannot be overridden, because to override a method we have to access to it.
      "private" methods are not accessible from other classes
      13)"static" methods cannot be overridden because "static" things are common for all child classes,
         if any child class updates the static method body, other child classes will be effected as well,
         therefore java does not let you to override a static method










    */




    }
}
