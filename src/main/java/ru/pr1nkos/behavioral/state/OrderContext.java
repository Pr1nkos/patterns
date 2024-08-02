package ru.pr1nkos.behavioral.state;

import lombok.Setter;

/**
 * The type Order context.
 */
@Setter
public class OrderContext {
    private OrderState state;

    /**
     * Instantiates a new Order context.
     */
    public OrderContext() {
        state = NewOrderState.createNewOrderState();
    }

    /**
     * Next.
     */
    public void next() {
        state.next(this);
    }

    /**
     * Prev.
     */
    public void prev() {
        state.prev(this);
    }

    /**
     * Print status.
     */
    public void printStatus() {
        state.printStatus();
    }

}
