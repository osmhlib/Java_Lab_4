package payment;

public class PayPalPayment extends BasePayment implements Refundable {

    public PayPalPayment() {
        super("PayPal");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment by PayPal: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("PayPal refund: " + amount);
    }
}