package step02.abstraction.Interfaces.customerdal;

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

          //therefore, when we want to chage database operator, we just change the parameter in the parenthesis
          CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
    //      customerManager.customerDal = new OracleCustomerDal();
    //      customerManager.customerDal = new MySqlCustomerDal();
     //     customerManager.add();//added to MySQL database
            customerManager.add();//added to Oracle database





    }
}
