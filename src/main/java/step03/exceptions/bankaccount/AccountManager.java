package step03.exceptions.bankaccount;

public class AccountManager {

    private double balance; //balance = hesap  deposit = para yatirmak

    public void deposit(double amount){
        balance += amount;
    }


    public void withdraw(double amount) throws BalanceInsufficientException {
        if(balance > amount){
            balance -= amount;
        }else {
            throw new BalanceInsufficientException("balance is not sufficient");
        }


    }
    public double getBalance(){//getter
        return balance;
    }









}
