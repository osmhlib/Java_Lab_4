package app;

import notification.EmailNotifier;
import notification.SmsNotifier;
import payment.CardPayment;
import payment.CryptoPayment;
import payment.PayPalPayment;
import payment.Refundable;
import service.PaymentService;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Card + Email ===");

        PaymentService cardService =
                new PaymentService(
                        new CardPayment(),
                        new EmailNotifier()
                );

        cardService.processPayment(500);


        System.out.println("\n=== PayPal + SMS ===");

        PaymentService paypalService =
                new PaymentService(
                        new PayPalPayment(),
                        new SmsNotifier()
                );

        paypalService.processPayment(750);


        System.out.println("\n=== Crypto + Email ===");

        PaymentService cryptoService =
                new PaymentService(
                        new CryptoPayment(),
                        new EmailNotifier()
                );

        cryptoService.processPayment(1000);


        System.out.println("\n=== Refund ===");

        Refundable refundable = new CardPayment();
        refundable.refund(200);
    }
}