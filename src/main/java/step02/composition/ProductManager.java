package step02.composition;

public class ProductManager {


    public void addProduct(Product product){
   //     ProductValidator validator = new ProductValidator();
   // since we made isValid method static, we don't need to create validator object
        if (ProductValidator.isValid(product)){
            System.out.println("Product added successfully : " +product.name);
        }else{
            System.out.println("invalid Product information");
        }

        //when we create validator object the constructor in the class executes
        //constructors are dependent on the properties of the class and objects created from the class



    }



}
