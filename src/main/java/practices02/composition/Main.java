package practices02.composition;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 100;

        manager.addProduct(product);//Product added successfully : Mouse


    //    DatabaseHelper.Crud.delete();
    //    DatabaseHelper.Connection.createConnection();










    }
}
