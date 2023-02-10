package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P34_FindFirstAndLastPositionOfElementInSortedArrayTest {

    P34_FindFirstAndLastPositionOfElementInSortedArray.Solution solution;
    int[] arr;

    @BeforeEach
    void setUp() {
        solution = new P34_FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        arr = new int[]{5, 7, 7, 8, 8, 10};
    }

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray() {

        int[] answer = {1, 2};
        assertArrayEquals(answer, solution.searchRange(arr, 7));

    }
}