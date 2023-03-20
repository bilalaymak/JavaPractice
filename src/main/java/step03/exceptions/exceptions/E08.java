package step03.exceptions.exceptions;

public class E08 {

    /*
       1)if you want to execute a code for every scenario, use "finally" block after "try" body
       2)"try" can be used like
         i)try + single catch
         ii)try + multiple catch
         iii)try + single catch + finally
         iv)try + multiple catch + finally
         v)try + finally
         note: "try" cannot be used alone
       3) "ArithmeticException", "NullPointerException", "ArrayIndexOutOfBoundsException", "NumberFormatException",
          "StringIndexOutOfBoundsException", "IllegalArgumentException" are displayed on the console after I click on
          "Run" button, therefore those are called "Runtime Exceptions"
       4) there is "compile time exception", they will be displayed before clicking on the "Run" button
          therefore, they are called "compile time exceptions"


       ***note:
       printAge(25); "25" is argument(it is in the method calling method parenthesis)
       printAge(int age); "int age" is parameter (it is in the method parenthesis)
       * when you call a method, you use actual values inside the method parenthesis, they are called "arguments"
       * (String[] args) ==> args is the abbreviation of argument

       * when you create a method, you use "variables" inside the method parenthesis, they are called "parameters"






    */







    public static void main(String[] args) {
           divide(6,0);//when you call a method, you use actual values inside the method parenthesis,
                             // they are called "arguments"
            //arguments in happy scenario are "legal arguments"
            // in negative scenario, they are "illegal arguments"
           //there is a problem in dividing operation, do not use zero as divisor
            //cut the connection with the database

        System.out.println("************************");
        divide(6,2);//3 was saved into database
                          //cut the connection with the database

    }

    //create a method to do division then save the result into database
    public static void divide(int a, int b){//when you create a method,
                                    // you use "variables" inside the method parenthesis, they are called "parameters"
        try {
            System.out.println(a/b + " was saved into database");
            //if this code block throws an exception, following codes do not execute
            //therefore, for example when we want to cut the connection after saving,if this code throw exception
            //we cannot cut the connection, so the connection will continue, and taking cost
            //thus, throwing exception issue is so important here
            //to handle this problem, we should use try-catch block
        } catch (ArithmeticException e){
            System.out.println("there is a problem in dividing operation, do not use zero as divisor");
        }finally{
            System.out.println("cut the connection with the database");
        }



    }














}
