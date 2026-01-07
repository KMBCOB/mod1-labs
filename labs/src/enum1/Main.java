package enum1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, OrderStatus.NEW);
        order.printStatusMessage();
        order.setStatus(OrderStatus.SHIPPED);
        order.cancelOrder();
        order.printStatusMessage();
    }
}
