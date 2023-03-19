package step02.abstraction.abstraction.customerdatabaseadd;

public class Runner {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();//just this object doesn't work, it throws NullPointerException
        customerManager.databaseManager = new OracleDatabaseManager();//so we newed customerManager object with OracleDatabaseManager
        //if we want ot changer our database, we should change just constructor of the object
  //      customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();













    }
}
