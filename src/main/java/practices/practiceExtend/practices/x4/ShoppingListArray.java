package practices.practiceExtend.practices.x4;

import java.util.Scanner;

public class ShoppingListArray {
    public static void main(String[] args) {



/*      create a shopping list by asking from user with arrays
        sort the list
        then reverse the order of the elements in the list

*/
        String[] shoppingList;
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of items for the shopping list
        System.out.println("Enter number of items for your shopping list:");
        int numItem = input.nextInt();
        input.nextLine(); // consume the newline character
        shoppingList = new String[numItem];

        // Prompt user to enter items for the shopping list
        System.out.println("Enter items for your shopping list:");

        for (int i = 0; i < numItem; i++) {
            shoppingList[i] = input.nextLine();

        }



        /*
        Arrays.sort(shoppingList);
        System.out.println(Arrays.toString(shoppingList));
        */
        // Sort the shopping list

        for (int i = 0; i < numItem; i++) {
            for (int j = i + 1; j < numItem; j++) {
                if (shoppingList[i].compareTo(shoppingList[j]) > 0) {
                    String temp = shoppingList[i];
                    shoppingList[i] = shoppingList[j];
                    shoppingList[j] = temp;
                }
            }
        }

        // Print the sorted shopping list
        System.out.println("Sorted Shopping List:");
        for (int i = 0; i < numItem; i++) {
            System.out.println(shoppingList[i]);
        }

        // Reverse the order of the items in the shopping list

        for(int i = numItem-1; i>0; i--){
            System.out.println(shoppingList[i]);
        }


        for (int i = 0; i < numItem / 2; i++) {
            String temp = shoppingList[i];
            shoppingList[i] = shoppingList[numItem - 1 - i];
            shoppingList[numItem - 1 - i] = temp;
        }

        // Print the reversed shopping list
        System.out.println("Reversed Shopping List:");
        for (int i = 0; i < numItem; i++) {
            System.out.println(shoppingList[i]);
        }
    }

    }



