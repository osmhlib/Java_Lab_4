package notification;

public class SmsNotifier implements Notifier {

    @Override
    public void notifyClient(double amount) {
        System.out.println("SMS: client notified about payment " + amount);
    }
}