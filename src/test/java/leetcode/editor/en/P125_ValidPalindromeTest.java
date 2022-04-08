package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P125_ValidPalindromeTest {

    P125_ValidPalindrome.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P125_ValidPalindrome().new Solution();
    }
    @Test
    void test() {
        assertEquals(true,
                solution.isPalindrome(".,"));
        assertEquals(true,
                solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(true,
                solution.isPalindrome(" "));

    }
}