public class SMSDecorator extends NotificationDecorator {

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send() {
        return super.send() + " via SMS";
    }
    
}
