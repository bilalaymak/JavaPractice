package practices02.abstraction.Interfaces.customerdal;

public class CustomerManager {

    private ICustomerDal customerDal;
    //since developers may forget to type
    //CustomerManager customerManager = new CustomerManager();
    //      customerManager.customerDal = new OracleCustomerDal();
    // this syntax, we created here a constructor initialize customerDal
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        // business codes

        //if we create the database object, we will be dependent on the Oracle database
        //it is not recommended
       // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();

        customerDal.add();












    }
}
