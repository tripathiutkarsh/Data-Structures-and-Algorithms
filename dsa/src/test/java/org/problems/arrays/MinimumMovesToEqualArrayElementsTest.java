package org.problems.arrays;

import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumMovesToEqualArrayElementsTest {

    @Test
    @DisplayName("Testing 453. Minimum Moves to Equal Array Elements")
    void minMoves() {
        int[] nums = new int[]{1, 7, 2, 5};
        assertEquals(11, MinimumMovesToEqualArrayElements.minMoves(nums));
    }
}