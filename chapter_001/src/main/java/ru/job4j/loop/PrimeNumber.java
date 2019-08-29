package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        nextPrime:
        for (int i = 2; i <= finish; i++) {

            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    continue nextPrime;
                }
            }
            count++;
        }


        return count;
    }
}