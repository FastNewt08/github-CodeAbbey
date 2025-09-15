public class BankAccountManager {
    static class BankAccount {
        private String ownerName;
        private String accountNumber;
        private double balance;
        private static int totalAccounts = 0;

        BankAccount(String ownerName, String accountNumber, double initialBalance) {
            this.ownerName = ownerName;
            this.accountNumber = accountNumber;
            if (initialBalance < 0) {
                this.balance = 0.0;
            } else {
                this.balance = initialBalance;
            }
            totalAccounts++;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public static int getTotalAccounts() {
            return totalAccounts;
        }

        public void deposit(double amount) {
            if (amount < 0) {
                System.out.println("Invalid Amount.");
                return;
            }
            balance += amount;
            System.out.println(getOwnerName() + "'s balance after the deposit: " + getBalance());
        }

        public boolean withdraw(double amount) {
            if (amount <= balance && amount > 0) {
                balance -= amount;
                System.out.println(getOwnerName() + "'s balance after the withdraw: " + getBalance());
                return true;
            } else {
                System.out.println(getOwnerName() + "'s balance after the withdraw: " + getBalance());
                return false;
            }
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Arel", "54321", 312.0);
        BankAccount acc2 = new BankAccount("Kim", "12345", 100.0);
        BankAccount acc3 = new BankAccount("Xentail", "98765", 1000);

        acc1.deposit(200.0);
        acc3.withdraw(599);
        acc2.withdraw(200);

        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}


