public class PaytmAdaptor implements Target {
    private PaytmAdaptee paytmAdaptee;
    public PaytmAdaptor(PaytmAdaptee paytmAdaptee) {
        this.paytmAdaptee = paytmAdaptee;
    }

    @Override
    public void PaymentProcessor(double amount) {
        paytmAdaptee.makePaymenmt(amount);
    }
}


