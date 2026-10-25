package notification;

public class EmailNotifier implements Notifier {

    @Override
    public void notifyClient(double amount) {
        System.out.println("Email: client notified about payment " + amount);
    }
}