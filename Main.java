import decorator.EmailSender;
import decorator.NotificationSender;
import decorator.SMSSender;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NotificationSender s1 = new EmailSender(new SMSSender(null));
        NotificationSender s2 = new SMSSender(new EmailSender(null));
        s1.send();
        s2.send();
    }
}