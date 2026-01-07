package enum1;

public enum OrderStatus {
    NEW("A new order", true),
    PROCESSING("Order being processed", true),
    SHIPPED("Order has been shipped", false),
    DELIVERED("Order has been delivered", false),
    CANCELLED("Order has been cancelled", false);

    String desc;
    boolean cancellable;

    OrderStatus(String desc, boolean cancellable) {
        this.desc = desc;
        this. cancellable = cancellable;
    }
}
