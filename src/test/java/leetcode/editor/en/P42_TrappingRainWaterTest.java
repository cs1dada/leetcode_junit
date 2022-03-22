package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42_TrappingRainWaterTest {

    P42_TrappingRainWater.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P42_TrappingRainWater().new Solution();
    }

    @Test
    void testTrap() {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int [] sum =    {0,0,1,0,1,2,1,0,0,1,0,1};
        int Output = 6;
        //0,0,1,0,1,2,1,0,0
        assertEquals(6,solution.trap(height));


    }
}