package practices03.exceptions;


import java.util.Arrays;

public class E02 {
    public static void main(String[] args) {

        String a[] = {"A","B","C","D"};
        String r1 = getElement(a,5);
        System.out.println(r1);

    }
    //create a method to get any element from a string array


    public static String getElement(String a[],int idx){
        String result = "";
       try {
           result =  a[idx];
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("a problem occurred in array indexes");
           e.getCause();//null
           System.out.println(e.getMessage());//Index 5 out of bounds for length 4
           System.out.println(e.getLocalizedMessage());//Index 5 out of bounds for length 4
           System.out.println(Arrays.toString(e.getStackTrace()));//[practices03.exceptions.E02.getElement(E02.java:20), practices03.exceptions.E02.main(E02.java:10)]
           e.printStackTrace();//detailed message from java
       }
       return result;
    }











}
