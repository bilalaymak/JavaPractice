package practices01.constructersmethodcallsstatickeywords.variabletypes;

public class VariableType01 {

    //"name" is "non-static" or "object" or "instance" variable
    public String name = "Tom Hanks";//to create a method in Runner class
    //by using this variable,
    // we should create an object in the Runner class

    //"age" is "static" or "class" variable
    public static int age = 13;//to create a method in the Runner class,
    //we don't have to create an object int the Runner class
    //we can reach this variable by referring to the class name(VariableType01)

    //local variable
    // if we create a variable inside a method, it is called "local variable"
    //if we create a "local variable", it is mandatory to assign a value,that is,
    // must be initializing( giving a value++> int x =12;
    // if we try to create variable without assigning a value, it complains
    // it is the difference between the other variable and local variable,
    //because non-local variables no need to assign a value to use

    //note: if the return type is different from "void"
    // we have to use "return" keyword inside the method


    //note: when we create a method, use the "return" keyword in the last line
    //we cannot type  any code after "return" keyword
    public int add(int a, int b){//method
        //local variables can use only in the method firstly used,
        // cannot to be used outside the method
        int x = 12;//local variable
        System.out.println(name);//we can use non-local variables in the method
        return a + b;
    }

    //create a message to do multiplication

    public  int multiply(int m, int n){
        String s = "Java";//local variable
        return m * n;
    }



}









