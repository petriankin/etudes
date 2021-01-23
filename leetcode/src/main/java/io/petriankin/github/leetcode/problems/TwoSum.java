package io.petriankin.github.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int desiredValue = target - nums[i];
            if (valueIndexMap.containsKey(desiredValue)) {
                return new int[]{valueIndexMap.get(desiredValue), i};
            }
            valueIndexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
