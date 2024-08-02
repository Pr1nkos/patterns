package ru.pr1nkos.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

/**
 * The type Context.
 */
@Data
public class Context {
    private SortingStrategy strategy;

    /**
     * Execute strategy.
     *
     * @param numbers the numbers
     */
    public void executeStrategy(int[] numbers) {
        strategy.sort(numbers);
    }
}
