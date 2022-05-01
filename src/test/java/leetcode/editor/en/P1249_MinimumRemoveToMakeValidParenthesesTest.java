package leetcode.editor.en;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1249_MinimumRemoveToMakeValidParenthesesTest {

    P1249_MinimumRemoveToMakeValidParentheses.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P1249_MinimumRemoveToMakeValidParentheses().new Solution();
    }

    /**
     * Input: s = "lee(t(c)o)de)"
     * Output: "lee(t(c)o)de"
     * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
     *
     * Input: s = "a)b(c)d"
     * Output: "ab(c)d"
     *
     * Input: s = "))(("
     * Output: ""
     * Explanation: An empty string is also valid.
     *
     * Input: s = "(("
     */
    @Test
    void test() {
//        assertEquals("w",
//                solution.minRemoveToMakeValid(")())()(())))()())))(w"));
        assertEquals("a(b(c)d)",
                solution.minRemoveToMakeValid("(a(b(c)d)"));
        assertEquals("",
                solution.minRemoveToMakeValid(""));
        assertEquals("lee(t(c)o)de",
                solution.minRemoveToMakeValid("lee(t(c)o)de)"));
        assertEquals("",
                solution.minRemoveToMakeValid("(("));
        assertEquals("",
                solution.minRemoveToMakeValid("))"));

    }
}