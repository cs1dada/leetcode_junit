package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P3_LongestSubstringWithoutRepeatingCharactersTest {

    P3_LongestSubstringWithoutRepeatingCharacters.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P3_LongestSubstringWithoutRepeatingCharacters().new Solution();
    }

    @Test
    void test() {

        assertEquals(3,
                solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1,
                solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3,
                solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1,
                solution.lengthOfLongestSubstring("aa"));

    }
}