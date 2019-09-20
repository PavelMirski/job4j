package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
<<<<<<< HEAD
        //nextPrime:
        int nextPrime = 0;
        for (int i = 2; i <= finish; i++) {

            for (int j = 2; j < i; j++) {
                if ((i % j) != 0) {
                    nextPrime ++; ;

                }//nextPrime ++;
            }
            count = nextPrime;
=======
        //Boolean prime = true;
        for (int i = 2; i <= finish; i++) {

            Boolean prime = true;
            for (int j = 2; j <= i/2; j++) {
                if ((i % j) == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime){
                count++;
            }
>>>>>>> 28d0359e8a562b8d5f156a7ad3fbc6035cbae46a
        }


        return count;
    }
}