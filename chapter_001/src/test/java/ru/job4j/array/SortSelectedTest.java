package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {22, 97, 8};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {8, 22, 97};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortMany() {
        int[] input = new int[] {5, 20, 3, 11, 1, 17, 3, 12, 8, 10};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 3, 5, 8, 10, 11, 12, 17, 20};
        assertThat(result, is(expect));
    }
}