package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            // написать формулу для расчета площади треугольника.
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * <p>
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    private boolean exist(double a, double c, double b) {
       /* if (b + c <= a) {
            return false;
        } else if (a + c <= b) {
            return false;
        }
        if (a + b <= c) {
            return false;
        }*/
        return (b + c > a) && (a + c > b) && (a + b > c);

    }
}


//package ru.job4j.condition;
//
//public class Triangle {
//
//    /**
//     * Метод вычисления полупериметра по длинам сторон.
//     *
//     * Формула.
//     *
//     * (a + b + c) / 2
//     *
//     * @param a расстояние между точками a b
//     * @param b расстояние между точками a c
//     * @param c расстояние между точками b c
//     * @return полуперимента.
//     */
//    public double period(double a, double b, double c) {
//        double p = (a + b + c) / 2;
//        return  p;
//    }
//
//    /**
//     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
//     *
//     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
//     *
//     * @param a Длина от точки a b.
//     * @param b Длина от точки a c.
//     * @param c Длина от точки b c.
//     * @return
//     */
//    private boolean exist(double a, double c, double b) {
//
//       /** if (b + c <= a) {
//            //return false;
//        } else if (a + c <= b) {
//            //return false;
//        }if (a + b <= c) {
//            //return false;
//        }*/
//        return (b + c > a) && (a + c > b) && (a + b > c);
//
//    }
//
//        /**
//         * Метод должен вычислить площадь треугольника.
//         *
//         * Формула.
//         *
//         * √ p *(p - a) * (p - b) * (p - c)
//         *
//         * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
//         *
//         * @return Вернуть площадь, если треугольник существует или -1.
//         */
//        public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
//            double rsl = 4;
//            double a = new Point().distance(x1, y1, x2, y2);
//            double b = new Point().distance(x2, y2, x3, y3);
//            double c = new Point().distance(x1, y1, x3, y3);
//            double p = period(a, b, c);
//            if (this.exist(a, b, c)) {
//                // написать формулу для расчета площади треугольника.
//                rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//
//            }
//            return rsl;
//        }
//    }
