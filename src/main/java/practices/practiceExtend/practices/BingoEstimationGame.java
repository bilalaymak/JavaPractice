package practices.practiceExtend.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BingoEstimationGame {
    public static void main(String[] args) {

        /*
                  NUMBER ESTIMATION GAME
        ask for numbers 1-10
        if there is the number user estimated, in the list, print "BINGO!"
        otherwise add the number user gave to the list
        print "Won!!" for first completed user
        [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
        [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
        [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> WON!!

         */

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the game!");
        System.out.println("to end the game press 'Q' ");

        List<String> numsList = new ArrayList<>();
        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");

        int counter = 0;
        String num = "";

        do {
            System.out.println("enter numbers among 1-10");
            num = input.next();
            if(num.equalsIgnoreCase("Q")){
                break;
            } else if (numsList.contains(num)) {
                numsList.set(numsList.indexOf(num),"BINGO");
                counter++;
            }else {
                numsList.add(num);
            }
        }while (counter != numsList.size());

        if(!num.equalsIgnoreCase("Q")){
            System.out.println("Won!");
        }else {
            System.out.println("you left the game willingly, " +
                    "we look forward to seeing you again");
        }
        System.out.println("Final report : " + numsList);










    }
}
