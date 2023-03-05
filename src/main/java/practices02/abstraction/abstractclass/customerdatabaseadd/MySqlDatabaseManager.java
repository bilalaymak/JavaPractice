package practices02.abstraction.abstractclass.customerdatabaseadd;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("data was retrieved = MySQL");
    }
}
