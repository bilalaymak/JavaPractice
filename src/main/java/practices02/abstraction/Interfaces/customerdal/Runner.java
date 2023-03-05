package practices02.abstraction.Interfaces.customerdal;

public class Runner {
    public static void main(String[] args) {
    //interfaces also cannot be initialized (is not newed)
//        ICustomerDal customerDal = new ICustomerDal() {
//            @Override
//            public void add() {
//
//            }
//        }

        //there are layers in applications that there are
        // i) data access layer
        // ii) business(we put rules how to use) layer
        // iii) UI layer
        // so we use interfaces to do transitions among layers to prevent dependencies among layers


        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.add();




    }
}
