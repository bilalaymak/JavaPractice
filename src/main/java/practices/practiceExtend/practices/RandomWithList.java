package practices.practiceExtend.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomWithList {
    public static void main(String[] args) {

     //type code creating random username
     //1. take name from user
     //2. delete leading and trailing spaces
     //3. control username whether is take-able or not
     //4. if there is not such a username, make username name given by user
     //5. if there is also such a name, add random number last of the name, print

        List<String> dataBaseName = new ArrayList<>();
        dataBaseName.add("Tommy23");
        dataBaseName.add("Tommy44");
        dataBaseName.add("Tommy54");
        dataBaseName.add("Tommy22");
        dataBaseName.add("Tommy");

        Scanner input = new Scanner(System.in);
        System.out.println("enter username");
        String userName = input.nextLine().trim();
        // Make the first character uppercase
        String firstChar = userName.substring(0, 1).toUpperCase();
        String restOfString = userName.substring(1).toLowerCase();
        userName = firstChar + restOfString;

        //1. way
       // int random = (int) (Math.random()*100);

        //2. way
         int random = new Random().nextInt(100);

        while (dataBaseName.contains(userName + random)){
            random = (int) (Math.random()*100);
        }

        if (dataBaseName.contains(userName)){
            System.out.println("the username exists in the database, cannot use again");
        dataBaseName.add(userName + random);
        }else {
            System.out.println("the username is reusable");
        }
        dataBaseName.add(userName + random);

        int lastIndex = dataBaseName.size() - 1;
        String lastElement = dataBaseName.get(lastIndex);

        System.out.println(lastElement);
        System.out.println(dataBaseName);




    }
}
