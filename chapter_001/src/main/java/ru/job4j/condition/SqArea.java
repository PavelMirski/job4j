package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        int a = (p / 2) / (k + 1); // 2a + 1 = 3a. a = (6 / 2) / 3
        int b = a * 2;
        int s = a * b;
        return s;
    }

    public static void main(String[] args) {
        int result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}