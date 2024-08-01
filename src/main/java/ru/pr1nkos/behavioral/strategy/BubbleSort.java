package ru.pr1nkos.behavioral.strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorted with bubble sort");
    }
}