package task2;

public class TransferService {
        public void addFunds(double amount, CreditCard card) {
            if (amount <= 0) {
                System.out.println("The amount to add must be positive.");
            } else {
                card.setBalance(card.getBalance() + amount);
                System.out.println(amount + " added to card " + card.getAccountNumber());
            }
        }

        public void withdrawFunds(double amount, CreditCard card) {
            if (amount <= 0) {
                System.out.println("The amount to withdraw must be positive.");
            } else if (amount > card.getBalance()) {
                System.out.println("Insufficient funds on card " + card.getAccountNumber());
            } else {
                card.setBalance(card.getBalance() - amount);
                System.out.println(amount + " withdrawn from card " + card.getAccountNumber());
            }
        }

        public void printCardInfo(CreditCard card) {
            System.out.println(card);
        }
    }


