package ru.job4j.array;

public class Prepare {
    public static void main(String[] args) {
        int[] rst = new int[5];
        for (int i = 0; i < 5; i++) {

            rst[i] = (int) Math.pow(i + 1, 2);

            System.out.println(rst[i]);
        }
    }

}
