package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P20_ValidParenthesesTest {
    P20_ValidParentheses.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P20_ValidParentheses().new Solution();
    }

    @Test
    void test() {
        String s = "]";
        assertEquals(false, solution.isValid(s));

        s = "(";
        assertEquals(false, solution.isValid(s));

        s = "()[]{}";
        assertEquals(true, solution.isValid(s));

        s = "()";
        assertEquals(true, solution.isValid(s));

        s = "";
        assertEquals(true, solution.isValid(s));


    }
}