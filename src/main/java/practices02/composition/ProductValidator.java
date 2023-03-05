package practices02.composition;

public class ProductValidator {

    static { // static blocks executes before everything in the class
        System.out.println("static block executed");
    }

    //constructor method
    public ProductValidator(){
        System.out.println("constructor executed");
    }

    public static boolean isValid(Product product){ // we make static like this methods
                                                    //for whom everyone can reach updated products in validation
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        } else {
            return false;
        }

    }








}
