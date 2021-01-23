package io.petriankin.github.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void twoSumExampleTestCase1() {
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertThat(result).containsExactly(0, 1);
    }

    @Test
    void twoSumExampleTestCase2() {
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertThat(result).containsExactly(1, 2);
    }

    @Test
    void twoSumExampleTestCase3() {
        int[] result = solution.twoSum(new int[]{3, 3}, 6);
        assertThat(result).containsExactly(0, 1);
    }

    @Test
    void twoSumCustomTestCase1() {
        int[] result = solution.twoSum(new int[]{5, 0, 1, 4}, 4);
        assertThat(result).containsExactly(1, 3);
    }

    @Test
    void twoSumCustomTestCase2() {
        int[] result = solution.twoSum(new int[]{1, 2, 4, 0, 6}, 5);
        assertThat(result).containsExactly(0, 2);
    }
}
