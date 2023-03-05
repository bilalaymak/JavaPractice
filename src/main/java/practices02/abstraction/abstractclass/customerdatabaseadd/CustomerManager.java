package practices02.abstraction.abstractclass.customerdatabaseadd;

public class CustomerManager {

    BaseDatabaseManager databaseManager;//we created this object to access to all databases of
    //child classes of BaseDatabaseManager class

    public void getCustomers(){
//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//        oracleDatabaseManager.getData();
        //when we do like this, we would be dependent on OracleDatabaseManager
        // it is not recommended
        databaseManager.getData();


    }






}
