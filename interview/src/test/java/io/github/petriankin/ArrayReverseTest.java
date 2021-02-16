package io.github.petriankin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayReverseTest {

    @Test
    void reverseArrayOfOddAmountOfElementsTest() {
        int[] array = {1, 2, 3, 4, 5};

        ArrayReverse.reverseArray(array);

        assertThat(array).isEqualTo(new int[]{5, 4, 3, 2, 1});
    }

    @Test
    void reverseArrayOfEvenAmountOfElementsTest() {
        int[] array = {1, 2, 3, 4, 5, 6};

        ArrayReverse.reverseArray(array);

        assertThat(array).isEqualTo(new int[]{6, 5, 4, 3, 2, 1});
    }
}
