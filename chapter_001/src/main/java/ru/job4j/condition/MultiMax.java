package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int prepare = first > second ? first : second;
        int result = prepare > third ? prepare : third;
        // if ...
        return result;
    }
}