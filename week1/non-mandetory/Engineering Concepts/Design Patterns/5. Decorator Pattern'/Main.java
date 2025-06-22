public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Message();
        notifier = new EmailDecorator(notifier);
        notifier = new SMSDecorator(notifier);
        notifier = new SlackDecorator(notifier);
        
        System.out.println(notifier.send());
    }
}
