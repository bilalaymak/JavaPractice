package practices03.exceptions;

public class E03 {

    public static void main(String[] args) {

        int r1 =getNumOfChars("Tom Hanks");
        System.out.println(r1);//9

        int r2 = getNumOfChars("");
        System.out.println(r2);//0

        int r3 = getNumOfChars(null);//NullPointerException:
        // if you use "length()" method with "null" you will get NullPointerException

        System.out.println(r3);

    }


    //create a method to find the number of characters in a string

    public static int getNumOfChars(String str){
         int numOfChar = 0;
        try {
            numOfChar = str.length();
        }catch (NullPointerException e){
            System.out.println("a problem occurred in using length()");//exception gives null
        }
        return numOfChar;

    }



















}
