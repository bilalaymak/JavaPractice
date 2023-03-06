package practices03.exceptions.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E09 {

    /*
         1)"FileNotFoundException" is related with the "Path of the file" and the "Existence of the file"
         2)"FileNotFoundException" is "compile time exceptions"(Checked exception)
         3)"FileNotFoundException" is the child of "IOException"

         4)"IOException" is related with all possible "input-output" issues
         5)"IOException" is "compile time exception"(checked exception)
                            "run time exception"(unchecked exception)
         6)when you use parent and child exception classes together in a try-catch,
           child classes must come first otherwise java gives error

         7)when you encounter a "compile time exception", you have 2 options
           i)using "throws" in method signature line
             * java will throw exception and stop the execution
           ii)using "try-catch"block
             * java will execute whatever you typed inside the catch body and does not stop the execution

         8) what is the difference between "throw" and "throws" keywords?
         ***i)"throw" keyword is used to throw any exception in anywhere inside the method body
             "throws" keyword is used in the method signature line
           ii)by using "throws" keyword you can declare multiple exceptions
              (throws IOException,FileNotFoundException, ArithmeticException)
              after using "throw" keyword you can declare just one exception
           iii)after using "throw" keyword, you have to create an Exception object
               after using "throws" keyword, you will tell just the name Exception class

         9)what is the difference between "exception" and "error"?
           "exception" can be handled but, "error" cannot
           OutOfMemory, VirtualMachine, Assertion can be example for errors


    */






    public static void main(String[] args) throws IOException {

        readTheText();
        //FileNotFoundException: src\main\java\practices03\exceptionsX\File.txt (No Such file or directory)
        System.out.println();
        System.out.println("***********************");
        readTheTextFromTheFile();
        //there is an issue in path or in the file - src\main\java\practices03\exceptionsX\File.txt (No Such file or directory)
        //execution did not stop

    }

    //create a method to read a text file
    //if the path is wrong, if the file does not exist, if the text cannot be read stop execution
    public static void readTheText() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\practices03\\exceptions\\File.txt");
        //for wrong path!!
     //FileNotFoundException: src\main\java\practices03\exceptionsX\File.txt (No Such file or directory)
        int k =0;
        while ((k =fis.read()) != -1){ // fis.read() gets every character's ascii value
            //empty char gives -1 as ascii value
            System.out.print((char) k); //then we typeCast the characters to char values
        }

    }


    //create a method to read a text file
    //if the path is wrong, give a message to the user and do not stop execution
    // if the file does not exist, give a message to the user and do not stop execution
    // if the text cannot be read stop execution, give a message to the user and do not stop execution

    public static void readTheTextFromTheFile(){
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\practices03\\exceptions\\File.txt");
            int k =0;
            while ((k =fis.read()) != -1){ // fis.read() gets every character's ascii value
                //empty char gives -1 as ascii value
                System.out.print((char) k); //then we typeCast the characters to char values
            }
        } catch (FileNotFoundException e) {
            System.out.println("there is an issue in path or in the file - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("there is an issue in reading the text - " + e.getMessage());
        }

        System.out.println("execution did not stop");
    }


















}
