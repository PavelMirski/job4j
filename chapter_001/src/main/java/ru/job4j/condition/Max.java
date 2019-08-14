package ru.job4j.condition;

public class Max {


    public int max(int left, int right) {
        //left = 3;
        //right = 2;

        int result = left > right ? left : right;

        return result;
    }
}