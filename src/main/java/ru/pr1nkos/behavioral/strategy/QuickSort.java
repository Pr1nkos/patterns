package ru.pr1nkos.behavioral.strategy;

public class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorting with QuickSort");
    }
}
