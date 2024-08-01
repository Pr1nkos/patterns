package ru.pr1nkos.behavioral.state;

public class DeliveredOrderState implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("The order is already delivered.");
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(ShippedOrderState.createShippedOrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order delivered.");
    }
}
