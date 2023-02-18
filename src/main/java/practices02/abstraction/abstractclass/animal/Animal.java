package practices02.abstraction.abstractclass.animal;

/*
      1) sometimes no child uses the implementation from the parent class,
         therefore the body part of the method in parent class is being unusable
         if something is unusable, we do not want to type it
         if you do not type the body of a method, you will have "method without body"
         (like angels which they exist but do not have body)
         it is called "abstract method"

      2) "concrete methods(regular methods)"(methods with body) focus on 2 things
         i) what to do ==> eat()
         ii) how to do ==> {sout"animals eat"}
         "abstract methods" focuses on just "what to do" ==> eat();

      3) if you make a method "abstract", it will be "mandatory" to override for all child classes

      4) "abstract methods" can be created just in "abstract classes"
         to make a class abstract, put "abstract" keyword between "access modifier" and "class" keyword
      5) when you remove "method body",
         you have to use "abstract" keyword between "access modifier" and the "return type" of the method
      6) it is impossible to create "object" from an "abstract class",
         but it does not mean "abstract classes" do not have "constructors"
         they have "constructors" but "constructors" are not used to create objects
      7) "abstract classes" can have "concrete methods" as well as "abstract methods"
      8) "concrete methods" may or may not be overridden by child classes
      9) "abstract methods" cannot be put into a non-abstract class


   */



public abstract class Animal {


    public abstract void eat();

    public abstract void drink();

    public void move(){
        System.out.println("animals move");
    }



}
















