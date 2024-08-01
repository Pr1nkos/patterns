package ru.pr1nkos.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
public class Context {
    private SortingStrategy strategy;

    public void executeStrategy(int[] numbers) {
        strategy.sort(numbers);
    }
}
