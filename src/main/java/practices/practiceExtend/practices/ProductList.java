package practices.practiceExtend.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList {
    public static void main(String[] args) {

        //take names of products from user
        //if there is the product in the List given by the user, print its name
        //if there is not the product in the List given by the user, print "out of stock"

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the product research system!");
        System.out.println("to break to search product enter Q");

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("Ipad");
        products.add("PC");
        products.add("Notebook");
        products.add("MobilePhone");

        //1.
        //do "for loop", convert all of charecters of every element in the "product List"
        //by using "set method"
        //2.
        //convert the name of product given by the user to the lower cases

        do {
            System.out.println("enter name of product you search");
            String userP = input.next();

            if (userP.equalsIgnoreCase("Q")){
                break;
            } else if (products.contains(userP)) {
                System.out.println(userP + " is in stock");
            }else {
                System.out.println(userP + " is out of stock!");
            }

        }
        while (true);

        System.out.println("thank you for using our website, passionately see you again!");






    }
}














