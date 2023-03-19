package step02.abstraction.Interfaces.customerdal;

public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("added to MySQL database ");
    }
}
