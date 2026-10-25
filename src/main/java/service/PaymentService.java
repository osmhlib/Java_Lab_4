package service;

import notification.Notifier;
import payment.PaymentMethod;

public class PaymentService {

    private final PaymentMethod paymentMethod;
    private final Notifier notifier;

    public PaymentService(
            PaymentMethod paymentMethod,
            Notifier notifier
    ) {
        this.paymentMethod = paymentMethod;
        this.notifier = notifier;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
        notifier.notifyClient(amount);
    }
}