package projects;

import java.util.Scanner;







// --------------------MINI PROJECT on BANKING SYSTEM-----------------------------------------
    class BankDetails{
        private String AccountNo;
        private String Name;
        private String Acc_Type;
        private long balance;
        Scanner sc = new Scanner(System.in);

        //method to open new account
        public void openAccount() {
            System.out.print("Enter the account number: ");
            AccountNo = sc.next();

            System.out.print("Enter the account type: ");
            Acc_Type = sc.next();

            System.out.print("Enter your name: ");
            Name = sc.next();

            System.out.print("Enter the Balance: ");
            balance = sc.nextLong();
        }

        //implementing method to display account details
        public void showAccount() {
            System.out.println("Enter the name of account holder: "+ Name);
            System.out.println("Account no. : "+AccountNo);
            System.out.println("Enter the account type: " + Acc_Type);
            System.out.println("The balance is: " + balance);
        }

        // implementing method to DEPOSIT MONEY
        public void deposit() {
            long amount;
            System.out.println("Enter the amount you want to deposit: ");
            amount = sc.nextLong();
            balance = balance + amount;
        }

        //implementing the method to WITHDRAW MONEY
        public void withdraw() {
            long amount;
            System.out.println("Enter the amount you want to withdraw: ");
            amount = sc.nextLong();
            if(balance >= amount)
            {
                balance = balance - amount;
                System.out.println("Balance after withdrawal: " + balance);
            }else
            {
                System.out.println("TRANSACTION FAILED...  You have LOW BALANCE " + amount);

            }
        }
        //method to search an account number
        public boolean search(String Acc_No) {
            if(AccountNo.equals(Acc_No)) {
                showAccount();
                return(true);
            }
            return false;
        }
    }

    public class BankingApplication {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            // creating initial accounts
            System.out.println("How many number of customers do you want to input? ");
            int n = sc.nextInt();
            BankDetails C[] = new BankDetails[n];
            for(int i=0; i<C.length; i++)
            {
                C[i] = new BankDetails();
                C[i].openAccount();
            }
            //
            int ch;
            do {
                System.out.println("**** Banking System Application ****");
                System.out.println("1. Display all account details \n 2. Search by Account number."
                        + " \n 3. Deposit the amount. \n 4. Withdraw the amount \n 5. EXIT ");
                System.out.println("Enter your choice: ");
                ch = sc.nextInt();
                switch(ch) {
                    case 1:
                        for(int i=0; i<C.length; i++)
                        {
                            C[i].showAccount();
                        }
                        break;
                    case 2:
                        System.out.println("Enter the account number you want to search: ");
                        String Acc_No = sc.next();
                        boolean found = false;
                        for(int i=0; i<C.length; i++)
                        {
                            found = C[i].search(Acc_No);
                            if(found) {
                                break;
                            }
                        }
                        if(!found) {
                            System.out.println("Search failed! Account dosen't exist..");
                        }
                        break;
                    case 3:
                        System.out.println("Enter Account number: ");
                        Acc_No = sc.next();
                        found = false;
                        for(int i=0; i<C.length; i++) {
                            found = C[i].search(Acc_No);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if(!found) {
                            System.out.println("Search failed! Account dosen't exist...");
                        }
                        break;
                    case 4:
                        System.out.println("Enter account Number: ");
                        Acc_No = sc.next();
                        found = false;
                        for(int i=0; i < C.length; i++)
                        {
                            found = C[i].search(Acc_No);
                            if(found) {
                                C[i].withdraw();
                                break;
                            }
                        }
                        if(!found) {
                            System.out.println("Search failed.. Account dosen't exist...");
                        }
                        break;
                    case 5:
                        System.out.println("Thank you .. \n Have A good Day");
                        break;
                }
            }
            while(ch!=5);
        }

    }

