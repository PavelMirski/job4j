package ru.job4j.condition;

public class Max {


    public int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        int tmp = max(first, second);
        int result = third > tmp ? third : tmp;
        return result;
    }

    public int max(int first, int second, int third, int fourth) {
        int tmp = max(first, second, third);
        int result = fourth > tmp ? fourth : tmp;
        return result;
    }
}