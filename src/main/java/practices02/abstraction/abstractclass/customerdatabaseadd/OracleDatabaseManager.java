package practices02.abstraction.abstractclass.customerdatabaseadd;

public class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data was retrieved : Oracle ");
    }
}
