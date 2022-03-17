package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P66_PlusOneTest {
    P66_PlusOne.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P66_PlusOne().new Solution();
    }

    @Test
    void testDigits() {

        int[] testData = {4, 3, 2, 1};
        int[] answer = {4, 3, 2, 2};
        assertArrayEquals(answer, solution.plusOne(testData));
    }
}