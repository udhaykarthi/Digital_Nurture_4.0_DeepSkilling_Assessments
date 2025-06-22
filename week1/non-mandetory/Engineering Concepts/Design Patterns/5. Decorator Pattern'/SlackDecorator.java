public class SlackDecorator extends NotificationDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send() {
        return super.send() + " via Slack";
    }
    
}
