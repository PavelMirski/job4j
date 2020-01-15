package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenDistance3d() {
        Point a = new Point(0, 2, 3);
        Point b = new Point(2, 4, 1);

        double result = Point.distance3d(a, b);
        assertThat(result, is(3.4641016151377544));
    }

}
