public class EmailDecorator extends NotificationDecorator {

    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send() {
        return super.send() + " via Email";
    }
    
}
