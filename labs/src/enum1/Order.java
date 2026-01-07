package enum1;

public class Order {
    private int orderId;
    private OrderStatus status;

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    void cancelOrder() {
        if (status.cancellable) { setStatus(OrderStatus.CANCELLED); }
        else { System.out.println("Order cannot be cancelled in its current state."); }
    }

    void printStatusMessage() {
        switch (status) {
            case NEW -> System.out.println("Order has been requested.");
            case PROCESSING -> System.out.println("Order is being processed.");
            case SHIPPED -> System.out.println("Order has been shipped.");
            case DELIVERED -> System.out.println("Order has been delivered.");
            case CANCELLED -> System.out.println("Order has been cancelled.");

        }
    }
}
