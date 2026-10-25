package payment;

public abstract class BasePayment implements PaymentMethod {

    protected String name;

    public BasePayment(String name) {
        this.name = name;
    }

    protected void printAmount(double amount) {
        System.out.printf("%.2f%n", amount);
    }
}