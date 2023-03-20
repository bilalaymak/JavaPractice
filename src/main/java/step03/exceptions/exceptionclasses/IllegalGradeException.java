package step03.exceptions.exceptionclasses;

//to make a class, a "exception class" make it child of the "Exception Class" by using "extends" keyword
//if you use "extends Exception" it will be "Compile Time Exception"(Checked Exception)
public class IllegalGradeException extends Exception{


    public IllegalGradeException(String message){

        super(message);//it means go to the parent class, that is Exception class and use message in it

    }







}
