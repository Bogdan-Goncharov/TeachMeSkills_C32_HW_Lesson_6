package task2;

public class ApplicationRunner {
    public static void main(String[] args) {

                CreditCard card1 = new CreditCard("1234567890", 1000);
                CreditCard card2 = new CreditCard("0987654321", 2000);
                CreditCard card3 = new CreditCard("1122334455", 3000);
                TransferService service = new TransferService();
                service.addFunds(500, card1);
                service.addFunds(300, card2);
                service.withdrawFunds(1500, card3);
                service.printCardInfo(card1);
                service.printCardInfo(card2);
                service.printCardInfo(card3);
            }
        }



