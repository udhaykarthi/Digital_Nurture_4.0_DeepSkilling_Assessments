public class GpayAdaptor implements Target {
    private GpayAdaptee gpayAdaptee;
    public GpayAdaptor(GpayAdaptee gpayAdaptee) {
        this.gpayAdaptee = gpayAdaptee;
    }

    @Override
    public void PaymentProcessor(double amount) {
        gpayAdaptee.makePaymenmt(amount);
    }
}
