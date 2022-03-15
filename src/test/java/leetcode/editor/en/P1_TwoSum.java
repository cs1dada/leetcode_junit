package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1_TwoSum {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testTwoSum() {
        int[] numsArray = { 1, 3, 7, 9, 2 };
        int target = 11;
        int[] answer = {3,4};

        assertArrayEquals(answer,  solution.twoSum(numsArray, target));
    }
}