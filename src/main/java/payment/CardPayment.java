package payment;

public class CardPayment extends BasePayment implements Refundable {

    public CardPayment() {
        super("Card");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment by card: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Card refund: " + amount);
    }
}