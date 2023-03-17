package step01.loops.dowhileloops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*
        username is "admin", password is "pwd123"
        ask user to enter username and password
        user should see "Enter your username and password" message
        if he enters correct credentials he should get "you are in your account!"
        otherwise, he should see "enter your username and password" message 3 times
        after 3 times he should get "your account is blocked" message
         */


         Scanner input = new Scanner(System.in);
        int counter = 0; //to enter to program

        do {
            if (counter ==4){
                System.out.println("your account is blocked!");
                break;
            }
            System.out.println("enter your username");
            String username = input.next();

            System.out.println("enter your password");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("you are in your account!");
                break;
            }
            counter++;
        }while (true); //infinite loop


    }
}













