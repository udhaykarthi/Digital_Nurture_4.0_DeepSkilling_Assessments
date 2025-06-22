class Orders{
    int orderId;
    String customerName;
    double orderAmount;

    public Orders(int orderId, String customerName, double orderAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}