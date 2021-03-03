package com.LeetCodeJava.FebChallenge;

import java.util.Arrays;

/**
 Feb 25 Challenge - Shortest Unsorted Continuous Subarray
 */

public class ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {

        int[] orig_arr = nums.clone();

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while (start < nums.length){
            if (nums[start] != orig_arr[start]){
                break;
            }
            start++;
        }

        if (start == orig_arr.length){
            return 0;
        }

        while (end >= 0) {
            if (nums[end] != orig_arr[end]) {
                break;
            }
            end--;
        }

        return end - start + 1;
    }
}
