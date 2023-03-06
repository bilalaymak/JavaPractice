package practices03.exceptions.exceptions;

public class
E01 {
    public static void main(String[] args) {
/*
        1)"exception" means un-expected issues in code execution
        2)there are two ways to work with exceptions
           i)using try-catch block: handling exception
           ii)throw exception and block the application
        3)if you do not handle the exception, java stops execution and the application is blocked
        4) "try" can be used with a "single" or "more" catch blocks
        5) "try" "cannot" be used "alone"

*/
        divide(6,0);//ArithmeticException  a number cannot be divided by zero
        divide2(6,0);//  a problem occurred in division
    }

      //1. way: we don't recommended that way
      //        i)because it is not mandatory for developers to know all math rules
      //        ii)in math, there may be very problematic rules, it is so difficult to cover all in if statements
    public static void divide(int a, int b){

        if(b==0){
            System.out.println("a number cannot be divided by zero");
        }else {
            System.out.println(a/b);
        }

    }

    //2. way: handle Exception by using try-catch block
    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("a problem occurred in division");

        }


    }



}
