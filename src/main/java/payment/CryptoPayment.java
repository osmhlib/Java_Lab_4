package payment;

public class CryptoPayment extends BasePayment {

    public CryptoPayment() {
        super("Crypto");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment by cryptocurrency: " + amount);
    }
}