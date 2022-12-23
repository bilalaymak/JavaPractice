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
    //note: if the return type is different from "void'
    // we have to use "return" keyword inside the method

    public int add(int a, int b){//method

        return a + b;
    }

    //create a message to do multiplication

    public  int multip(int m, int n){
        return m * n;
    }



}









