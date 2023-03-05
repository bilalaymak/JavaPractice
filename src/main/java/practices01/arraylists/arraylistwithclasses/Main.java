package practices01.arraylists.arraylistwithclasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         ArrayList<Customer> customers = new ArrayList<>();//our data type is Customer
        customers.add(new Customer(1,"John"));
        customers.add(new Customer(2,"Jane"));
        customers.add(new Customer(3,"Mike"));
        customers.add(new Customer(4,"Mary"));

  //     customers.remove(new Customer(1,"John")); this does not work because of the reference type

        for (Customer w : customers){
            System.out.println(w.name);
        }




    }
}
