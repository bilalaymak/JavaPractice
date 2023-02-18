package practices02.abstraction.Interfaces.car;

public abstract class Abstraction01 {


/*
       "final" keyword is very important in java
       1) "final" keyword can be used for variables
          public final int age = 12;
          if you make a variable "final" you cannot change its value
          "final variables" must be initialized
       2)"final" keyword can be used for methods
         "final method" body cannot be updated

       3) "final" keyword can be used for classes
          "final classes" cannot have child classes

       note: "abstract classes" have something to do for child classes, if there is no child class,
             having "to do list" is not sensible
             "final classes" cannot have child classes, therefore java does not allow to make an abstract class final
             that is do not make an abstract class final class!!!
      note: "final method" body will be under protection by java, because it should not be updated
            but abstract methods do not have body,
            java will look for the body to protect when it could not find it will complain



 */

          public int age;
          public static final double pi = 3.14;

          //      pi++; cannot assign a value to final variable "pi"

    public abstract int add();//we cannot make an abstract method a final method











}
