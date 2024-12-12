package task2;

public class CreditCard {

        private String accountNumber;
        private double balance;

        public CreditCard(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "CreditCard {" +
                    "accountNumber ='" + accountNumber + '\'' +
                    ", balance =" + balance +
                    '}';
        }
    }


