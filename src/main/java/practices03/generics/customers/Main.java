package practices03.generics.customers;

public class Main {
    public static void main(String[] args) {

       MyList<Customer> customers= new MyList<Customer>();
       customers.add(new Customer(123,"john",32,"Mumbai",20000.0));
       customers.add(new Customer(123,"jane",27,"Shanghai",30000.0));
       customers.remove();




    }









}
