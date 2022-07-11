package org.problems.arrays;

public class MinimumMovesToEqualArrayElements {
    public static int minMoves(int[] nums) {
        // Calculate minimum element
        int min = Integer.MAX_VALUE;
        for (int i=0; i< nums.length;i++)
            min = nums[i] < min ? nums[i] : min;

        // Subtract min from each element
        // Add the differences together
        int moves = 0;
        for (int i = 0; i< nums.length; i++)
            moves += nums[i]-min;
        return moves;
    }
}
