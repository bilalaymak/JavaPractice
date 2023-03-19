package step02.abstraction.Interfaces.customerdal;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("added to Oracle database");
    }
}
