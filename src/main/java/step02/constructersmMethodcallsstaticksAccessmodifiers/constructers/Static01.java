package step02.constructersmMethodcallsstaticksAccessmodifiers.constructers;

public class Static01 {


      /*
      1) "static" class members(variables and methods) are common for all objects created from the class
      2) When you do any update on "static" class members, all objects will see the updates on it
      3) if you want every object informed about every update on a class member make it static
       */

    // static variables = can be named as class variables as well, because the variable is attached to the class
    // non-static variables can be named as "object variables" or "instance"(object and instance are synonyms) variables as well

        //how to create static variable
        //to make a variable "static", put "static" keyword between "access modifier" and "data type"

        public static int staticCounter = 0;
        public int nonStaticCounter = 0;

        public Static01(){
         staticCounter++;
         nonStaticCounter++;
        }












}
























