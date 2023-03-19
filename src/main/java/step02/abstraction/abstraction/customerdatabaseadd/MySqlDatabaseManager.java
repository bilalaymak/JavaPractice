package step02.abstraction.abstraction.customerdatabaseadd;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("data was retrieved = MySQL");
    }
}
