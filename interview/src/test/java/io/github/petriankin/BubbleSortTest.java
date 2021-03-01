package io.github.petriankin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    @Test
    void bubbleSortTest() {
        int[] arr = {5, 3, 4, 2, 1};
        BubbleSort.sort(arr);

        assertThat(arr).isEqualTo(new int[]{1, 2, 3, 4, 5});

    }
}
