package step03.generics.customers;

public class Customer {
    int id;
     String name;
    int age;
    String address;
    double salary;

    public Customer(int id, String name, int age, String address, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public Customer() {
    }


}
