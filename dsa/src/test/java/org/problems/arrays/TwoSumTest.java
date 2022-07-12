package org.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.util.Convertor.convertPayload;

class TwoSumTest {

    @ParameterizedTest
    @CsvSource(value = {"9:0,1:2,7,11,15", "6:1,2:3,2,4", "6:0,1:3,3"}, delimiter = ':')
    @DisplayName("Testing 1. Two Sum (Naive Solution)")
    void twoSumNaive(String target, String expectedOutputStr, String payload) {
        int[] nums = convertPayload(payload);
        int[] expectedOutput = convertPayload(expectedOutputStr);
        assertArrayEquals(expectedOutput, TwoSum.twoSumNaive(Integer.parseInt(target), nums));
    }

    @ParameterizedTest
    @CsvSource(value = {"9:0,1:2,7,11,15", "6:1,2:3,2,4", "6:0,1:3,3"}, delimiter = ':')
    @DisplayName("Testing 1. Two Sum (Using Map)")
    void twoSumUsingMap(String target, String expectedOutputStr, String payload) {
        int[] nums = convertPayload(payload);
        int[] expectedOutput = convertPayload(expectedOutputStr);
        assertArrayEquals(expectedOutput, TwoSum.twoSumUsingMap(Integer.parseInt(target), nums));
    }

    @ParameterizedTest
    @CsvSource(value = {"9:0,1:2,7,11,15", "6:1,2:3,2,4", "6:0,1:3,3"}, delimiter = ':')
    @DisplayName("Testing 1. Two Sum (Using Array)")
    void twoSumUsingArray(String target, String expectedOutputStr, String payload) {
        int[] nums = convertPayload(payload);
        int[] expectedOutput = convertPayload(expectedOutputStr);
        assertArrayEquals(expectedOutput, TwoSum.twoSumUsingArray(Integer.parseInt(target), nums));
    }
}