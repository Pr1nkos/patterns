package ru.pr1nkos.behavioral.state;

public class ShippedOrderState implements OrderState {
    private ShippedOrderState() {
    }

    public static ShippedOrderState createShippedOrderState() {
        return new ShippedOrderState();
    }

    @Override
    public void next(OrderContext context) {
        context.setState(new DeliveredOrderState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(NewOrderState.createNewOrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order shipped, not delivered yet.");
    }
}
