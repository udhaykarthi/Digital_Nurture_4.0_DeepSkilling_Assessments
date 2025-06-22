public class NotificationDecorator implements Notifier{

    private Notifier notifier;

    public NotificationDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public String send(){
        return notifier.send();
    } 

} 
    

