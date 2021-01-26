package io.github.petriankin;

public class MaxSumSubarrayOfSizeK {
    public static int findMaxSumSubarray(int k, int[] arr) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentSum += arr[windowEnd];
            // if hit the right edge of the window check if sum is max now and slide window
            if (windowEnd >= k - 1) {
                max = Math.max(currentSum, max);
                currentSum -= arr[windowStart];
                windowStart++;
            }
        }
        return max;
    }
}
