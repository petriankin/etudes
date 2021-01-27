package io.github.petriankin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubarraySumTest {

    @Test
    void findMinSubArrayTest1() {
        int result = MinSizeSubarraySum.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2});
        assertThat(result).isEqualTo(2); // [5, 2]
    }

    @Test
    void findMinSubArrayTest2() {
        int result = MinSizeSubarraySum.findMinSubArray(7, new int[]{2, 1, 5, 2, 8});
        assertThat(result).isEqualTo(1); // [8]
    }

    @Test
    void findMinSubArrayTest3() {
        int result = MinSizeSubarraySum.findMinSubArray(8, new int[]{3, 4, 1, 1, 6});
        assertThat(result).isEqualTo(3); // [1, 1, 6]
    }

    @Test
    void findMinSubArrayTest4() {
        int result = MinSizeSubarraySum.findMinSubArray(8, new int[]{1, 1, 1});
        assertThat(result).isEqualTo(0); // no such subarray exists
    }
}
