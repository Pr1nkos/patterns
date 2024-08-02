package ru.pr1nkos.behavioral.strategy;

/**
 * The type Bubble sort.
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorted with bubble sort");
    }
}