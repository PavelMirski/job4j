package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = array[start]; i < array[finish]; i++) {

            if (array[i] < min) {
                min = array[i];
            }

        }

        return min;
    }
}

// Why doesnt work?