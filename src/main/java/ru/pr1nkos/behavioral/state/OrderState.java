package ru.pr1nkos.behavioral.state;

public interface OrderState {
    void next(OrderContext context);
    void prev(OrderContext context);
    void printStatus();
}
