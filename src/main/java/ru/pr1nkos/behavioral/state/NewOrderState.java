package ru.pr1nkos.behavioral.state;

public class NewOrderState implements OrderState {

    private NewOrderState() {
    }

    public static NewOrderState createNewOrderState() {
        return new NewOrderState();
    }

    @Override
    public void next(OrderContext context) {
        context.setState(ShippedOrderState.createShippedOrderState());
    }

    @Override
    public void prev(OrderContext context) {
        System.out.println("The order is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order placed, not shipped yet");
    }
}
