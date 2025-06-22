public class Main {
    public static void main(String[] args) {
        PaytmAdaptee paytmAdaptee = new PaytmAdaptee();
        Target target = new PaytmAdaptor(paytmAdaptee);
        target.PaymentProcessor(1000.0);
    }
}
