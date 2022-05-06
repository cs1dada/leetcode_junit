package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P215_KthLargestElementInAnArrayTest {

    P215_KthLargestElementInAnArray.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P215_KthLargestElementInAnArray().new Solution();
    }

    @Test
    void KthLargestElementInAnArray() {
        int [] nums = {3,2,1,5,6,4};
        assertEquals(5,
                solution.findKthLargest(nums,2));

    }

    @Test
    void KthLargestElementInAnArray2() {
        int [] nums = {3,2,3,1,2,4,5,5,6};
        assertEquals(4,
                solution.findKthLargest(nums,4));

    }
}