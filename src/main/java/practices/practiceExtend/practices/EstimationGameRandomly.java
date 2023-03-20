package practices.practiceExtend.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstimationGameRandomly {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the game!");
        System.out.println("to end the game press 'Q' ");

        List<Object> numsList = new ArrayList<>();
        //I used Object because I will use both String and Integer

        for (int i = 0; i < 5; i++) {
            // Generate a random integer between 0 and 9 (inclusive)
            int randomInt = (int) (Math.random() * 10);
            numsList.add(i, randomInt);
        }

        // Print the modified list
        System.out.println(numsList);

        int counter = 0;
        String num = "";


        do {
            System.out.println("enter numbers among 1-10, to find 5 numbers");
            num = input.next();
            if (num.equalsIgnoreCase("Q")) {
                break;
            }
            int numInt = Integer.parseInt(num);
            if (numsList.contains(numInt)) {
                String bingo = "BINGO!";
                int index = numsList.indexOf(numInt);
                if (index >= 0) {
                    numsList.set(index, bingo);
                    counter++;
                }
            } else {
                numsList.add(numInt);
            }
        } while (counter < numsList.size());

        if (!num.equalsIgnoreCase("Q")) {
            System.out.println("Won!");
        } else {
            System.out.println("you left the game willingly, " +
                    "we look forward to seeing you again");
        }
        System.out.println("Final report : " + numsList);


    }
}
