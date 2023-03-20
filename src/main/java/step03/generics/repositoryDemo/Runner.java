package step03.generics.repositoryDemo;

public class Runner {
    public static void main(String[] args) {

        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);




    }
}
