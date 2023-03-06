package practices03.exceptions.exceptions;

public class E07 {
    public static void main(String[] args) {

        printAge(23);//23
        System.out.println("************");
       printAge(-23);//IllegalArgumentException : the age cannot be negative
        System.out.println("**************");

        //when a code throws exception, then the next code will not execute
        try {
            printAge(-25);//age is not valid
        }catch (IllegalArgumentException e){
            System.out.println("age is not valid");
        }

        try {
            printWorkerAge(13);//age is not valid to be worker
        }catch (IllegalArgumentException e){
            System.out.println("age is not valid to be worker");
        }

    }

     //create a method to print the given age

    public static void printAge(int age){
         if (age<0) {
            throw new IllegalArgumentException("IllegalArgumentException : the age cannot be negative");
         }
         System.out.println(age);
    }

    //create a method to print worker's age
    public static void printWorkerAge(int age){

        if (age<16){
            throw new IllegalArgumentException("IllegalArgumentException : age cannot be less than 16");
        }
        System.out.println(age);


    }




}
