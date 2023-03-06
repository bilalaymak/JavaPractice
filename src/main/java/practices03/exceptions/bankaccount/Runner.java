package practices03.exceptions.bankaccount;

public class Runner {
    public static void main(String[] args) throws BalanceInsufficientException {
        //we use throw exception signature to handle exceptions then,
        // that is we delay handling the exception

        AccountManager manager = new AccountManager();
        System.out.println("balance = " + manager.getBalance());
        manager.deposit(100);
        System.out.println("balance = " + manager.getBalance());

        try {
            manager.withdraw(50);
            manager.withdraw(100);

        } catch (BalanceInsufficientException e) {
            throw new BalanceInsufficientException(e.getMessage());
        }

        System.out.println("balance = " + manager.getBalance());
        System.out.println("balance = " + manager.getBalance());










    }







}
