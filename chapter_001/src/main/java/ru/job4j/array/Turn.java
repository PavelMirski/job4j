package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int n = array.length;
        int t;
        for (int i = 0; i < n / 2; i++) {
            t = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = t;
        }
        return array;
    }
}