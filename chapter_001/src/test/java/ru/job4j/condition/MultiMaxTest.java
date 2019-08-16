package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMaxTwo() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondMaxThree() {
        MultiMax check = new MultiMax();
        int result = check.max(8, 2, 211);
        assertThat(result, is(211));
    }
}