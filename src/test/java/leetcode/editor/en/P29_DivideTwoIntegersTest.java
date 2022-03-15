package leetcode.editor.en;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P29_DivideTwoIntegersTest {

    P29_DivideTwoIntegers.Solution solution;


    @BeforeEach
    void setUp() {
        solution = new P29_DivideTwoIntegers().new Solution();
    }

    @Test
    void testDivide() {
        assertEquals(3, solution.divide(10,3));
        assertEquals(-2, solution.divide(7,-3));
        assertEquals(3, solution.divide(-3,-1));
        assertEquals(2147483648, solution.divide(-2147483648,-1));



    }

    @Test
    void main() {
    }
}