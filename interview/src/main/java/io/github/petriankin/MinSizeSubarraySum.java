package io.github.petriankin;

/**
 * Given an array of positive numbers and a positive number ‘S’,
 * find the length of the smallest contiguous subarray
 * whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
 */
public class MinSizeSubarraySum {

    public static int findMinSubArray(int s, int[] arr) {
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentSum += arr[windowEnd];
            while (currentSum >= s) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                currentSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
