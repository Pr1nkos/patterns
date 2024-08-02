package ru.pr1nkos.behavioral.state;

/**
 * The interface Order state.
 */
public interface OrderState {
    /**
     * Next.
     *
     * @param context the context
     */
    void next(OrderContext context);

    /**
     * Prev.
     *
     * @param context the context
     */
    void prev(OrderContext context);

    /**
     * Print status.
     */
    void printStatus();
}
