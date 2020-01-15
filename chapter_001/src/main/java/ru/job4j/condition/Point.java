package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + (Math.pow(that.y - this.y, 2) + (Math.pow(that.z - this.z, 2))));
    }

    public static double distance3d(Point a, Point b) {
        double dist = a.distance3d(b);
        return dist;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 2, 3);
        Point b = new Point(2, 4, 1);
        double dist = a.distance3d(b);
        System.out.println(dist);
    }

}

/*
package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = Math.pow(x2 - x1, 2);
        double b = Math.pow(y2 - y1, 2);
        double c = a + b;
        return  Math.sqrt(c);
    }

    public static void main(String[] args) {
        double first = distance(5, 4, 2, 7);
        System.out.println("first (5, 4) to (2, 7) " + first);

        double second = distance(8, 2, 1, 5);
        System.out.println("second (8, 2) to (1, 5) " + second);

        double third = distance(-2, -7, 3, 9);
        System.out.println("third (-2, -7) to (3, 9) " + third);
    }
}*/
