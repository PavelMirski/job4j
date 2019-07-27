package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height- 100)*1.15;
    }

    public static double womanWeight(double height) {
        return (height- 110)*1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(195);
        System.out.println("Man 195 is " + man);

        double woman = womanWeight(195);
        System.out.println("Woman 195 is " + woman);
    }

}