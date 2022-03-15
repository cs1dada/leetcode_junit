package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P11_ContainerWithMostWaterTest {

    P11_ContainerWithMostWater.Solution solution;
    @BeforeEach
    void setUp() {
        solution = new P11_ContainerWithMostWater().new Solution();
    }

    @Test
    void testMaxArea() {
        int[] height = { 1,8,6,2,5,4,8,3,7};
        int answer = 49;

        assertEquals(49,solution.maxArea(height));
    }

    @Test
    void main() {
    }
}