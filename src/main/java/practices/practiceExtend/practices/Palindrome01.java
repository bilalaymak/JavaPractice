package practices.practiceExtend.practices;

import java.util.Scanner;

public class Palindrome01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an String statement ");
        String statement = input.nextLine();

        palindromeWithStringBuilder(statement);
        palindromeWithForLoop(statement);

    }

    private static void palindromeWithForLoop(String str){

        String reverseStr = "";
        for (int i = str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        System.out.println("reverseStr = " + reverseStr);
        if (reverseStr.equalsIgnoreCase(str)){
            System.out.println("the statement entered is palindrome" + reverseStr);
        }else {
            System.out.println("the statement entered is not palindrome =>" + reverseStr);
        }
    }

    private static void palindromeWithStringBuilder(String str){

        StringBuilder sb = new StringBuilder();//StringBuilder Object
        String reverseStr = sb.reverse().toString();
        if (reverseStr.equalsIgnoreCase(str)){
            System.out.println("the statement entered is palindrome" + reverseStr);

        }else {
            System.out.println("the statement entered is not palindrome" + reverseStr);
        }
    }



}












