package io.github.petriankin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxSumSubarrayOfSizeKTest {

    @Test
    void findMaxSumSubarrayTest1() {
        int result = MaxSumSubarrayOfSizeK.findMaxSumSubarray(3, new int[]{2, 1, 5, 1, 3, 2});
        assertThat(result).isEqualTo(9); // subarray with max sum is [5, 1, 3]
    }

    @Test
    void findMaxSumSubarrayTest2() {
        int result = MaxSumSubarrayOfSizeK.findMaxSumSubarray(2, new int[]{2, 3, 4, 1, 5});
        assertThat(result).isEqualTo(7); // subarray with max sum is [3, 4]
    }
}
