package practices.practiceExtend.practices.x4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingListArrayList {
    public static void main(String[] args) {
         /*
           create a shopping list by asking from user
           sort the list
           then reverse the order of the elements in the list

          */

        //create a shopping list
        ArrayList<String> shoppingList = new ArrayList<String>();
        Scanner input =new Scanner(System.in);

        System.out.println("enter items for your shopping list, type 'break' when finished");
        String item = input.nextLine();
        while (!item.equalsIgnoreCase("break")) {
            shoppingList.add(item);
            item = input.nextLine();
        }
        System.out.println("unsorted list: " +shoppingList);//[2, 4, 3, 1, 5, 6, 8, 7, 0, 9]

        //sort the list

        Collections.sort(shoppingList);
        System.out.println("sorted list: " + shoppingList);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        //reverse the order of list

        Collections.reverse(shoppingList);
        System.out.println("reversed list: " + shoppingList);//[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]












    }
}
