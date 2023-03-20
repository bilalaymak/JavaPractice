package step03.exceptions.exceptionclasses;

public class CustomExceptions01 {

  /*
     normally, java has many exception classes which cover many issues
     sometimes we need "Custom Exceptions" for 2 reasons;
        1)to make java exceptions more specific.
          "FileNotFoundException" has 2 reasons in it
            i)path can be wrong
            ii)file does not exist
        2) to create some exceptions for our application
           "IllegalGradeException" can be created for a school management system application

        3) custom exceptions directs the developers not to break the application rules

  */

    public static void main(String[] args) {

        try {
            printGrades(-45);
        } catch (IllegalGradeException e) {
            System.out.println(e.getMessage());//grade cannot be less than zero and more than a hundred
        }

        System.out.println("checkNameFormat(\"Tom\") = " + checkNameFormat("Tom"));//true
        System.out.println("checkNameFormat(\"tom\") = " + checkNameFormat("tom"));
        //IllegalNameException: names must start with upper cases



    }


    public static void printGrades(double grade) throws IllegalGradeException {

        if (grade<0 || grade>100){
            throw new IllegalGradeException("grade cannot be less than zero and more than hundred");
        }else {
            System.out.println(grade);
        }

    }

    public static boolean checkNameFormat(String name){

        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalNameException("names must start with upper cases");
        }

    }















}
