package ru.pr1nkos.behavioral.state;

import lombok.Setter;

@Setter
public class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = NewOrderState.createNewOrderState();
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }

    public void printStatus() {
        state.printStatus();
    }

}
