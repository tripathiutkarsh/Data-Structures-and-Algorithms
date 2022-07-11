package org.problems.arrays;

import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MinimumMovesToEqualArrayElementsTest {
    // Ref: https://www.baeldung.com/parameterized-tests-junit-5
    @ParameterizedTest
    @CsvSource(value = {"11:1,7,2,5","3:1,2,3", "101:-4,0,2,87"}, delimiter = ':')
    @DisplayName("Testing 453. Minimum Moves to Equal Array Elements")
    void minMoves(String expectedOutput, String payload) {
        int[] nums = convertPayload(payload);

        assertEquals(Integer.parseInt(expectedOutput), MinimumMovesToEqualArrayElements.minMoves(nums));
    }

    private int[] convertPayload(String payload) {
        String[] stringArray = payload.split(",");
        // declaring an array with the size of string
        int[] arr = new int[stringArray.length];
        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < stringArray.length; i++) {
            arr[i] = Integer.valueOf(stringArray[i]);
        }
        return arr;
    }
}