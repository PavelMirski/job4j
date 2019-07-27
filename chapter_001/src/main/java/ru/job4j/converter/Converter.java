package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " Dollars.");
        int rublesE = euroToRuble(140);
        System.out.println("140 euro are " + rublesE + " rubles.");
        int rublesD = dollarToRuble(140);
        System.out.println("140 dollars are " + rublesD + " rubles.");
    }
}