package practices02.abstraction.abstractclass.customerdatabaseadd;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("data was retrieved : SQL Server");
    }
}
