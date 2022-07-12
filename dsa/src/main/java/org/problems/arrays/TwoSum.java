package org.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumNaive(int target, int[] nums){
        int[] result = new int[2];
        for (int i=0; i< nums.length;i++)
            for (int j=i+1; j< nums.length;j++)
                if (nums[i] == target - nums[j]){
                    result[0] = i;
                    result[1] = j;
                }
        return result;
    }

    public static int[] twoSumUsingMap(int target, int[] nums){
        int[] result = new int[2];
        Map<Integer, Integer> vault = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            if (!vault.containsKey(nums[i]))
                vault.put(target-nums[i], i);
            else {
                result[0] = vault.get(nums[i]);
                result[1] = i;
            }
            }
        return result;
    }
    public static int[] twoSumUsingArray(int target, int[] nums){
        int[] result = new int[2];

        // Calculate maximum element
        int max = Integer.MIN_VALUE;
        for (int i=0; i< nums.length;i++)
            max = nums[i] > max ? nums[i] : max;

        int[] vault = new int[max+1];
        Arrays.fill(vault, Integer.MIN_VALUE);
        for (int i=0; i<nums.length; i++){
            if (vault[nums[i]]==Integer.MIN_VALUE)
                vault[Math.abs(target-nums[i])] = i;
            else {
                result[0] = vault[nums[i]];
                result[1] = i;
            }
        }
        return result;
    }}
