package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int forYear = 0;
        int allPaing = 0;
        int ostatok = 0;

        while(ostatok >= forYear){

            amount += amount*(percent/100);

            allPaing = amount / monthly;

            forYear = monthly*12;

            ostatok = allPaing - forYear;

            year = allPaing / 12;

        }

        year++;
        return year;
    }
}