package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P844_BackspaceStringCompareTest {
    P844_BackspaceStringCompare.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P844_BackspaceStringCompare().new Solution();
    }

    @Test
    void backspaceCompare() {
        String s = "ab#c";
        String t = "ad#c";

//        assertEquals(true,
//                solution.backspaceCompare(s,t));
        assertEquals(true,
                solution.backspaceCompare("ab##","c#d#"));
        assertEquals(false,
                solution.backspaceCompare("a#c","b"));


    }
}