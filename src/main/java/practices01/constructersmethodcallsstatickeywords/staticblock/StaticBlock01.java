package practices01.constructersmethodcallsstatickeywords.staticblock;

/*
1)if you don't assign any value for "static" or "non-static" variables,
Java assigns "default values" to them, but Java does not assign default value for
"local variables"

2) default values are "0" for numeric data types, it is "null" for String,
it is "false" for boolean
 */

/*
Java class loader: makes the class ready to use for us
to create objects, methods, structures,variables
 */
public class StaticBlock01 {

    /*
    1) Java Class Loader makes the classes ready to use
    2) when the classes make ready, class members are loaded according to some order
       main method is the first to be loaded normally
    3) sometimes we need something to be loaded before main method, for this scenario
       we use "static block"
       the codes inside the "static block" is executed before everything in the class,
       even before main method
    4) rule: "static" structures can work just with static class members
        don't put non-static class members into static method, it will give error,
        even being main method, because main method is also static method
    5) "static block" can be used just with "static" variables,
        because of the rule in 4th step
    6)  "static block" is used to initialize(assigning first value) "static variables"

    note: when we create a variable inside the main method, we do not use "static" keyword
    because Java knows everything inside the main method is "static"
     */
    public static double pi;


    public static void main(String[] args) {

        System.out.println("this is main method");

        String name = "Ali Can";//Java does not give error,
        // because we can re-assign the variable
        // we cannot make "String name" variable "static" here,
        // because it is already used as static before

    }
    static {
        System.out.println("this is static block 1");
        pi = 3.14;//initializing pi variable
        //after the static block, we can change the variable, for example in the main method
    }
    static {
        System.out.println("this is static block 2");
    }



}
