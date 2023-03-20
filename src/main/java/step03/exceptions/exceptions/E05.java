package step03.exceptions.exceptions;

public class E05 {
    public static void main(String[] args) {

        System.out.println(getCharFromString("java",5));
        //StringIndexOutOfBoundsException : String index out of range: 5
        //if you use non-existing index for a String, you will get "StringIndexOutOfBoundsException"

    }

    //create a method to get any character from a string

    public static char getCharFromString(String str,int idx){
             char ch = ' ';
       try {
          ch = str.charAt(idx);
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("StringIndexOutOfBoundsException : " + e.getMessage());
       }
          return ch;

    }










}
